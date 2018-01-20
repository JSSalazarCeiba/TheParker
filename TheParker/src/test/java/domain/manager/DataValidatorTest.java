/**
 * 
 */
package domain.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import co.com.ceiba.theparker.domain.manager.impl.DataValidatorManagerImpl;
import co.com.ceiba.theparker.domain.model.Car;
import co.com.ceiba.theparker.domain.model.Motorcycle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Plate;
import co.com.ceiba.theparker.domain.utility.Constants;
import testDataBuilder.CarDataBuilder;
import testDataBuilder.MotorcycleDataBuilder;
import testDataBuilder.ParkingCellDataBuilder;

/**
 * @author juan.salazar
 *
 */
public class DataValidatorTest {
	
	DataValidatorManagerImpl dataValidatorManagerImpl;
	
	@Before
	public void setup() {
		dataValidatorManagerImpl = new DataValidatorManagerImpl();
		
		// Mockito fake object
		//emailServiceMock = Mockito.mock(EmailService.class);
	}

	@Test
	public void validateVehicleCarTest() {
		// Arrange
		Car car = new CarDataBuilder().build();
		
		// Act
		Plate plate = dataValidatorManagerImpl.validateVehicle(car);
		
		// Assert
		assertNotNull("Invalid car plate", plate);
	}
	
	@Test
	public void validateVehicleMotorcycleTest() {
		// Arrange
		Motorcycle motorcycle = new MotorcycleDataBuilder().build();
		
		// Act
		Plate plate = dataValidatorManagerImpl.validateVehicle(motorcycle);
		
		// Assert
		assertNotNull("Invalid motorcycle plate", plate);
	}
	
	@Test
	public void validateParkingCellTest() {
		// Arrange
		ParkingCell parkingCell = new ParkingCellDataBuilder().build();
		
		// Act
		Boolean validCell = dataValidatorManagerImpl.validateParkingCell(parkingCell);
		
		// Assert
		assertTrue("Parking cell true assert", validCell);
	}
	
	@Test
	public void validatePlateNotNullTest() {
		// Arrange
		String plate = "ABC123";
		
		// Act
		Boolean plateNotNull = dataValidatorManagerImpl.validatePlateNotNull(plate);
		
		// Assert
		assertTrue("Plate not null", plateNotNull);
	}
	
	@Test
	public void validatePlateLengthTest() {
		// Arrange
		String plate = "ABC123";
		
		// Act
		Boolean plateLengthValid = dataValidatorManagerImpl.validatePlateLength(plate);
		
		// Assert
		assertTrue("Plate length valid", plateLengthValid);
	}
	
	@Test
	public void getPlateTypeCarTest() {
		// Arrange
		Car car = new CarDataBuilder().build();
		
		// Act
		String plateType = dataValidatorManagerImpl.getPlateType(car);
		
		// Assert
		assertEquals("Regular plate type", Constants.REGULAR_PLATE, plateType);
	}
	
	@Test
	public void getPlateTypeMotorcycleTest() {
		// Arrange
		Motorcycle motorcycle = new MotorcycleDataBuilder().build();
		
		// Act
		String plateType = dataValidatorManagerImpl.getPlateType(motorcycle);
		
		// Assert
		assertEquals("Motorcycle plate type", Constants.MOTORCYCLE_PLATE, plateType);
	}
	
	@Test
	public void isRegularPlateTest() {
		// Arrange
		String plate = "MIR712";
		
		// Act
		Boolean isRegularPlate = dataValidatorManagerImpl.isRegularPlate(plate);
		
		// Assert
		assertTrue("Is regular plate", isRegularPlate);
	}
	
	@Test
	public void isDiplomaticPlateTest() {
		// Arrange
		String plate = "UR4712";
		
		// Act
		Boolean isDiplomaticPlate = dataValidatorManagerImpl.isDiplomaticPlate(plate);
		
		// Assert
		assertTrue("Is diplomatic plate", isDiplomaticPlate);
	}
	
	@Test
	public void isCargoPlateTest() {
		// Arrange
		String plate = "T5712";
		
		// Act
		Boolean isCargoPlate = dataValidatorManagerImpl.isCargoPlate(plate);
		
		// Assert
		assertTrue("Is cargo plate", isCargoPlate);
	}
	
	@Test
	public void isMotorcyclePlateTest() {
		// Arrange
		String plate = "RON45C";
		
		// Act
		Boolean isMotorcyclePlate = dataValidatorManagerImpl.isMotorcyclePlate(plate);
		
		// Assert
		assertTrue("Is motorcycle plate", isMotorcyclePlate);
	}
	
	@Test
	public void isAllowedPlateTest() {
		// Arrange
		String plate = "RON45C";
		
		// Act
		Boolean isAllowedPlate = dataValidatorManagerImpl.isAllowedPlate(plate);
		
		// Assert
		assertTrue("Is allowedPlate", isAllowedPlate);
	}
	
	@Test
	public void validateTypeNotNullTest() {
		// Arrange
		String vehicleType = "car";
		
		// Act
		Boolean typeNotNull = dataValidatorManagerImpl.validateTypeNotNull(vehicleType);
		
		// Assert
		assertNotNull("Vehicle type not null", typeNotNull);
	}
	
	@Test
	public void validateCcNotNullTest() {
		// Arrange
		Integer cc = 200;
		
		// Act
		Boolean ccNotNull = dataValidatorManagerImpl.validateCcNotNull(cc);
		
		// Assert
		assertNotNull("cc not null", ccNotNull);
	}
	
	@Test
	public void validateCcRealValueTest() {
		// Arrange
		Integer cc = 600;
		
		// Act
		Boolean ccRealValue = dataValidatorManagerImpl.validateCcRealValue(cc);
		
		// Assert
		assertTrue("real cc value", ccRealValue);
	}
	
	@Test
	public void validateCellCodeTest() {
		// Arrange
		ParkingCell parkingCell = new ParkingCellDataBuilder().build();
		
		// Act
		Boolean validCellCode = dataValidatorManagerImpl.validateCellCode(parkingCell);
		
		// Assert
		assertTrue("valid cell code", validCellCode);
	}
	
	@Test
	public void validateCellTypeTest() {
		// Arrange
		ParkingCell parkingCell = new ParkingCellDataBuilder().build();
		
		// Act
		Boolean validCellType = dataValidatorManagerImpl.validateCellType(parkingCell);
		
		// Assert
		assertTrue("valid cell type", validCellType);
	}
	
	@Test
	public void validateCellStatusTest() {
		// Arrange
		ParkingCell parkingCell = new ParkingCellDataBuilder().build();
		
		// Act
		Boolean validCellStatus = dataValidatorManagerImpl.validateCellStatus(parkingCell);
		
		// Assert
		assertTrue("valid cell status", validCellStatus);
	}
	
	@Test
	public void validateCarCellCodeTest() {
		// Arrange
		String cellCode = "C18";
		
		// Act
		Boolean validCarCellCode = dataValidatorManagerImpl.validateCarCellCode(cellCode);
		
		// Assert
		assertTrue("valid car cell code", validCarCellCode);
	}
	
	@Test
	public void validateMotorcycleCellCode() {
		// Arrange
		String cellCode = "M09";
		
		// Act
		Boolean validMotorcycleCellCode = dataValidatorManagerImpl.validateMotorcycleCellCode(cellCode);
		
		// Assert
		assertTrue("valid motorcycle cell code", validMotorcycleCellCode);
	}
	
	@Test
	public void beginsWithLetterATest() {
		// Arrange
		String plate = "APL850";
		
		// Act
		Boolean beginsWithA = dataValidatorManagerImpl.beginsWithLetterA(plate);
		
		// Assert
		assertTrue("Plate beggins with A", beginsWithA);
	}
	
	@Test
	public void beginsWithLetterAFalseTest() {
		// Arrange
		String plate = "TOR309";
		
		// Act
		Boolean beginsWithA = dataValidatorManagerImpl.beginsWithLetterA(plate);
		
		// Assert
		assertFalse("Plate beggins with A", beginsWithA);
	}

}
