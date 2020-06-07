package myorg.api.servicing.accountdetails.service;

import myorg.api.servicing.accountdetails.service.model.AccountDetails;
import myorg.api.servicing.accountdetails.service.model.AccountRequest;
import myorg.api.servicing.accountdetails.validator.uill.AccountDetailsUtil;

import org.springframework.stereotype.Service;

/**
 * This class is to call the actual backend or repository
 * @author 
 */
@Service
public class AccountDetailsServiceImpl {

	/**
	 * This method is to call the backend service/repository, for now just returning the ststic response
	 * @param request
	 * @return response from the service/repository 
	 */
	public AccountDetails process(AccountRequest request){
		return  AccountDetailsUtil.getAccountDetails(request);
	}
}
