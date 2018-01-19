/**
 * 
 */
package domain.manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import domain.manager.impl.BillingManagerImpl;
import domain.manager.impl.ParkingLotManagerImpl;
import domain.model.Bill;
import domain.model.Car;
import domain.model.ParkedVehicle;
import domain.model.Vehicle;
import domain.model.VehicleRecord;
import testDataBuilder.CarDataBuilder;
import testDataBuilder.ParkedVehicleDataBuilder;
import testDataBuilder.VehicleDataBuilder;
import testDataBuilder.VehicleRecordDataBuilder;

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
	@Test
	public void generateBillTest() {
		// Arrange
		Car car = new CarDataBuilder().build();
		
		// Act
		Bill bill = billingManagerImpl.generateBill(car);
		
		// Assert
		assertNotNull("Bill not null", bill);
	}
	
	@Test
	public void getParkingInfoTest() {
		// Arrange
		Vehicle vehicle = new VehicleDataBuilder().build();
		
		// Act
		ParkedVehicle parkedVehicle = billingManagerImpl.getParkingInfo(vehicle);
		
		// Assert
		assertNotNull("Parked vehicle info", parkedVehicle);
	}
	
	@Test
	public void getVehicleRecordTest() {
		// Arrange
		Vehicle vehicle = new VehicleDataBuilder().build();
		
		// Act
		VehicleRecord vehicleRecord = billingManagerImpl.getVehicleRecord(vehicle);
		
		// Assert
		assertNotNull("Vehicle record", vehicleRecord);
	}
	
	@Test
	public void createBillTest() {
		// Arrange
		ParkedVehicle parkedVehicle = new ParkedVehicleDataBuilder().build();
		VehicleRecord vehicleRecord = new VehicleRecordDataBuilder().build();
		
		// Act
		Bill bill =  billingManagerImpl.createBill(parkedVehicle, vehicleRecord);
		
		// Assert
		assertNotNull("Bill creation", vehicleRecord);
	}*/

}
