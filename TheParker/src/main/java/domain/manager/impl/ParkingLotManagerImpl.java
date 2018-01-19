/**
 * 
 */
package domain.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.manager.ParkingLotManager;
import domain.model.MainInfo;
import domain.model.ParkedVehicle;
import domain.model.ParkingCell;
import domain.model.Vehicle;
import infrastructure.dao.ParkingLotDao;

/**
 * @author juan.salazar
 *
 */
@Service
public class ParkingLotManagerImpl implements ParkingLotManager {
	
	@Autowired
	private ParkingLotDao parkingLotDao;

	@Override
	public ParkedVehicle getVehicle(Vehicle vehicle) {
		return parkingLotDao.getVehicle(vehicle);
	}

	@Override
	public ParkedVehicle getVehicle(ParkingCell cell) {
		return parkingLotDao.getVehicle(cell);
	}

	@Override
	public List<MainInfo> getMainInfo() {
		return parkingLotDao.getMainInfo();
	}

}
