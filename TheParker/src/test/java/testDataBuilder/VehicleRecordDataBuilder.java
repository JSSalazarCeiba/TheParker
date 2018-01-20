/**
 * 
 */
package testDataBuilder;

import java.util.Date;

import co.com.ceiba.theparker.domain.model.Vehicle;
import co.com.ceiba.theparker.domain.model.VehicleRecord;

/**
 * @author juan.salazar
 *
 */
public class VehicleRecordDataBuilder {

	private Long id;
	private String plate;
	private String type;
	private Integer cc;
	private Date timeIn;
	private Date timeOut;
	private Long fee;
	private String active;

	public VehicleRecordDataBuilder() {
		super();
		this.id = 10L;
		this.plate = "MBD123";
		this.type = "car";
		this.cc = null;
		this.timeIn = new Date();
		this.timeOut = null;
		this.fee = null;
		this.active = "YES";
	}

	public VehicleRecord build() {
		return new VehicleRecord(this.id, this.plate, this.type, this.cc, this.timeIn, this.timeOut, this.fee, this.active);
	}

}
