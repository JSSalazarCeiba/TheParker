/**
 * 
 */
package co.com.ceiba.theparker.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.theparker.domain.manager.VigilantManager;
import co.com.ceiba.theparker.domain.model.Car;
import co.com.ceiba.theparker.domain.model.Motorcycle;
import co.com.ceiba.theparker.domain.model.Response;
import co.com.ceiba.theparker.domain.model.Vehicle;
import co.com.ceiba.theparker.domain.utility.Constants;

/**
 * @author juan.salazar
 *
 */
@RestController
@RequestMapping(value="/vigilant")
public class VigilantService {
	
	@Autowired
	VigilantManager vigilantManager;
	
	@PostMapping(path="/carin")
	public Response registerVehicleIn(@RequestBody Car vehicle) {
		Response response;
		try {
			response = vigilantManager.registerVehicleIn(vehicle);
		} catch(Exception e) {
			e.printStackTrace();
			response = new Response(Constants.STATUS_ERROR_SERVER, Constants.STATUS_ERROR_SERVER_MESSAGE);
		}
		return response;
	}
	
	@PostMapping(path="/motorcyclein", consumes="application/json")
	public Response registerVehicleIn(Motorcycle vehicle) {
		Response response;
		try {
			response = vigilantManager.registerVehicleIn(vehicle);
		} catch(Exception e) {
			e.printStackTrace();
			response = new Response(Constants.STATUS_ERROR_SERVER, Constants.STATUS_ERROR_SERVER_MESSAGE);
		}
		return response;
	}
	
	@PostMapping(path="/vehicleout", consumes="application/json")
	public Response registerVehicleOut(Vehicle vehicle) {
		Response response;
		try {
			response = vigilantManager.registerVehicleOut(vehicle);
		} catch(Exception e) {
			e.printStackTrace();
			response = new Response(Constants.STATUS_ERROR_SERVER, Constants.STATUS_ERROR_SERVER_MESSAGE);
		}
		return response;
	}

}
