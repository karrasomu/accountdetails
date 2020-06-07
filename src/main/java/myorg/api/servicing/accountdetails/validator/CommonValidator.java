package myorg.api.servicing.accountdetails.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import myorg.api.servicing.accountdetails.model.Request;

/**
 * A common validator class to handle all the validations
 * @author 
 */
@Component
public class CommonValidator {

	/**
	 * This method is to validate the input
	 * @param reqiest object, throws exception if the input is not correct
	 */
	public void validate(Request reqiest){
		
		if(StringUtils.isEmpty(reqiest.getAccountNumber())){
			throw new IllegalArgumentException("Account Number is required");
		}
	}
}
