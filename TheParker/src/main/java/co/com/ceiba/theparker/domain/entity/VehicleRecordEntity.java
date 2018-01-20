/**
 * 
 */
package co.com.ceiba.theparker.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import co.com.ceiba.theparker.domain.model.Vehicle;

/**
 * Vehicle record entity
 * @author juan.salazar
 *
 */
@Entity
@Table(name="VehicleRecord")
public class VehicleRecordEntity implements Serializable {
	
	private static final long serialVersionUID = -3821326393751032031L;
	
	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="PLATE")
	private String plate;
	@Column(name="TYPE")
	private String type;
	@Column(name="CC")
	private Integer cc;
	@Column(name="TIME_IN")
	private Date timeIn;
	@Column(name="TIME_OUT")
	private Date timeOut;
	@Column(name="FEE")
	private Long fee;
	@Column(name="ACTIVE")
	private String active;
	
	public VehicleRecordEntity(Long id, String plate, String type, Integer cc, Date timeIn, Date timeOut, Long fee, String active) {
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
	
	@Id
	@TableGenerator(name="idVehicleRecord", table="idVehicleRecordPK", 
			pkColumnName="idVehicleRecordColumn", pkColumnValue="idVehicleRecordValue",
			allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="idVehicleRecord")
	@Column(name="ID")
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
