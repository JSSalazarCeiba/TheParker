/**
 * 
 */
package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.manager.BillingManager;
import domain.model.Bill;
import domain.model.Vehicle;

/**
 * @author juan.salazar
 *
 */
@RestController
@RequestMapping(value="/rest/billing")
public class BillingService {
	
	@Autowired
	BillingManager billingManager;
	
	@PostMapping(path="/generateBill", consumes="application/json", produces="application/json")
	public Bill generateBill(Vehicle vehicle) {
		Bill bill = new Bill(null, vehicle, null, null, null, null);
		try {
			bill = billingManager.generateBill(vehicle);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return bill;
	}

}
