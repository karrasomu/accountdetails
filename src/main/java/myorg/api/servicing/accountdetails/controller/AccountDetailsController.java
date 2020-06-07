package myorg.api.servicing.accountdetails.controller;

import java.util.Objects;

import myorg.api.servicing.accountdetails.handlers.AccountDetailsHandler;
import myorg.api.servicing.accountdetails.model.Request;
import myorg.api.servicing.accountdetails.model.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 
 * Controller class to create the RESTful web services using the SpringMVC
 */
@RestController
@RequestMapping("/api")
public class AccountDetailsController {
	
	public static final Logger logger = LoggerFactory.getLogger(AccountDetailsController.class);
	
	@Autowired
	AccountDetailsHandler handler;
	
	/**
	 * POST Request Mapping method to get the Account Details
	 * @param request - Request object with Account Number in it
	 * @return - Response object with account details
	 * 
	 */
	@RequestMapping(value = "/account/details", produces = { "application/json"}, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> getAccountDetails(@RequestBody Request request) {
		logger.info("Fetching details for the request{}", request);
		Response accountDetails = handler.handle(request);
		if(Objects.isNull(accountDetails)) {
			logger.info("Fetching details for the request{}", request);
			return new ResponseEntity<Response>(accountDetails, HttpStatus.UNPROCESSABLE_ENTITY);
		}
		return new ResponseEntity<Response>(accountDetails, HttpStatus.OK);
	}
}
