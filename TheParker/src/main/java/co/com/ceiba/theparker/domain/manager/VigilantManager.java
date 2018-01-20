/**
 * 
 */
package co.com.ceiba.theparker.domain.manager;

import co.com.ceiba.theparker.domain.model.Car;
import co.com.ceiba.theparker.domain.model.Motorcycle;
import co.com.ceiba.theparker.domain.model.Response;
import co.com.ceiba.theparker.domain.model.Vehicle;

/**
 * Class to handle Vigilant's functions
 * @author juan.salazar
 *
 */
public interface VigilantManager {
	
	/**
	 * Method to register the cars that enter into the parking lot
	 * @param vehicle
	 */
	Response registerVehicleIn(Car vehicle);
	
	/**
	 * Method to register the motorcycles that enter into the parking lot
	 * @param vehicle
	 */
	Response registerVehicleIn(Motorcycle vehicle);
	
	/**
	 * Method to register the vehicles that leave the parking lot
	 * @param vehicle
	 */
	Response registerVehicleOut(Vehicle vehicle);
	
}
