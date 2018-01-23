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

import co.com.ceiba.theparker.domain.manager.impl.BillingManagerImpl;
import co.com.ceiba.theparker.domain.model.Bill;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.Vehicle;
import co.com.ceiba.theparker.domain.model.VehicleRecord;
import co.com.ceiba.theparker.infrastructure.dao.BillingDao;
import co.com.ceiba.theparker.infrastructure.dao.ParkingLotDao;
import co.com.ceiba.theparker.infrastructure.dao.impl.BillingDaoImpl;
import co.com.ceiba.theparker.infrastructure.dao.impl.ParkingLotDaoImpl;
import testDataBuilder.ParkedVehicleDataBuilder;
import testDataBuilder.VehicleDataBuilder;
import testDataBuilder.VehicleRecordDataBuilder;

/**
 * @author juan.salazar
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class BillManagerTest {

	@InjectMocks
	BillingManagerImpl billingManagerImpl;
	
	@Mock
	ParkingLotDao parkingLotDao;
	
	@Mock
	BillingDao billingDao;

	@Before
	public void setup() {
		//billingManagerImpl = new BillingManagerImpl();
		parkingLotDao = new ParkingLotDaoImpl();
		billingDao = new BillingDaoImpl();
	}

	/*
	 * @Test public void generateBillTest() { // Arrange Car car = new
	 * CarDataBuilder().build();
	 * 
	 * // Act Bill bill = billingManagerImpl.generateBill(car);
	 * 
	 * // Assert assertNotNull("Bill not null", bill); }*/
	 
	 
	 
	 
	 @Test 
	 public void getParkingInfoTest() { 
		 // Arrange 
		 ParkedVehicle parkedVehicle = new ParkedVehicleDataBuilder().build();
		 Vehicle vehicle = new VehicleDataBuilder().build();
	  
		 // Act 
		 Mockito.when(billingManagerImpl.getParkingInfo(vehicle)).thenReturn(parkedVehicle);
	 
		 // Assert 
		 assertNotNull("Parked vehicle info", billingManagerImpl.getParkingInfo(vehicle)); 
	 }
	 
	 
	 @Test 
	 public void getVehicleRecordTest() { 
		 // Arrange 
		 VehicleRecord record = new VehicleRecordDataBuilder().build();
		 Vehicle vehicle = new VehicleDataBuilder().build();
	 
		 // Act 
		 Mockito.when(billingManagerImpl.getVehicleRecord(vehicle)).thenReturn(record);
	 
		 // Assert 
		 assertNotNull("Vehicle record", billingManagerImpl.getVehicleRecord(vehicle)); 
	 }
	  
	 
	 @Test 
	 public void createBillTest() { 
		 // Arrange 
		 ParkedVehicle parkedVehicle = new ParkedVehicleDataBuilder().build(); 
		 VehicleRecord vehicleRecord = new VehicleRecordDataBuilder().build();
	 
		 // Act 
		 Bill bill = billingManagerImpl.createBill(parkedVehicle,vehicleRecord);
	 
		 // Assert 
		 assertNotNull("Bill creation", bill); 
	 }
	 

}
