/**
 * 
 */
package domain.utility;

/**
 * @author juan.salazar
 *
 */
public class Queries {
	
	public static final String UPDATE_PARKINGCELL = "UPDATE PARKINGCELL SET STATUS = ?1 WHERE CODE = ?2";
	public static final String UPDATE_PARKEDVEHICLES_BY_PLATE = "UPDATE PARKEDVEHICLES SET PLATE = ?1 WHERE CODE_CELL = ?2";
	public static final String UPDATE_PARKEDVEHICLES_BY_CELL = "UPDATE PARKEDVEHICLES SET PARKING_TIME = ?1, CHARGED_FEE = ?2 WHERE PLATE = ?3";
	public static final String UPDATE_VEHICLERECORD = "UPDATE VEHICLERECORD SET TIME_OUT = ?1, FEE = ?2, ACTIVE = ?3 WHERE PLATE = ?4";
	public static final String UPDATE_MAININFO = "UPDATE MAININFO SET OCCUPATION = ?1, CAPACITY = ?2, TO_PAY = ?3, PAYED = ?4 WHERE TYPE = ?5";
	
	public static final String SELECT_PARKEDVEHICLES_BY_PLATE = "SELECT ID, CODE_CELL, PLATE, PARKING_TIME, CHARGED_FEE FROM PARKEDVEHICLES WHERE PLATE = ?";
	public static final String SELECT_PARKEDVEHICLES_BY_CELL = "SELECT ID, CODE_CELL, PLATE, PARKING_TIME, CHARGED_FEE FROM PARKEDVEHICLES WHERE CODE_CELL = ?";
	public static final String SELECT_VEHICLERECORD = "SELECT ID, PLATE, TYPE, CC, TIME_IN, TIME_OUT, FEE, ACTIVE FROM VehicleRecord WHERE PLATE = ?";
	public static final String SELECT_AVAILABLE_CELLS = "SELECT CODE, TYPE, STATUS FROM ParkingCell WHERE STATUS = 'FREE'";
	public static final String SELECT_CURRENT_CAPACITY = "SELECT COUNT(*) FROM PARKINGCELL WHERE STATUS = 'BUSY'";
	public static final String SELECT_TO_PAY = "SELECT CHARGED_FEE FROM PARKEDVEHICLES";
	public static final String SELECT_PAYED = "SELECT FREE FROM VEHICLERECORD WHERE TIME_IN >= CURDATE()-1";
}
