/**
 * 
 */
package domain.utility;

/**
 * Constants class
 * @author juan.salazar
 *
 */
public class Constants {
	
	// Properties file
	public static final String PROPERTIES_FILE = "application.properties";
	
	// Entrance and exit gates
	public static final String OPEN_ENTRANCE = "open-entrance";
	public static final String CLOSE_ENTRANCE = "close-entrance";
	public static final String OPEN_EXIT = "open-exit";
	public static final String CLOSE_EXIT = "close-exit";
	
	// Vehicle types
	public static final String CAR = "car";
	public static final String MOTORCYCLE = "motorcycle";
	public static final String VEHICLE = "vehicle";
	
	// Cell types
	public static final String CAR_CELL = "CAR_CELL";
	public static final String MOTORCYCLE_CELL = "MOTORCYCLE_CELL";
	
	// Fare rates
	public static final String HOUR_RATE = "hour-rate";
	public static final String DAY_RATE = "day-rate";
	public static final String MIXED_RATE = "mixed-rate";
	
	// Parking cell status descriptors
	public static final String FREE = "FREE";
	public static final String BUSY = "BUSY";
	
	// Parking vehicle parking status descriptors
	public static final String ACTIVE = "S";
	public static final String INACTIVE = "N";
	
	// Parking lot capacity parameters
	public static final Integer CAR_CELLS = 20;
	public static final Integer MOTORCYCLE_CELLS = 10;
	
	// Parking lot fare parameters
	public static final Integer HOUR_FARE_CAR = 1000;
	public static final Integer HOUR_FARE_MOTORCYCLE = 500;
	public static final Integer DAY_FARE_CAR = 8000;
	public static final Integer DAY_FARE_MOTORCYCLE = 4000;
	public static final Integer EXTRA_FARE_HIGH_CC_MOTORCYCLE = 2000;
	
	// Parking lot rules parameters
	public static final Integer FARE_LIMIT_CC_MOTORCYCLE = 500;
	public static final Integer HOURS_FARE_LIMIT = 9;
	public static final Integer DAYS_FARE_LIMIT = 24;
	
	// Math parameters
	public static final Integer HOURS_PER_DAY = 24;
	public static final Integer MINUTES_PER_HOUR = 60;
	public static final Integer SECONDS_PER_MINUTE = 60;
	public static final Integer MS_PER_SECOND = 1000;
	public static final Double HOURS_PER_MS = 1.0 / (Constants.MS_PER_SECOND * 
			Constants.SECONDS_PER_MINUTE * Constants.MINUTES_PER_HOUR);
	
	// Validation parameters
	public static final Integer PLATE_MIN_LENGTH = 5;
	public static final Integer PLATE_MAX_LENGTH = 6;
	
	// Regex expressions
	public static final String REGEX_REGULAR_PLATE = "[A-Z][A-Z][A-Z]\\d\\d\\d";
	public static final String REGEX_DIPLOMATIC_PLATE = "[A-Z][A-Z]\\d\\d\\d\\d";
	public static final String REGEX_CARGO_PLATE = "[A-Z]\\d\\d\\d\\d";
	public static final String REGEX_MOTORCYCLE_PLATE = "[A-Z][A-Z][A-Z]\\d\\d[A-Z]";
	public static final String REGEX_CAR_CELL = "[C]([0-1][1-9]|[1-2][0])";
	public static final String REGEX_MOTORCYCLE_CELL = "[M]([0][1-9]|[1][0])";
	
	// Plate type
	public static final String REGULAR_PLATE = "regular-plate";
	public static final String DIPLOMATIC_PLATE = "diplomatic-plate";
	public static final String CARGO_PLATE = "cargo-plate";
	public static final String MOTORCYCLE_PLATE = "motorcycle-plate";
	public static final String INVALID_PLATE = "invalid-plate";
	public static final String FORBIDDEN_PLATE = "forbidden-plate";
	
	// Response
	public static final Integer STATUS_OK = 200;
	public static final Integer STATUS_ERROR_CLIENT = 400;
	public static final Integer STATUS_ERROR_SERVER = 500;
	public static final String STATUS_OK_MESSAGE = "Ok";
	public static final String STATUS_OK_PARKING_LOT_FULL_MESSAGE = "Parking lot full";
	public static final String STATUS_OK_ENTRY_PROHIBITED = "Ingreso prohibido";
	public static final String STATUS_ERROR_CLIENT_MESSAGE = "Error in client";
	public static final String STATUS_ERROR_SERVER_MESSAGE = "Error in server";
	
}
