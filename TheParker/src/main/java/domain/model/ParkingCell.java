/**
 * 
 */
package domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Parking Cell Entity
 * @author juan.salazar
 *
 */
@Entity
public class ParkingCell implements Serializable {
	
	private static final long serialVersionUID = 7268363872522152815L;
	
	@Id
	private String code;
	private String type;
	private String status;
	
	/**
	 * 
	 * @param code
	 * @param type
	 * @param status
	 */
	public ParkingCell(String code, String type, String status) {
		super();
		this.code = code;
		this.type = type;
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
