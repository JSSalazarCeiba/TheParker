package co.com.ceiba.theparker.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Bill descriptor class
 * @author juan.salazar
 *
 */
@Entity
public class Bill implements Serializable {
	
	private static final long serialVersionUID = -2076257015945005018L;
	
	@Id
	private Long id;
	private String plate;
	private String type;
	private Date timeIn;
	private Date timeOut;
	private String parkedTime;
	private Long fee;
	
	public Bill(Long id, String plate, String type, Date timeIn, Date timeOut, String parkedTime, Long fee) {
		super();
		this.setId(id);
		this.setPlate(plate);
		this.setType(type);
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.parkedTime = parkedTime;
		this.fee = fee;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public String getParkedTime() {
		return parkedTime;
	}

	public void setParkedTime(String parkedTime) {
		this.parkedTime = parkedTime;
	}

	public Long getFee() {
		return fee;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

}
