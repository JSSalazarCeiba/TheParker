/**
 * 
 */
package domain.model;

/**
 * Vehicle descriptor class
 * @author juan.salazar
 *
 */
public class Vehicle {
	
	private String plate;
	private String type;
	
	public Vehicle(String plate, String type) {
		super();
		this.plate = plate;
		this.type = type;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
