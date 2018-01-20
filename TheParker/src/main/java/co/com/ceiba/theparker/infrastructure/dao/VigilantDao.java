/**
 * 
 */
package co.com.ceiba.theparker.infrastructure.dao;

import java.util.Date;

import co.com.ceiba.theparker.domain.model.Car;
import co.com.ceiba.theparker.domain.model.Motorcycle;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Response;

/**
 * Interface to handle vigilant database operations
 * @author juan.salazar
 *
 */
public interface VigilantDao {
	
	/**
	 * Method to register cars that enter into the parking lot
	 * @param vehicle
	 * @param parkingCell
	 */
	Response registerVehicleIn(Car vehicle, ParkingCell parkingCell);
	
	/**
	 * Method to register motorcycles that enter into the parking lot
	 * @param vehicle
	 * @param parkingCell
	 */
	Response registerVehicleIn(Motorcycle vehicle, ParkingCell parkingCell);
	
	/**
	 * Method to update the registration record of vehicles that leave
	 * the parking lot
	 * @param timeOut
	 * @param fee
	 * @param active
	 */
	Response updateParkingRegistration(Date timeOut, ParkedVehicle parkedVehicle, String active);

}
