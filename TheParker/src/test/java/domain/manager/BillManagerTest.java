/**
 * 
 */
package domain.manager;

import org.junit.Before;
import org.mockito.Mock;

import co.com.ceiba.theparker.domain.manager.impl.BillingManagerImpl;

/**
 * @author juan.salazar
 *
 */
public class BillManagerTest {

	@Mock
	BillingManagerImpl billingManagerImpl;

	@Before
	public void setup() {
		billingManagerImpl = new BillingManagerImpl();
	}

	/*
	 * @Test public void generateBillTest() { // Arrange Car car = new
	 * CarDataBuilder().build();
	 * 
	 * // Act Bill bill = billingManagerImpl.generateBill(car);
	 * 
	 * // Assert assertNotNull("Bill not null", bill); }
	 * 
	 * @Test public void getParkingInfoTest() { // Arrange Vehicle vehicle = new
	 * VehicleDataBuilder().build();
	 * 
	 * // Act ParkedVehicle parkedVehicle =
	 * billingManagerImpl.getParkingInfo(vehicle);
	 * 
	 * // Assert assertNotNull("Parked vehicle info", parkedVehicle); }
	 * 
	 * @Test public void getVehicleRecordTest() { // Arrange Vehicle vehicle = new
	 * VehicleDataBuilder().build();
	 * 
	 * // Act VehicleRecord vehicleRecord =
	 * billingManagerImpl.getVehicleRecord(vehicle);
	 * 
	 * // Assert assertNotNull("Vehicle record", vehicleRecord); }
	 * 
	 * @Test public void createBillTest() { // Arrange ParkedVehicle parkedVehicle =
	 * new ParkedVehicleDataBuilder().build(); VehicleRecord vehicleRecord = new
	 * VehicleRecordDataBuilder().build();
	 * 
	 * // Act Bill bill = billingManagerImpl.createBill(parkedVehicle,
	 * vehicleRecord);
	 * 
	 * // Assert assertNotNull("Bill creation", vehicleRecord); }
	 */

}
