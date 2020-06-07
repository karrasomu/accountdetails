package myorg.api.servicing.accountdetails.model;

import java.util.List;

public class BaseResponse {

	private List<Error> errors;
	/**
	 * @return the errors
	 */
	public List<Error> getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}
}
