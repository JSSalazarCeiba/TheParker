/**
 * 
 */
package co.com.ceiba.theparker.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Vehicle record entity
 * @author juan.salazar
 *
 */
@Entity
public class VehicleRecord implements Serializable {
	
	private static final long serialVersionUID = 6247607872159433721L;
	
	@Id
	private Long id;
	private String plate;
	private String type;
	private Integer cc;
	private Date timeIn;
	private Date timeOut;
	private Long fee;
	private String active;
	
	public VehicleRecord(Long id, String plate, String type, Integer cc, Date timeIn, Date timeOut, Long fee, String active) {
		super();
		this.id = id;
		this.plate = plate;
		this.type = type;
		this.cc = cc;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.fee = fee;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCc() {
		return cc;
	}

	public void setCc(Integer cc) {
		this.cc = cc;
	}

	public Date getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Date timeIn) {
		this.timeIn = timeIn;
	}

	public Date getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Date timeOut) {
		this.timeOut = timeOut;
	}

	public Long getFee() {
		return fee;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
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
