/**
 * 
 */
package domain.manager;

import java.util.List;

import domain.model.ParkedVehicle;
import domain.model.Response;

/**
 * @author juan.salazar
 *
 */
public interface AutoUpdateManager {
	
	Response updateMainInfo();
	
	List<ParkedVehicle> updateStatusInfo();

}
