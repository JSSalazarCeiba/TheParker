/**
 * 
 */
package co.com.ceiba.theparker.domain.model;

/**
 * @author juan.salazar
 *
 */
public class Plate {
	
	private String plateCode;
	private String plateType;
	private Boolean valid;
	
	/**
	 * @param plateCode
	 * @param type
	 * @param valid
	 */
	public Plate(String plateCode, String plateType, Boolean valid) {
		super();
		this.plateCode = plateCode;
		this.plateType = plateType;
		this.valid = valid;
	}

	/**
	 * @return the plateCode
	 */
	public String getPlateCode() {
		return plateCode;
	}

	/**
	 * @param plateCode the plateCode to set
	 */
	public void setPlateCode(String plateCode) {
		this.plateCode = plateCode;
	}

	/**
	 * @return the type
	 */
	public String getPlateType() {
		return plateType;
	}

	/**
	 * @param type the type to set
	 */
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}

	/**
	 * @return the valid
	 */
	public Boolean getValid() {
		return valid;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
