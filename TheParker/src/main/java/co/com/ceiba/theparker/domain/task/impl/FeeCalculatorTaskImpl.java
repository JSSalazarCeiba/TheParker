/**
 * 
 */
package co.com.ceiba.theparker.domain.task.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ceiba.theparker.domain.model.VehicleRecord;
import co.com.ceiba.theparker.domain.task.FeeCalculatorTask;
import co.com.ceiba.theparker.domain.utility.Constants;
import co.com.ceiba.theparker.infrastructure.dao.FeeCalculatorTaskDao;

/**
 * Implementation of the FeeCalculatorTask
 * @author juan.salazar
 *
 */
@Service
public class FeeCalculatorTaskImpl implements FeeCalculatorTask {
	
	@Autowired
	FeeCalculatorTaskDao feeCalculatorTaskDao;

	/*
	 * Method that calculates the current charged fee for all vehicles
	 * 
	 * (non-Javadoc)
	 * @see domain.task.FeeCalculatorTask#calculateChargedFee()
	 */
	@Override
	public void calculateChargedFee() {
		
		// Get active vehicles records
		List<VehicleRecord> vehicleRecords = getActiveVehicleRecord();
		
		// Find parking time and fee for each vehicle and register it
		for (VehicleRecord record: vehicleRecords) {
			Long parkingTime = findParkingTime(record);
			Double parkingHours = findParkingHours(parkingTime);
			String timeToShow = findParkingTimeToShow(parkingHours);
			Long fee = findFee(record, parkingHours.intValue());
			updateParkingTimeAndFee(timeToShow, fee, record);
		}
	}

	/*
	 * Method to get the list of vehicles currently parked 
	 * in the parking lot
	 */
	public List<VehicleRecord> getActiveVehicleRecord() {
		return feeCalculatorTaskDao.getActiveVehicleRecord();
	}
	
	/*
	 * Method to get the parking time for each vehicle
	 */
	public Long findParkingTime(VehicleRecord record) {
		Date currentTime = new Date();
		return currentTime.getTime() - record.getTimeIn().getTime();
	}
	
	/*
	 * Method to get the parking hours for each vehicle
	 */
	public Double findParkingHours(Long parkingTime) {
		return (parkingTime * Constants.HOURS_PER_MS);
	}
	
	/*
	 * Method to get the parking time in human readable format
	 */
	public String findParkingTimeToShow(Double parkingHours) {
		Integer days = findDays(parkingHours);
		Integer hours = findHours(parkingHours, days);
		Integer minutes = findMinutes(parkingHours, days, hours);
		return days + "d " + hours + "h " + minutes + "m";
	}
	
	/*
	 * Method to find the parking days
	 */
	public Integer findDays(Double parkingHours) {
		return (int) (parkingHours/Constants.HOURS_PER_DAY);
	}
	
	/*
	 * Method to find the parking hours
	 */
	public Integer findHours(Double parkingHours, Integer days) {
		return (int) (parkingHours - (days * Constants.HOURS_PER_DAY));
	}
	
	/*
	 * Method to find the parking minutes
	 */
	public Integer findMinutes(Double parkingHours, Integer days, Integer hours) {
		return (int) ((parkingHours - hours - 
				(days * Constants.HOURS_PER_DAY)) * Constants.MINUTES_PER_HOUR);
	}
	
	/*
	 * Method to get the fee depending on the parking hours
	 */
	public Long findFee(VehicleRecord record, Integer parkingHours) {
		Long fee = 0L;
		if (parkingHours < Constants.HOURS_FARE_LIMIT) {
			fee = findFeeByVehicleType(record, parkingHours, Constants.HOUR_RATE);
		} else if (parkingHours >= Constants.HOURS_FARE_LIMIT &&
				parkingHours < Constants.DAYS_FARE_LIMIT) {
			fee = findFeeByVehicleType(record, parkingHours, Constants.DAY_RATE);
		} else if (parkingHours >= Constants.DAYS_FARE_LIMIT) {
			fee = findFeeByVehicleType(record, parkingHours, Constants.MIXED_RATE);
		}
		return fee;
	}
	
	/*
	 * Method to get the fee based on the vehicle type
	 */
	
	public Long findFeeByVehicleType(VehicleRecord record, Integer parkingHours, String rate) {
		Long fee = 0L;
		String vehicleType = record.getType();
		if (vehicleType.equals(Constants.CAR)) {
			fee = findFeeCar(parkingHours, rate);
		} else if (vehicleType.equals(Constants.MOTORCYCLE)) {
			fee = findFeeMotorcycle(parkingHours, rate, record.getCc());
		}
		return fee;
	}
	
	/*
	 * Method to get the fee for cars
	 */
	public Long findFeeCar(Integer parkingHours, String rate) {
		Long fee = 0L;
		switch (rate) {
		case Constants.HOUR_RATE:
			fee = (long) (parkingHours * Constants.HOUR_FARE_CAR);
			break;
		case Constants.DAY_RATE:
			fee = (long) Constants.DAY_FARE_CAR;
			break;
		case Constants.MIXED_RATE:
			fee = findMixedFeeCar(parkingHours);
			break;
		default:
			break;
		}
		return fee;
	}
	
	/*
	 * Method to get the fee for motorcycles
	 */
	public Long findFeeMotorcycle(Integer parkingHours, String rate, Integer cc) {
		Long fee = 0L;
		switch (rate) {
		case Constants.HOUR_RATE:
			fee = (long) (parkingHours * Constants.HOUR_FARE_MOTORCYCLE);
			break;
		case Constants.DAY_RATE:
			fee = (long) Constants.DAY_FARE_MOTORCYCLE;
			break;
		case Constants.MIXED_RATE:
			fee = findMixedFeeMotorcycle(parkingHours);
			break;
		default:
			break;
		}
		if (cc > Constants.FARE_LIMIT_CC_MOTORCYCLE) {
			fee = fee + Constants.FARE_LIMIT_CC_MOTORCYCLE;
		}
		return fee;
	}
	
	/*
	 * Method to get complex fees for cars
	 */
	public Long findMixedFeeCar(Integer parkingHours) {
		Long fee = 0L;
		Integer days = findNumberOfDays(parkingHours);
		Integer remainingHours = findRemainingHours(parkingHours, days);
		if (remainingHours < Constants.HOURS_FARE_LIMIT) {
			fee = (long) (days * Constants.DAY_FARE_CAR) + 
					(remainingHours * Constants.HOUR_FARE_CAR);
		} else if (remainingHours >= Constants.HOURS_FARE_LIMIT) {
			fee = (long) ((days + 1) * Constants.DAY_FARE_CAR);
		}
		return fee;
	}
	
	/*
	 * Method to get complex fees for motorcycles
	 */
	public Long findMixedFeeMotorcycle(Integer parkingHours) {
		Long fee = 0L;
		Integer days = findNumberOfDays(parkingHours);
		Integer remainingHours = findRemainingHours(parkingHours, days);
		if (remainingHours < Constants.HOURS_FARE_LIMIT) {
			fee = (long) (days * Constants.DAY_FARE_MOTORCYCLE) + 
					(remainingHours * Constants.HOUR_FARE_MOTORCYCLE);
		} else if (remainingHours >= Constants.HOURS_FARE_LIMIT) {
			fee = (long) ((days + 1) * Constants.DAY_FARE_MOTORCYCLE);
		}
		return fee;
	}
	
	/*
	 * Method to find the number of days parked
	 */
	public Integer findNumberOfDays(Integer parkingHours) {
		return parkingHours/Constants.DAYS_FARE_LIMIT;
	}
	
	/*
	 * Method to find the number of remaining hours parked:
	 * Discounting the days
	 */
	public Integer findRemainingHours(Integer parkingHours, Integer days) {
		return parkingHours - (days * Constants.DAYS_FARE_LIMIT);
	}
	
	/*
	 * Method to update the parking time and fee for a vehicle
	 */
	@Transactional
	public void updateParkingTimeAndFee(String timeToShow, Long fee, VehicleRecord record) {
		feeCalculatorTaskDao.updateParkingTimeAndFee(timeToShow, fee, record);
	}
	
}
