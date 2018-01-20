/**
 * 
 */
package domain.manager;

import org.junit.Before;
import org.mockito.Mock;

import co.com.ceiba.theparker.domain.manager.impl.ParkingLotManagerImpl;

/**
 * @author juan.salazar
 *
 */
public class ParkingLotManagerTest {

	@Mock
	ParkingLotManagerImpl parkingLotManagerImpl;

	@Before
	public void setup() {
		parkingLotManagerImpl = new ParkingLotManagerImpl();
	}

	/*** MISING MOCKS ***/

	/*
	 * @Test public void getVehicleByVehicleTest() { // Arrange Vehicle vehicle =
	 * new VehicleDataBuilder().build();
	 * 
	 * // Act ParkedVehicle parkedVehicle = parkingLotManager.getVehicle(vehicle);
	 * 
	 * // Assert assertNotNull("Parked vehicle by plate null", parkedVehicle); }
	 * 
	 * @Test public void getVehicleByCellTest() { // Arrange ParkingCell parkingCell
	 * = new ParkingCellDataBuilder().build();
	 * 
	 * // Act ParkedVehicle parkedVehicle =
	 * parkingLotManager.getVehicle(parkingCell);
	 * 
	 * // Assert assertNotNull("Parked vehicle by cell null", parkedVehicle); }
	 */

}
