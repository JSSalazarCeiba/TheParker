/**
 * 
 */
package co.com.ceiba.theparker.infrastructure.dao;

import java.sql.SQLException;
import java.util.List;

import co.com.ceiba.theparker.domain.model.MainInfo;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Response;
import co.com.ceiba.theparker.domain.model.Vehicle;
import co.com.ceiba.theparker.domain.model.VehicleRecord;

/**
 * Interface to handle parking lot information database operations
 * @author juan.salazar
 *
 */
public interface ParkingLotDao {
	
	/**
	 * Method to get the vehicle by plate and type
	 * @param vehicle
	 * @return
	 * @throws SQLException 
	 */
	ParkedVehicle getVehicle(Vehicle vehicle);
	
	/**
	 * Method to get the vehicle by parking cell
	 * @param cell
	 * @return
	 */
	ParkedVehicle getVehicle(ParkingCell cell);
	
	/**
	 * Method to get a vehicle's record
	 * @param vehicle
	 * @return
	 */
	VehicleRecord getVehicleRecord(Vehicle vehicle);
	
	/**
	 * Method to get the available parking cells by type
	 * @param vehicle
	 * @return
	 */
	List<ParkingCell> getAvailableParkingCells(Vehicle vehicle);
	
	/**
	 * Method to update the cell status in the table PARKING_CELL
	 * @param idCell
	 * @param status
	 */
	Response updateCellStatus(String idCell, String status);
	
	/**
	 * Method to update the table PARKED_VEHICLES
	 * @param parkedVehicle
	 */
	Response updateParkedVehicles(ParkedVehicle parkedVehicle);
	
	/**
	 * Method to get the main info used in the main screen of
	 * the user interface
	 * @return
	 */
	List<MainInfo> getMainInfo();
	
	/**
	 * Method to get the status info used in the status screen of
	 * the user interface
	 * @return
	 */
	List<ParkedVehicle> getStatusInfo();

}
