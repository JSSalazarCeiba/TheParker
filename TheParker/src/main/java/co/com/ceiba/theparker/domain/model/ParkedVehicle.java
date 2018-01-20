/**
 * 
 */
package co.com.ceiba.theparker.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Parked Vehicle Entity
 * @author juan.salazar
 *
 */
@Entity
public class ParkedVehicle implements Serializable {
	
	private static final long serialVersionUID = 5335933719159533869L;
	
	@Id
	private Long idParkedVehicle;
	private String idCell;
	private String plate;
	private String time;
	private Long chargedFee;
	
	public ParkedVehicle(Long idParkedVehicle, String idCell, String plate, String time, Long chargedFee) {
		super();
		this.idParkedVehicle = idParkedVehicle;
		this.idCell = idCell;
		this.plate = plate;
		this.time = time;
		this.chargedFee = chargedFee;
	}

	public Long getIdParkedVehicle() {
		return idParkedVehicle;
	}

	public void setIdParkedVehicle(Long idParkedVehicle) {
		this.idParkedVehicle = idParkedVehicle;
	}

	public String getIdCell() {
		return idCell;
	}

	public void setIdCell(String idCell) {
		this.idCell = idCell;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Long getChargedFee() {
		return chargedFee;
	}

	public void setChargedFee(Long chargedFee) {
		this.chargedFee = chargedFee;
	}

}
