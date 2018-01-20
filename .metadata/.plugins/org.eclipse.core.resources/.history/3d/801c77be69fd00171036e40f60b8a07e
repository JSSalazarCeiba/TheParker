/**
 * 
 */
package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.manager.VigilantManager;
import domain.model.Car;
import domain.model.Motorcycle;
import domain.model.Response;
import domain.model.Vehicle;
import domain.utility.Constants;

/**
 * @author juan.salazar
 *
 */
@RestController
@RequestMapping(value="/rest/vigilant")
public class VigilantService {
	
	@Autowired
	VigilantManager vigilantManager;
	
	@PostMapping(path="/carIn", consumes="application/json")
	public Response registerVehicleIn(Car vehicle) {
		Response response;
		try {
			response = vigilantManager.registerVehicleIn(vehicle);
		} catch(Exception e) {
			e.printStackTrace();
			response = new Response(Constants.STATUS_ERROR_SERVER, Constants.STATUS_ERROR_SERVER_MESSAGE);
		}
		return response;
	}
	
	@PostMapping(path="/motorcycleIn", consumes="application/json")
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
	
	@PostMapping(path="/vehicleOut", consumes="application/json")
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
