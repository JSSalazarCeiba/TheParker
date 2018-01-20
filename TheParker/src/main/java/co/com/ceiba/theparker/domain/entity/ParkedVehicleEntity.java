/**
 * 
 */
package co.com.ceiba.theparker.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Parked Vehicle Entity
 * @author juan.salazar
 *
 */
@Entity
@Table(name="ParkedVehicles")
public class ParkedVehicleEntity implements Serializable {
	
	private static final long serialVersionUID = -2656013853162272589L;
	
	@Id
	@Column(name="ID")
	private Long idParkedVehicle;
	@Column(name="CODE_CELL")
	private String idCell;
	@Column(name="PLATE")
	private String plate;
	@Column(name="PARKING_TIME")
	private String time;
	@Column(name="CHARGED_FEE")
	private Long chargedFee;
	
	public ParkedVehicleEntity(Long idParkedVehicle, String idCell, String plate, String time, Long chargedFee) {
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

