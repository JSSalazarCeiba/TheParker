/**
 * 
 */
package co.com.ceiba.theparker.domain.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ceiba.theparker.domain.manager.AutoUpdateManager;
import co.com.ceiba.theparker.domain.model.MainInfo;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.Response;
import co.com.ceiba.theparker.domain.utility.Constants;
import co.com.ceiba.theparker.infrastructure.dao.AutoUpdateDao;

/**
 * @author juan.salazar
 *
 */
@Service
public class AutoUpdateManagerImpl implements AutoUpdateManager {
	
	@Autowired
	AutoUpdateDao autoUpdateDao;

	@Override
	public Response updateMainInfo() {
		MainInfo mainInfoCars = getMainInfoCars();
		updateSummary(mainInfoCars);
		MainInfo mainInfoMotorcycles = getMainInfoMotorcycles();
		updateSummary(mainInfoMotorcycles);
		MainInfo mainInfoMixed = getMainInfoMixed(mainInfoCars, mainInfoMotorcycles);
		updateSummary(mainInfoMixed);
		return null;
	}

	@Override
	public List<ParkedVehicle> updateStatusInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* PRIVATE METHODS */

	public MainInfo getMainInfoCars() {
		String type = Constants.CAR;
		Integer currentOccupation = getCurrentOccupation(type);
		Integer totalCapacity = Constants.CAR_CELLS;
		Long toPay = getMoneyToPay(type);
		Long payed = getMoneyPayed(type);
		return new MainInfo(type, currentOccupation, totalCapacity, toPay, payed);
	}
	
	public MainInfo getMainInfoMotorcycles() {
		String type = Constants.MOTORCYCLE;
		Integer currentOccupation = getCurrentOccupation(type);
		Integer totalCapacity = Constants.MOTORCYCLE_CELLS;
		Long toPay = getMoneyToPay(type);
		Long payed = getMoneyPayed(type);
		return new MainInfo(type, currentOccupation, totalCapacity, toPay, payed);
	}
	
	public MainInfo getMainInfoMixed(MainInfo mainInfoCars, MainInfo mainInfoMotorcycles) {
		String type = Constants.VEHICLE;
		Integer currentOccupation = mainInfoCars.getCurrentOcuppation() + 
				mainInfoMotorcycles.getCurrentOcuppation();
		Integer totalCapacity = mainInfoCars.getTotalCapacity() +
				mainInfoMotorcycles.getTotalCapacity();
		Long toPay = mainInfoCars.getToPay() +
				mainInfoMotorcycles.getToPay();
		Long payed = mainInfoCars.getPayed() +
				mainInfoMotorcycles.getPayed();
		return new MainInfo(type, currentOccupation, totalCapacity, toPay, payed);
	}
	
	public Integer getCurrentOccupation(String type) {
		return autoUpdateDao.getCurrentOccupation(type);
	}
	
	public Long getMoneyToPay(String type) {
		List<Long> feeList = autoUpdateDao.getMoneyToPay(type);
		return getTotalMoney(feeList);
	}
	
	public Long getMoneyPayed(String type) {
		List<Long> feeList = autoUpdateDao.getMoneyPayed(type);
		return getTotalMoney(feeList);
	}
	
	public Long getTotalMoney(List<Long> feeList) {
		Long total = 0L;
		for (int i = 0; i < feeList.size(); i++) {
			total = total + feeList.get(i);
		}
		return total;
	}
	
	@Transactional
	public Response updateSummary(MainInfo mainInfo) {
		return autoUpdateDao.updateSummary(mainInfo);
	}

}
