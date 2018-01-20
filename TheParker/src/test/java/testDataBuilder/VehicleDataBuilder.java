/**
 * 
 */
package testDataBuilder;

import co.com.ceiba.theparker.domain.model.Vehicle;

/**
 * @author juan.salazar
 *
 */
public class VehicleDataBuilder {

	private String plate;
	private String type;

	public VehicleDataBuilder() {
		super();
		this.plate = "MMQ835";
		this.type = "car";
	}

	public VehicleDataBuilder withPlate(String plate) {
		this.plate = plate;
		return this;
	}

	public VehicleDataBuilder withType(String type) {
		this.type = type;
		return this;
	}

	public Vehicle build() {
		return new Vehicle(this.plate, this.type);
	}

}
