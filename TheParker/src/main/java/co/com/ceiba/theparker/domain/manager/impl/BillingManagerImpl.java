/**
 * 
 */
package co.com.ceiba.theparker.domain.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ceiba.theparker.domain.manager.BillingManager;
import co.com.ceiba.theparker.domain.model.Bill;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.Vehicle;
import co.com.ceiba.theparker.domain.model.VehicleRecord;
import co.com.ceiba.theparker.infrastructure.dao.BillingDao;
import co.com.ceiba.theparker.infrastructure.dao.ParkingLotDao;

/**
 * Implementation of the BillManager class
 * 
 * @author juan.salazar
 * 
 */
@Service
public class BillingManagerImpl implements BillingManager {

	@Autowired
	ParkingLotDao parkingLotDao;
	@Autowired
	BillingDao billingDao;

	/*
	 * Bill generation method> 1. Get parked vehicle 2. Get vehicle record 3.
	 * Generate the bill
	 */
	@Override
	public Bill generateBill(Vehicle vehicle) {

		// Get parking information to get time and debt
		ParkedVehicle parkedVehicle = getParkingInfo(vehicle);

		// Get vehicle record
		VehicleRecord vehicleRecord = getVehicleRecord(vehicle);

		// Generate the bill
		Bill bill = createBill(parkedVehicle, vehicleRecord);

		// Register bill
		registerBill(bill);

		return bill;
	}

	/***************************** PRIVATE ********************************/

	/*
	 * Get the most important information about the parked vehicle
	 */
	public ParkedVehicle getParkingInfo(Vehicle vehicle) {
		return parkingLotDao.getVehicle(vehicle);
	}

	/*
	 * Get the most important information about the vehicle's registration
	 */
	public VehicleRecord getVehicleRecord(Vehicle vehicle) {
		return parkingLotDao.getVehicleRecord(vehicle);
	}

	/*
	 * Bill generation
	 */
	public Bill createBill(ParkedVehicle parkedVehicle, VehicleRecord record) {
		return new Bill(null, record.getPlate(), record.getType(), record.getTimeIn(), record.getTimeOut(), parkedVehicle.getTime(),
				parkedVehicle.getChargedFee());
	}

	/*
	 * Bill registration method
	 */
	@Transactional
	public void registerBill(Bill bill) {
		billingDao.registerBill(bill);
	}

}
