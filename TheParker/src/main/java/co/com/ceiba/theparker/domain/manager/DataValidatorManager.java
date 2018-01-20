/**
 * 
 */
package co.com.ceiba.theparker.domain.manager;

import co.com.ceiba.theparker.domain.model.Car;
import co.com.ceiba.theparker.domain.model.Motorcycle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Plate;

/**
 * Interface to handle backend object validation
 * 
 * @author juan.salazar
 *
 */
public interface DataValidatorManager {

	/**
	 * Method to validate cars
	 * 
	 * @param car
	 * @return
	 */
	Plate validateVehicle(Car car);

	/**
	 * Method to validate motorcycles
	 * 
	 * @param motorcycle
	 * @return
	 */
	Plate validateVehicle(Motorcycle motorcycle);

	/**
	 * Method to validate parking cells
	 * 
	 * @param cell
	 * @return
	 */
	Boolean validateParkingCell(ParkingCell cell);

}
