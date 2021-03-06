/**
 * 
 */
package testDataBuilder;

import co.com.ceiba.theparker.domain.model.ParkedVehicle;

/**
 * @author juan.salazar
 *
 */
public class ParkedVehicleDataBuilder {

	private Long idParkedVehicle;
	private String idCell;
	private String plate;
	private String time;
	private Long chargedFee;

	public ParkedVehicleDataBuilder() {
		super();
		this.idParkedVehicle = 1L;
		this.idCell = "C04";
		this.plate = "MOM707";
		this.time = "0d 3h 5m";
		this.chargedFee = 3000L;
	}

	public ParkedVehicleDataBuilder withIdCell(String idCell) {
		this.idCell = idCell;
		return this;
	}

	public ParkedVehicleDataBuilder withPlate(String plate) {
		this.plate = plate;
		return this;
	}

	public ParkedVehicle build() {
		return new ParkedVehicle(this.idParkedVehicle, this.idCell, this.plate, this.time, this.chargedFee);
	}

}
