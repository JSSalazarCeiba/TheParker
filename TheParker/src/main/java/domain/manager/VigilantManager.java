/**
 * 
 */
package domain.manager;

import domain.model.Car;
import domain.model.Motorcycle;
import domain.model.ParkedVehicle;
import domain.model.ParkingCell;
import domain.model.Response;
import domain.model.Vehicle;

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
