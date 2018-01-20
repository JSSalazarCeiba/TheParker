/**
 * 
 */
package co.com.ceiba.theparker.domain.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ceiba.theparker.domain.manager.ParkingLotManager;
import co.com.ceiba.theparker.domain.model.MainInfo;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Vehicle;
import co.com.ceiba.theparker.infrastructure.dao.ParkingLotDao;

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
