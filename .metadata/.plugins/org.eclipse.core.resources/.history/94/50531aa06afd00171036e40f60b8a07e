/**
 * 
 */
package testDataBuilder;

import domain.model.Car;

/**
 * @author juan.salazar
 *
 */
public class CarDataBuilder {
	
	private String plate;
	private String type;

	public CarDataBuilder() {
		super();
		this.plate="LOR701";
		this.type="car";
	}
	
	public CarDataBuilder withPlate(String plate) {
		this.plate = plate;
		return this;
	}
	
	public CarDataBuilder withType(String type) {
		this.type = type;
		return this;
	}
	
	public Car build() {
		return new Car(this.plate, this.type);
	}

}
