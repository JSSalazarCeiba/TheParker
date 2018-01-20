/**
 * 
 */
package co.com.ceiba.theparker.domain.manager;

import co.com.ceiba.theparker.domain.model.Bill;
import co.com.ceiba.theparker.domain.model.Vehicle;

/**
 * Class to handle billing when vehicles leave the parking lot
 * @author juan.salazar
 *
 */
public interface BillingManager {
	
	/**
	 * Bill generator method
	 * 
	 * @param vehicle
	 * @return
	 */
	Bill generateBill(Vehicle vehicle);

}
