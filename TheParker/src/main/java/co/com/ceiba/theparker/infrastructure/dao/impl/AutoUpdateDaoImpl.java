/**
 * 
 */
package co.com.ceiba.theparker.infrastructure.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.com.ceiba.theparker.domain.model.MainInfo;
import co.com.ceiba.theparker.domain.model.Response;
import co.com.ceiba.theparker.infrastructure.dao.AutoUpdateDao;

/**
 * @author juan.salazar
 *
 */
@Repository
public class AutoUpdateDaoImpl implements AutoUpdateDao {
	
	@Override
	public Response updateSummary(MainInfo mainInfo)  {
		return null;
	}

	@Override
	public Integer getCurrentOccupation(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Long> getMoneyToPay(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Long> getMoneyPayed(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
