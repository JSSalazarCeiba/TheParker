/**
 * 
 */
package domain.task;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import co.com.ceiba.theparker.domain.manager.AutoUpdateManager;
import co.com.ceiba.theparker.domain.model.VehicleRecord;
import co.com.ceiba.theparker.domain.task.impl.FeeCalculatorTaskImpl;
import co.com.ceiba.theparker.infrastructure.dao.FeeCalculatorTaskDao;
import co.com.ceiba.theparker.infrastructure.dao.impl.FeeCalculatorTaskDaoImpl;
import testDataBuilder.VehicleRecordDataBuilder;

/**
 * @author juan.salazar
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class FeeCalculatorTaskTest {
	
	@InjectMocks
	FeeCalculatorTaskImpl feeCalculatorTaskImpl;
	
	@Mock
	AutoUpdateManager autoUpdateManager;
	
	@Mock
	FeeCalculatorTaskDao feeCalculatorTaskDao;
	
	@Before
	public void setup() {
		//parkingLotManagerImpl = new ParkingLotManagerImpl();
		feeCalculatorTaskDao = new FeeCalculatorTaskDaoImpl();
	}
	
	/*
	@Test
	private void getActiveVehicleRecordTest() {
		// Arrange
		List<VehicleRecord> records = new ArrayList<>();
		VehicleRecord record = new VehicleRecordDataBuilder().build();
		records.add(record);
		
		// Act
		Mockito.when(feeCalculatorTaskImpl.getActiveVehicleRecord()).thenReturn(records);
		
		// Assert
		assertNotNull(records);
	}*/
	
	@Test
	public void findParkingTimeTest() {
		// Arrange
		Date currentTime = new Date();
		VehicleRecord record = new VehicleRecordDataBuilder().build();
		// Act
		
		Long time = feeCalculatorTaskImpl.findParkingTime(record);
		
		// Assert
		assertNotNull(time);
	}
	
	@Test
	public void findParkingHoursTest() {
		// Arrange
		Long time = 30000000L;
		// Act
		Double hours = feeCalculatorTaskImpl.findParkingHours(time);
		// Assert
		assertNotNull(time);
	}
	
	@Test
	public void findParkingTimeToShowTest() {
		// Arrange
		Double hours = 10.5;
		// Assert
		String hoursShow = feeCalculatorTaskImpl.findParkingTimeToShow(hours);
		// Assert
		assertNotNull(hoursShow);
	}

}
