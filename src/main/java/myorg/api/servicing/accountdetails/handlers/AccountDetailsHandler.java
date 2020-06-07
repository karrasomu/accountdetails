package myorg.api.servicing.accountdetails.handlers;

import myorg.api.servicing.accountdetails.mappers.AccountDetailsRequestMapper;
import myorg.api.servicing.accountdetails.mappers.AccountDetailsResponseMapper;
import myorg.api.servicing.accountdetails.model.Request;
import myorg.api.servicing.accountdetails.model.Response;
import myorg.api.servicing.accountdetails.service.AccountDetailsServiceImpl;
import myorg.api.servicing.accountdetails.service.model.AccountDetails;
import myorg.api.servicing.accountdetails.service.model.AccountRequest;
import myorg.api.servicing.accountdetails.validator.CommonValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author
 * This class used to handle request. 
 */
@Component
public class AccountDetailsHandler {

	@Autowired
	AccountDetailsRequestMapper requestMapper;
	
	@Autowired
	AccountDetailsResponseMapper responseMapper;
	
	@Autowired
	AccountDetailsServiceImpl serviceImpl;
	
	@Autowired
	CommonValidator validator;
	
	/**
	 * This method is to delegate the tasks like validate the request, create the request, call the service 
	 * and create the response
	 * @param request
	 * @return response
	 */
	public Response handle(Request request) {
		
		validator.validate(request);
		
		AccountRequest accountRequest =  requestMapper.map(request);
		
		AccountDetails accountDetails = serviceImpl.process(accountRequest);
		
		return responseMapper.map(accountDetails);
	}
}
