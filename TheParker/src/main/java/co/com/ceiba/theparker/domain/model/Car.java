/**
 * 
 */
package co.com.ceiba.theparker.domain.model;

import java.io.Serializable;

/**
 * Car descriptor class
 * @author juan.salazar
 *
 */
public class Car extends Vehicle implements Serializable {
	
	public Car() {
		super();
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1235369555043107545L;

	public Car(String plate, String type) {
		super(plate, type);
	}

}
