/**
 * 
 */
package co.com.ceiba.theparker.domain.model;

import java.io.Serializable;

/**
 * Motorcycle descriptor class
 * @author juan.salazar
 *
 */
public class Motorcycle extends Vehicle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8205536051025596102L;
	private Integer cc;

	public Motorcycle(String plate, String type, Integer cc) {
		super(plate, type);
		this.cc = cc;
	}
	
	public Integer getCc() {
		return cc;
	}

	public void setCc(Integer cc) {
		this.cc = cc;
	}

}
