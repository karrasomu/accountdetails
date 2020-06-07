package myorg.api.servicing.accountdetails.exception;

import java.util.ArrayList;
import java.util.List;

import myorg.api.servicing.accountdetails.model.BaseResponse;
import myorg.api.servicing.accountdetails.model.Error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * This class is used to handle the Exceptions Globally
 * @author 
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	/**
	 * This is method is to handle the IllegalArgumentException globally
	 * @param exception - IllegalArgumentException
	 * @return ResponseEntity object with error information
	 */
	@ExceptionHandler(IllegalArgumentException.class)
	protected ResponseEntity<Object> handleIllegalArgumentException(final IllegalArgumentException exception){
		List<Error> errors = new ArrayList<Error>();
		Error error = new Error();
		error.setMessage(exception.getMessage());
		error.setErrorCode(HttpStatus.BAD_REQUEST.toString());
		errors.add(error);
		BaseResponse response = new BaseResponse();
		response.setErrors(errors);
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}
}
