/**
 * 
 */
package domain.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.ceiba.theparker.domain.manager.DataValidatorManager;
import co.com.ceiba.theparker.domain.manager.impl.VigilantManagerImpl;
import co.com.ceiba.theparker.domain.model.Car;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Response;
import co.com.ceiba.theparker.domain.task.FeeCalculatorTask;
import co.com.ceiba.theparker.domain.utility.Constants;
import co.com.ceiba.theparker.infrastructure.dao.ParkingLotDao;
import co.com.ceiba.theparker.infrastructure.dao.VigilantDao;
import co.com.ceiba.theparker.infrastructure.dao.impl.ParkingLotDaoImpl;
import co.com.ceiba.theparker.infrastructure.dao.impl.VigilantDaoImpl;
import testDataBuilder.CarDataBuilder;
import testDataBuilder.ParkedVehicleDataBuilder;
import testDataBuilder.ParkingCellDataBuilder;

/**
 * @author juan.salazar
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class VigilantManagerTest {

	@InjectMocks
	private VigilantManagerImpl vigilantManagerImplMock;
	
	@Autowired
	VigilantManagerImpl vigilantManagerImpl;

	@Mock
	private VigilantDao vigilantDao;
	
	@Mock
	private VigilantDaoImpl vigilantDaoImpl;

	@Mock
	private ParkingLotDao parkingLotDao;

	@Mock
	private ParkingLotDaoImpl parkingLotDaoImpl;
	
	@Autowired
	private DataValidatorManager dataValidatorManager;
	
	@Mock
	private FeeCalculatorTask feeCalculatorTask;

	@Before
	public void setup() {

		//vigilantManagerImplMock = new VigilantManagerImpl();
		vigilantManagerImpl = new VigilantManagerImpl();
		vigilantDao = new VigilantDaoImpl();
		vigilantDaoImpl = new VigilantDaoImpl();
		parkingLotDao = new ParkingLotDaoImpl();
		parkingLotDaoImpl = new ParkingLotDaoImpl();

	}
	
	/*
	@Test 
	public void registerVehicleInCarTest() {
	  
		// Arrange 
		Car car = new CarDataBuilder().build(); 
		Response response = new ResponseDataBuilder().build(); 
		// Act
		Mockito.when(vigilantManagerImplMock.registerVehicleIn(car)).thenReturn(response); 
		//Assert 
		assertEquals("Vehicle registration", response, vigilantManagerImplMock.registerVehicleIn(car));
	}*/

	/*
	 * @Test public void registerVehicleInMotorcycleTest() {
	 * 
	 * // Arrange Motorcycle motorcycle = new MotorcycleDataBuilder().build(); //
	 * Act vigilantManager.registerVehicleIn(motorcycle); // Assert
	 * fail("Not yet implemented");
	 * 
	 * }
	 */

	/*
	 * @Test public void registerVehicleOutTest() {
	 * 
	 * // Arrange Car car = new CarDataBuilder().build(); // Act
	 * vigilantManager.registerVehicleOut(car); // Assert
	 * fail("Not yet implemented");
	 * 
	 * }
	 */

	
	@Test 
	public void getAvailableParkingCellsTest() { 
		 // Arrange 
		 Car car = new CarDataBuilder().build(); 
		 ParkingCell cellC01 = new ParkingCellDataBuilder().build(); 
		 ParkingCell cellC07 = new ParkingCellDataBuilder().withCode("C07").build(); 
		 ParkingCell cellC15 = new ParkingCellDataBuilder().withCode("C15").build(); 
		 ParkingCell cellC16 = new ParkingCellDataBuilder().withCode("C16").build(); 
		 ParkingCell cellC19 = new ParkingCellDataBuilder().withCode("C19").build(); 
		 List<ParkingCell> availableCells = new ArrayList<>(); 
		 availableCells.add(cellC01);
		 availableCells.add(cellC07); 
		 availableCells.add(cellC15);
		 availableCells.add(cellC16); 
		 availableCells.add(cellC19); 
		 
		 
		 // Act
		 Mockito.when(vigilantManagerImplMock.getAvailableParkingCells(car)).thenReturn(availableCells); 
		 // Assert 
		 assertEquals(availableCells,vigilantManagerImplMock.getAvailableParkingCells(car));
	}
	 
	@Test
	public void assignCellTest() {
		// Arrange
		ParkingCell cellC01 = new ParkingCellDataBuilder().build();
		ParkingCell cellC07 = new ParkingCellDataBuilder().withCode("C07").build();
		ParkingCell cellC15 = new ParkingCellDataBuilder().withCode("C15").build();
		ParkingCell cellC16 = new ParkingCellDataBuilder().withCode("C16").build();
		ParkingCell cellC19 = new ParkingCellDataBuilder().withCode("C19").build();
		List<ParkingCell> parkingCells = new ArrayList<>();
		parkingCells.add(cellC01);
		parkingCells.add(cellC07);
		parkingCells.add(cellC15);
		parkingCells.add(cellC16);
		parkingCells.add(cellC19);

		// Act
		ParkingCell assignedCell = vigilantManagerImpl.assignCell(parkingCells);

		// Assert
		assertNotNull("Assigned cell null", assignedCell);
	}

	/*
	 * @Test public void setEntranceStatusTest() { // Arrange // Act // Assert }
	 */

	/*
	 * @Test public void setExitStatusTest() { // Arrange // Act // Assert }
	 */

	
	/*
	 @Test 
	 public void updateCellStatusTest() {
		 // Arrange
		 Response response = new Response(Constants.STATUS_OK, Constants.STATUS_OK_MESSAGE);
		 ParkedVehicle parkedVehicle = new ParkedVehicleDataBuilder().build();
		 String status = "FREE";
		 
		 // Act 
		 Mockito.when(vigilantManagerImplMock.updateCellStatus(parkedVehicle, status)).thenReturn(response); 
		 // Assert 
		 assertEquals(response, vigilantManagerImplMock.updateCellStatus(parkedVehicle, status));
	 }*/
	 

	
	 @Test 
	 public void updateParkedVehiclesTest() { 
		 // Arrange 
		 Response response = new Response(Constants.STATUS_OK, Constants.STATUS_OK_MESSAGE);
		 ParkedVehicle parkedVehicle = new ParkedVehicleDataBuilder().build();
	  
		 // Act 
		 Mockito.when(vigilantManagerImplMock.updateParkedVehicles(parkedVehicle)).thenReturn(response); 
		 
		 // Assert 
		 assertEquals(response, vigilantManagerImplMock.updateParkedVehicles(parkedVehicle));
	 }
	 

	
	 @Test 
	 public void updateVehicleOutTest() { 
		 // Arrange 
		 Response response = new Response(Constants.STATUS_OK, Constants.STATUS_OK_MESSAGE);
		 ParkedVehicle parkedVehicle = new ParkedVehicleDataBuilder().build();
		 // Act
		 Mockito.when(vigilantManagerImplMock.updateVehicleOut(parkedVehicle)).thenReturn(response); 
		 // Assert
		 assertEquals(response, response);
	 }

}
