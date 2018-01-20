/**
 * 
 */
package co.com.ceiba.theparker.domain.manager;

import java.util.List;

import co.com.ceiba.theparker.domain.model.MainInfo;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Vehicle;

/**
 * @author juan.salazar
 *
 */
public interface ParkingLotManager {

	/**
	 * Method to get vehicle by plate and type
	 * 
	 * @param vehicle
	 * @return
	 */
	ParkedVehicle getVehicle(Vehicle vehicle);

	/**
	 * Method to get vehicle by cell
	 * 
	 * @param cell
	 * @return
	 */
	ParkedVehicle getVehicle(ParkingCell cell);

	List<MainInfo> getMainInfo();

}
