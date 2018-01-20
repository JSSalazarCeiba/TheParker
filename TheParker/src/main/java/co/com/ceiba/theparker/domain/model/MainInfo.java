/**
 * 
 */
package co.com.ceiba.theparker.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author juan.salazar
 *
 */
@Entity
public class MainInfo {
	
	@Id
	@Column(name = "TYPE")
	private String type;
	@Column(name = "OCCUPATION")
	private Integer currentOcuppation;
	@Column(name = "CAPACITY")
	private Integer totalCapacity;
	@Column(name = "TO_PAY")
	private Long toPay;
	@Column(name = "PAYED")
	private Long payed;
	
	/**
	 * @param type
	 * @param currentOcuppation
	 * @param totalCapacity
	 * @param toPay
	 * @param payed
	 */
	public MainInfo(String type, Integer currentOcuppation, Integer totalCapacity, Long toPay, Long payed) {
		super();
		this.type = type;
		this.currentOcuppation = currentOcuppation;
		this.totalCapacity = totalCapacity;
		this.toPay = toPay;
		this.payed = payed;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the currentOcuppation
	 */
	public Integer getCurrentOcuppation() {
		return currentOcuppation;
	}

	/**
	 * @param currentOcuppation the currentOcuppation to set
	 */
	public void setCurrentOcuppation(Integer currentOcuppation) {
		this.currentOcuppation = currentOcuppation;
	}

	/**
	 * @return the totalCapacity
	 */
	public Integer getTotalCapacity() {
		return totalCapacity;
	}

	/**
	 * @param totalCapacity the totalCapacity to set
	 */
	public void setTotalCapacity(Integer totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	/**
	 * @return the toPay
	 */
	public Long getToPay() {
		return toPay;
	}

	/**
	 * @param toPay the toPay to set
	 */
	public void setToPay(Long toPay) {
		this.toPay = toPay;
	}

	/**
	 * @return the payed
	 */
	public Long getPayed() {
		return payed;
	}

	/**
	 * @param payed the payed to set
	 */
	public void setPayed(Long payed) {
		this.payed = payed;
	}

}
