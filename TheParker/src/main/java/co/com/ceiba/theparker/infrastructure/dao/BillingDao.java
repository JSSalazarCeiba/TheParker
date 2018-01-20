/**
 * 
 */
package co.com.ceiba.theparker.infrastructure.dao;

import co.com.ceiba.theparker.domain.model.Bill;

/**
 * Interface to handle database operations related with bills
 * 
 * @author juan.salazar
 *
 */
public interface BillingDao {

	/**
	 * Bill registration method
	 * 
	 * @param bill
	 */
	void registerBill(Bill bill);

}
