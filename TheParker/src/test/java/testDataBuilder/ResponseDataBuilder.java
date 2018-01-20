/**
 * 
 */
package testDataBuilder;

import co.com.ceiba.theparker.domain.model.Response;
import co.com.ceiba.theparker.domain.utility.Constants;

/**
 * @author juan.salazar
 *
 */
public class ResponseDataBuilder {
	
	private Integer code;
	private String message;
	/**
	 * 
	 */
	public ResponseDataBuilder() {
		super();
		this.code = Constants.STATUS_OK;
		this.message = Constants.STATUS_OK_MESSAGE;
	}
	
	public ResponseDataBuilder responseOkParkingLotFull() {
		this.message = Constants.STATUS_OK_PARKING_LOT_FULL_MESSAGE;
		return this;
	}
	
	public ResponseDataBuilder responseErrorInServer() {
		this.code = Constants.STATUS_ERROR_SERVER;
		this.message = Constants.STATUS_ERROR_SERVER_MESSAGE;
		return this;
	}
	
	public ResponseDataBuilder responseErrorInClient() {
		this.code = Constants.STATUS_ERROR_CLIENT;
		this.message = Constants.STATUS_ERROR_CLIENT_MESSAGE;
		return this;
	}
	
	public Response build() {
		return new Response(this.code, this.message);
	}

}
