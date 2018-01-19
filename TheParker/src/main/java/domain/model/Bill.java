package domain.model;

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
	private Vehicle vehicle;
	private Date timeIn;
	private Date timeOut;
	private String parkedTime;
	private Long fee;
	
	public Bill(Long id, Vehicle vehicle, Date timeIn, Date timeOut, String parkedTime, Long fee) {
		super();
		this.setId(id);
		this.vehicle = vehicle;
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
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
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

}
