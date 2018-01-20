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
 * Bill descriptor class
 * @author juan.salazar
 *
 */
@Entity
@Table(name="Bills")
public class BillEntity implements Serializable {
	
	private static final long serialVersionUID = -618035262622707343L;
	
	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="PLATE")
	private String plate;
	@Column(name="TYPE")
	private String type;
	@Column(name="TIME_IN")
	private Date timeIn;
	@Column(name="TIME_OUT")
	private Date timeOut;
	@Column(name="PARKING_TIME")
	private String parkedTime;
	@Column(name="FEE")
	private Long fee;
	
	public BillEntity(Long id, String plate, String type, Date timeIn, Date timeOut, String parkedTime, Long fee) {
		super();
		this.setId(id);
		this.plate = plate;
		this.type = type;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.parkedTime = parkedTime;
		this.fee = fee;
	}
	
	@Id
	@TableGenerator(name="idBill", table="idBillPK", 
		pkColumnName="idBillColumn", pkColumnValue="idBillValue",
		allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="idBill")
	@Column(name="ID")
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

