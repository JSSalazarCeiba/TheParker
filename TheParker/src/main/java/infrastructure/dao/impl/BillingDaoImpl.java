/**
 * 
 */
package infrastructure.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.model.Bill;
import infrastructure.dao.BillingDao;

/**
 * Implementation of the interface BillingDao
 * @author juan.salazar
 *
 */
@Repository
public class BillingDaoImpl implements BillingDao {
	
	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	
	/*
	 * Bill registration method: Saves the generated bill in
	 * the tablle BILLS
	 * 
	 * (non-Javadoc)
	 * @see infrastructure.dao.BillingDao#registerBill(domain.model.Bill)
	 */
	@Override
	public void registerBill(Bill bill) {
		try {
			entityManager.persist(bill);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.flush();
		}
	}

}
