/**
 * 
 */
package co.com.ceiba.theparker.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.theparker.domain.manager.BillingManager;
import co.com.ceiba.theparker.domain.model.Bill;
import co.com.ceiba.theparker.domain.model.Vehicle;

/**
 * @author juan.salazar
 *
 */
@RestController
@RequestMapping(value = "/rest/billing")
public class BillingService {

	@Autowired
	BillingManager billingManager;

	@PostMapping(path = "/generateBill", consumes = "application/json", produces = "application/json")
	public Bill generateBill(Vehicle vehicle) {
		Bill bill = new Bill(null, vehicle.getPlate(), vehicle.getType(), null, null, null, null);
		try {
			bill = billingManager.generateBill(vehicle);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bill;
	}

}
