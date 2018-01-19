/**
 * 
 */
package infrastructure.dao;

import java.util.List;

import domain.model.VehicleRecord;

/**
 * Interface that handles database operations triggered by the fee calculator task
 * @author juan.salazar
 *
 */
public interface FeeCalculatorTaskDao {
	
	/**
	 * Method to get the list of the records of the vehicles
	 * that are currently parked in the parking lot
	 * @return
	 */
	List<VehicleRecord> getActiveVehicleRecord();
	
	/**
	 * Method to update the fields of parking time and charged fee
	 * for a given vehicle
	 * @param timeToShow
	 * @param fee
	 * @param record
	 */
	void updateParkingTimeAndFee(String timeToShow, Long fee, VehicleRecord record);

}
