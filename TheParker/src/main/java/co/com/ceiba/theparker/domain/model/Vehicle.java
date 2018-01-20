/**
 * 
 */
package co.com.ceiba.theparker.domain.model;

import java.io.Serializable;

/**
 * Vehicle descriptor class
 * @author juan.salazar
 *
 */
public class Vehicle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 443070856458372940L;

	/**
	 * 
	 */
	public Vehicle() {
		super();
	}

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
