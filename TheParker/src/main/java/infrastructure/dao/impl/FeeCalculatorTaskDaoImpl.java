/**
 * 
 */
package infrastructure.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.model.VehicleRecord;
import infrastructure.dao.FeeCalculatorTaskDao;

/**
 * Implementation of the class FeeCalculatorTaskDao
 * @author juan.salazar
 *
 */
@Repository
public class FeeCalculatorTaskDaoImpl implements FeeCalculatorTaskDao {
	
	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	
	/*
	 * Get the list of the active parked vehicles in the parking lot
	 * 
	 * (non-Javadoc)
	 * @see infrastructure.dao.FeeCalculatorTaskDao#getActiveVehicleRecord()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<VehicleRecord> getActiveVehicleRecord() {
		Query query = entityManager.createNativeQuery("CONSULTA", VehicleRecord.class);
		return query.getResultList();
	}

	@Override
	public void updateParkingTimeAndFee(String timeToShow, Long fee, VehicleRecord record) {
		Query query = entityManager.createNativeQuery("UPDATE");
		query.setParameter(1, timeToShow);
		query.setParameter(2, fee);
		query.setParameter(3, record.getVehicle().getPlate());
	}

}
