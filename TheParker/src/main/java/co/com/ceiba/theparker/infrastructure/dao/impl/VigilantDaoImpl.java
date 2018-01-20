/**
 * 
 */
package co.com.ceiba.theparker.infrastructure.dao.impl;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ceiba.theparker.domain.entity.VehicleRecordEntity;
import co.com.ceiba.theparker.domain.model.Car;
import co.com.ceiba.theparker.domain.model.Motorcycle;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Response;
import co.com.ceiba.theparker.domain.model.VehicleRecord;
import co.com.ceiba.theparker.domain.utility.Constants;
import co.com.ceiba.theparker.infrastructure.dao.VigilantDao;

/**
 * Implementation of the interface VigilantDao
 * @author juan.salazar
 *
 */
@Repository
public class VigilantDaoImpl implements VigilantDao {
	
	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	
	/*
	 * Method to create a record of cars that enter in the parking lot
	 * (non-Javadoc)
	 * @see infrastructure.dao.VigilantDao#registerVehicleIn(domain.model.Car, domain.model.ParkingCell)
	 */
	@Override
	public Response registerVehicleIn(Car vehicle, ParkingCell parkingCell) {
		VehicleRecordEntity record = new VehicleRecordEntity(null, vehicle.getPlate(), vehicle.getType(), null, null, null, null, null);
		record.setPlate(vehicle.getPlate());
		record.setType(vehicle.getType());
		record.setTimeIn(new Date());
		record.setActive("YES");
		Response response;
		try {
			entityManager.persist(record);
			response = new Response(Constants.STATUS_OK, Constants.STATUS_OK_MESSAGE);
		} catch(Exception e) {
			e.printStackTrace();
			response = new Response(Constants.STATUS_ERROR_SERVER, Constants.STATUS_ERROR_SERVER_MESSAGE);
		} finally {
			entityManager.flush();
		}
		return response;
	}
	
	/*
	 * Method to create a record of motorcycles that enter in the parking lot
	 * (non-Javadoc)
	 * @see infrastructure.dao.VigilantDao#registerVehicleIn(domain.model.Motorcycle, domain.model.ParkingCell)
	 */
	@Override
	public Response registerVehicleIn(Motorcycle vehicle, ParkingCell parkingCell) {
		VehicleRecord record = new VehicleRecord(null, vehicle.getPlate(), vehicle.getType(), null, null, null, null, null);
		record.setPlate(vehicle.getPlate());
		record.setType(vehicle.getType());
		record.setCc(vehicle.getCc());
		record.setTimeIn(new Date());
		record.setActive("YES");
		Response response;
		try {
			entityManager.persist(record);
			response = new Response(Constants.STATUS_OK, Constants.STATUS_OK_MESSAGE);
		} catch(Exception e) {
			e.printStackTrace();
			response = new Response(Constants.STATUS_ERROR_SERVER, Constants.STATUS_ERROR_SERVER_MESSAGE);
		} finally {
			entityManager.flush();
		}
		return response;
	}
	
	/*
	 * Method to update a vehicle's record when it is leaving the parking lot
	 * (non-Javadoc)
	 * @see infrastructure.dao.VigilantDao#updateParkingRegistration(java.util.Date, java.lang.Long, java.lang.String)
	 */
	@Override
	public Response updateParkingRegistration(Date timeOut, ParkedVehicle parkedVehicle, String active) {
		Query query = entityManager.createNativeQuery("UPDATE");
		query.setParameter(1, timeOut);
		query.setParameter(2, parkedVehicle.getChargedFee());
		query.setParameter(3, active);
		query.setParameter(4, parkedVehicle.getPlate());
		Response response;
		try {
			query.executeUpdate();
			response = new Response(Constants.STATUS_OK, Constants.STATUS_OK_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			response = new Response(Constants.STATUS_ERROR_SERVER, Constants.STATUS_ERROR_SERVER_MESSAGE);
		}
		return response;
		
	}

}
