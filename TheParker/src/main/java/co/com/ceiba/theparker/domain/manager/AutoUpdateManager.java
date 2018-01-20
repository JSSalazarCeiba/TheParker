/**
 * 
 */
package co.com.ceiba.theparker.domain.manager;

import java.util.List;

import co.com.ceiba.theparker.domain.model.ParkedVehicle;
import co.com.ceiba.theparker.domain.model.Response;

/**
 * @author juan.salazar
 *
 */
public interface AutoUpdateManager {
	
	Response updateMainInfo();
	
	List<ParkedVehicle> updateStatusInfo();

}
