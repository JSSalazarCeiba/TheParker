/**
 * 
 */
package domain.manager;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import co.com.ceiba.theparker.domain.manager.impl.ParkingLotManagerImpl;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Vehicle;
import co.com.ceiba.theparker.infrastructure.dao.ParkingLotDao;
import co.com.ceiba.theparker.infrastructure.dao.impl.ParkingLotDaoImpl;
import testDataBuilder.ParkedVehicleDataBuilder;
import testDataBuilder.ParkingCellDataBuilder;
import testDataBuilder.VehicleDataBuilder;

/**
 * @author juan.salazar
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ParkingLotManagerTest {

	@InjectMocks
	ParkingLotManagerImpl parkingLotManagerImpl;
	
	@Mock
	private ParkingLotDao parkingLotDao;

	@Before
	public void setup() {
		//parkingLotManagerImpl = new ParkingLotManagerImpl();
		parkingLotDao = new ParkingLotDaoImpl();
	}
	
	 @Test 
	 public void getVehicleByVehicleTest() { 
		 
		 // Arrange 
		 ParkedVehicle parkedVehicle = new ParkedVehicleDataBuilder().build();
		 Vehicle vehicle = new VehicleDataBuilder().build();
	 
		 // Act
		 Mockito.when(parkingLotManagerImpl.getVehicle(vehicle)).thenReturn(parkedVehicle);
	 
		 // Assert 
		 assertNotNull("Parked vehicle by plate null", parkingLotManagerImpl.getVehicle(vehicle)); 
	 }
	 
	 @Test 
	 public void getVehicleByCellTest() {
		 
		 // Arrange 
		 ParkedVehicle parkedVehicle = new ParkedVehicleDataBuilder().build();
		 ParkingCell parkingCell = new ParkingCellDataBuilder().build();
	 
		 // Act 
		 Mockito.when(parkingLotManagerImpl.getVehicle(parkingCell)).thenReturn(parkedVehicle);
	 
		 // Assert 
		 assertNotNull("Parked vehicle by cell null", parkingLotManagerImpl.getVehicle(parkingCell));
		 
	 }
	 

}