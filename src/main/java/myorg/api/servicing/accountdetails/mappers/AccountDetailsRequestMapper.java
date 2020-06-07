package myorg.api.servicing.accountdetails.mappers;

import myorg.api.servicing.accountdetails.model.Request;
import myorg.api.servicing.accountdetails.service.model.AccountRequest;

import org.springframework.stereotype.Component;

/**
 * This class is to map the input to service specific request
 * @author 
 */
@Component
public class AccountDetailsRequestMapper {

	/**
	 * This method is to create the input to service specific request
	 * @param request - Input request
	 * @return request - Service specific request
	 */
	public AccountRequest map(Request request){
		AccountRequest accountRequest = new AccountRequest();
		accountRequest.setAccountNumber(request.getAccountNumber());
		return accountRequest;
	}
}
