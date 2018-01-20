/**
 * 
 */
package co.com.ceiba.theparker.infrastructure.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ceiba.theparker.domain.model.MainInfo;
import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.ParkingCell;
import co.com.ceiba.theparker.domain.model.Response;
import co.com.ceiba.theparker.domain.model.Vehicle;
import co.com.ceiba.theparker.domain.model.VehicleRecord;
import co.com.ceiba.theparker.domain.utility.Constants;
import co.com.ceiba.theparker.domain.utility.Queries;
import co.com.ceiba.theparker.infrastructure.dao.ParkingLotDao;

/**
 * Implementation of the interface ParkingLotDao
 * @author juan.salazar
 *
 */
@Repository
public class ParkingLotDaoImpl implements ParkingLotDao {
	
	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	
	/*
	 * Method to get a parked vehicle's information by plate and type
	 * (non-Javadoc)
	 * @see infrastructure.dao.ParkingLotDao#getVehicle(domain.model.Vehicle)
	 */
	@Override
	public ParkedVehicle getVehicle(Vehicle vehicle) {
		Query query = entityManager.createNativeQuery("CONSULTA", ParkedVehicle.class);
		query.setParameter(1, vehicle.getPlate());
		return (ParkedVehicle) query.getSingleResult();
	}
	
	/*
	 * Method to get a parked vehicle's information by cell
	 * (non-Javadoc)
	 * @see infrastructure.dao.ParkingLotDao#getVehicle(domain.model.ParkingCell)
	 */
	@Override
	public ParkedVehicle getVehicle(ParkingCell cell) {
		Query query = entityManager.createNativeQuery("CONSULTA", ParkedVehicle.class);
		query.setParameter(1, cell.getCode());
		return (ParkedVehicle) query.getSingleResult();
	}
	
	/*
	 * Method to get the list of available parking cells by type
	 * (non-Javadoc)
	 * @see infrastructure.dao.ParkingLotDao#getAvailableParkingCells(domain.model.Vehicle)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ParkingCell> getAvailableParkingCells(Vehicle vehicle) {
		Query query = entityManager.createNativeQuery(Queries.SELECT_AVAILABLE_CELLS, ParkingCell.class);
		return query.getResultList();
	}
	
	/*
	 * Method to get a vehicle's record
	 * (non-Javadoc)
	 * @see infrastructure.dao.ParkingLotDao#getVehicleRecord(domain.model.Vehicle)
	 */
	@Override
	public VehicleRecord getVehicleRecord(Vehicle vehicle) {
		Query query = entityManager.createNativeQuery("CONSULTA", VehicleRecord.class);
		query.setParameter(1, vehicle.getPlate());
		return (VehicleRecord) query.getSingleResult();
	}
	
	/*
	 * Method to update the PARKING_CELL table
	 * (non-Javadoc)
	 * @see infrastructure.dao.ParkingLotDao#updateCellStatus(java.lang.String, java.lang.String)
	 */
	@Override
	public Response updateCellStatus(String idCell, String status) {
		Query query = entityManager.createNativeQuery("UPDATE");
		query.setParameter(1, status);
		query.setParameter(2, idCell);
		Response response;
		try {
			query.executeUpdate();
			response = new Response(Constants.STATUS_OK, Constants.STATUS_OK_MESSAGE);
		} catch (Exception e) {
			response = new Response(Constants.STATUS_ERROR_SERVER, Constants.STATUS_ERROR_SERVER_MESSAGE);
		}
		return response;
	}
	
	/*
	 * Method to update the PARKED_VEHICLES table
	 * (non-Javadoc)
	 * @see infrastructure.dao.ParkingLotDao#updateParkedVehicles(domain.model.ParkedVehicle)
	 */
	@Override
	public Response updateParkedVehicles(ParkedVehicle parkedVehicle) {
		Query query = entityManager.createNativeQuery("UPDATE");
		query.setParameter(1, parkedVehicle.getPlate());
		query.setParameter(2, parkedVehicle.getIdCell());
		Response response;
		try {
			query.executeUpdate();
			response = new Response(Constants.STATUS_OK, Constants.STATUS_OK_MESSAGE);
		} catch (Exception e) {
			response = new Response(Constants.STATUS_ERROR_SERVER, Constants.STATUS_ERROR_SERVER_MESSAGE);
		}
		return response;
	}

	@Override
	public List<MainInfo> getMainInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ParkedVehicle> getStatusInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
