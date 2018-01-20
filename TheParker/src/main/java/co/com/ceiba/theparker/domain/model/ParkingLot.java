/**
 * 
 */
package co.com.ceiba.theparker.domain.model;

import java.util.List;

/**
 * Parking lot descriptor
 * @author juan.salazar
 *
 */
public class ParkingLot {
	
	String vigilant;
	Boolean entranceOpened;
	Boolean exitOpened;
	List<ParkingCell> parkingCell;
	
	public ParkingLot(String vigilant, Boolean entranceOpened, Boolean exitOpened, List<ParkingCell> parkingCell) {
		super();
		this.vigilant = vigilant;
		this.entranceOpened = entranceOpened;
		this.exitOpened = exitOpened;
		this.parkingCell = parkingCell;
	}

	public String getVigilant() {
		return vigilant;
	}

	public void setVigilant(String vigilant) {
		this.vigilant = vigilant;
	}

	public Boolean getEntranceOpened() {
		return entranceOpened;
	}

	public void setEntranceOpened(Boolean entranceOpened) {
		this.entranceOpened = entranceOpened;
	}

	public Boolean getExitOpened() {
		return exitOpened;
	}

	public void setExitOpened(Boolean exitOpened) {
		this.exitOpened = exitOpened;
	}

	public List<ParkingCell> getParkingCell() {
		return parkingCell;
	}

	public void setParkingCell(List<ParkingCell> parkingCell) {
		this.parkingCell = parkingCell;
	}
	
}
