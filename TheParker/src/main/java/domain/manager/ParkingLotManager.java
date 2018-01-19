/**
 * 
 */
package domain.manager;

import domain.model.ParkedVehicle;
import domain.model.ParkingCell;
import domain.model.Vehicle;

/**
 * @author juan.salazar
 *
 */
public interface ParkingLotManager {
	
	/**
	 * Method to get vehicle by plate and type
	 * @param vehicle
	 * @return
	 */
	ParkedVehicle getVehicle(Vehicle vehicle);
	
	/**
	 * Method to get vehicle by cell
	 * @param cell
	 * @return
	 */
	ParkedVehicle getVehicle(ParkingCell cell);

}