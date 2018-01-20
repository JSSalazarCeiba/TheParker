/**
 * 
 */
package testDataBuilder;

import co.com.ceiba.theparker.domain.model.ParkingCell;

/**
 * @author juan.salazar
 *
 */
public class ParkingCellDataBuilder {

	private String code;
	private String type;
	private String status;

	public ParkingCellDataBuilder() {
		super();
		this.code = "C01";
		this.type = "CAR_CELL";
		this.status = "FREE";
	}

	public ParkingCellDataBuilder withCode(String code) {
		this.code = code;
		return this;
	}

	public ParkingCellDataBuilder withType(String type) {
		this.type = type;
		return this;
	}

	public ParkingCellDataBuilder withStatus(String status) {
		this.status = status;
		return this;
	}

	public ParkingCell build() {
		return new ParkingCell(this.code, this.type, this.status);
	}

}
