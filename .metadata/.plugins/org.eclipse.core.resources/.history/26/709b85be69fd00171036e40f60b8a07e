/**
 * 
 */
package infrastructure.dao;

import java.util.List;

import domain.model.MainInfo;
import domain.model.Response;

/**
 * @author juan.salazar
 *
 */
public interface AutoUpdateDao {
	
	/**
	 * Method to update the MainInfo table information
	 * @param mainInfo
	 * @return
	 */
	Response updateSummary(MainInfo mainInfo);
	
	/**
	 * Method to get the current occupation
	 * @param type
	 * @return
	 */
	Integer getCurrentOccupation(String type);
	
	/**
	 * Method to get money to pay
	 * @param type
	 * @return
	 */
	List<Long> getMoneyToPay(String type);
	
	/**
	 * Method to get the payed money
	 * @param type
	 * @return
	 */
	List<Long> getMoneyPayed(String type);

}
