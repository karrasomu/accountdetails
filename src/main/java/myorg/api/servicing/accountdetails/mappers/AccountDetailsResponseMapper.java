package myorg.api.servicing.accountdetails.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import myorg.api.servicing.accountdetails.model.Address;
import myorg.api.servicing.accountdetails.model.Details;
import myorg.api.servicing.accountdetails.model.Error;
import myorg.api.servicing.accountdetails.model.Phone;
import myorg.api.servicing.accountdetails.model.Response;
import myorg.api.servicing.accountdetails.service.model.AccountDetails;

import org.springframework.stereotype.Component;

/**
 * This class is to map the service response required output format
 * @author 
 */
@Component
public class AccountDetailsResponseMapper {
	
	/**
	 * This method is to map the service response to required output format
	 * @param accountDetails - service response
	 * @return Response in required output format
	 */
	public Response map(AccountDetails accountDetails){
		
		Response response = new Response();
		if(Objects.nonNull(accountDetails)){
			Details details = new Details();
			details.setAccountNumber(accountDetails.getAccountNumber());
			List<Address> addresses = accountDetails.getAddresses().stream().filter(obj -> obj != null).map( obj -> {
				Address address = new Address();
				address.setAddreessLine1(obj.getAddreessLine1());
				address.setAddreessLine2(obj.getAddreessLine2());
				address.setAddreessLine3(obj.getAddreessLine3());
				address.setCity(obj.getCity());
				address.setCountry(obj.getCountry());
				address.setState(obj.getState());
				address.setZipcode(obj.getState());
				return address;
			}).collect(Collectors.toList());
			details.setAddresses(addresses);
			List<Phone> phones = accountDetails.getPhones().stream().filter(obj -> obj != null).map( obj -> {
				Phone phone = new Phone();
				phone.setNumber(obj.getNumber());
				phone.setType(obj.getType());
				return phone;
			}).collect(Collectors.toList());
			details.setPhones(phones);
			response.setDetails(details);
		} else {
			List<Error> errors = new ArrayList<Error>();
			Error error = new Error();
			error.setMessage("Account Details Not Found");
			error.setErrorCode("422");
			errors.add(error);
			response.setErrors(errors);
		}
		return response;
	}
}
