/**
 * 
 */
package testDataBuilder;

import co.com.ceiba.theparker.domain.model.Motorcycle;

/**
 * @author juan.salazar
 *
 */
public class MotorcycleDataBuilder {

	private String plate;
	private String type;
	private Integer cc;

	public MotorcycleDataBuilder() {
		super();
		this.plate = "RSP74B";
		this.type = "motorcycle";
		this.cc = 125;
	}

	public MotorcycleDataBuilder withPlate(String plate) {
		this.plate = plate;
		return this;
	}

	public MotorcycleDataBuilder withType(String type) {
		this.type = type;
		return this;
	}

	public MotorcycleDataBuilder withCc(Integer cc) {
		this.cc = cc;
		return this;
	}

	public Motorcycle build() {
		return new Motorcycle(this.plate, this.type, this.cc);
	}

}
