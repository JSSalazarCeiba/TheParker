/**
 * 
 */
package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.manager.ParkingLotManager;
import domain.model.ParkedVehicle;
import domain.model.ParkingCell;
import domain.model.Vehicle;

/**
 * @author juan.salazar
 *
 */
@RestController
@RequestMapping(value="/rest/parkingLot")
public class ParkingLotService {
	
	@Autowired
	ParkingLotManager parkingLotManager;
	
	@PostMapping(path="/getVehicleByPlate", consumes="application/json", produces="application/json")
	public ParkedVehicle getVehicle(Vehicle vehicle) {
		ParkedVehicle parkedVehicle = new ParkedVehicle(null, null, null, null, null);
		try {
			parkedVehicle = parkingLotManager.getVehicle(vehicle);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return parkedVehicle;
	}
	
	@PostMapping(path="/getVehicleByCell", consumes="application/json", produces="application/json")
	public ParkedVehicle getVehicle(ParkingCell cell) {
		ParkedVehicle parkedVehicle = new ParkedVehicle(null, null, null, null, null);
		try {
			parkedVehicle = parkingLotManager.getVehicle(cell);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return parkedVehicle;
	}

}
