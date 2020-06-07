package myorg.api.servicing.accountdetails.validator.uill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import myorg.api.servicing.accountdetails.service.model.AccountDetails;
import myorg.api.servicing.accountdetails.service.model.AccountRequest;
import myorg.api.servicing.accountdetails.service.model.Address;
import myorg.api.servicing.accountdetails.service.model.Phone;

/**
 * This classes is just to populate the dummy response
 * @author 
 */
public class AccountDetailsUtil {
	
	public static Map<String , AccountDetails> accountDetailsMap;
	
	static{
		accountDetailsMap = populateAccountDetails();
	}
	
	/**
	 * This method is to create the dummy response.
	 * @return map of response objects
	 */
	private static Map<String, AccountDetails> populateAccountDetails(){
		Map<String, AccountDetails> accountDetailsMap = new HashMap<String, AccountDetails>();
		AccountDetails accountDetails = new AccountDetails();
		accountDetails.setAccountNumber("12121212");
		List<Phone> phones = new ArrayList<Phone>();
		Phone phone = new Phone();
		phone.setNumber("1234567890");
		phone.setType("MOBILE");
		phones.add(phone);
		accountDetails.setPhones(phones);
		List<Address> addresses = new ArrayList<Address>();
		Address address = new Address();
		address.setAddreessLine1("1001 NW");
		address.setAddreessLine2("99 DR");
		address.setAddreessLine3("APT 2020");
		address.setCity("Plantation");
		address.setState("FL");
		address.setZipcode("33435");
		address.setCountry("USA");
		addresses.add(address);
		accountDetails.setAddresses(addresses);	
		accountDetailsMap.put(accountDetails.getAccountNumber(), accountDetails);
		
		AccountDetails accountDetails1 = new AccountDetails();
		accountDetails1.setAccountNumber("22334455");
		List<Phone> phones1 = new ArrayList<Phone>();
		Phone phone1 = new Phone();
		phone1.setNumber("2345678901");
		phone1.setType("MOBILE");
		phones1.add(phone1);
		accountDetails.setPhones(phones);
		List<Address> addresses1 = new ArrayList<Address>();
		Address address1 = new Address();
		address1.setAddreessLine1("20001 NW");
		address1.setAddreessLine2("66 DR");
		address1.setAddreessLine3("APT 111");
		address1.setCity("Sunrise");
		address1.setState("FL");
		address1.setZipcode("22122");
		address1.setCountry("USA");
		addresses1.add(address1);
		accountDetails1.setAddresses(addresses1);	
		accountDetailsMap.put(accountDetails1.getAccountNumber(), accountDetails1);
		
		return accountDetailsMap;
	}
	
	/**
	 * This method is to return the response for a specific account number
	 * @param request
	 * @return response of a particular account number
	 */
	public static AccountDetails getAccountDetails(AccountRequest request){
		return accountDetailsMap.get(request.getAccountNumber());
	}
}
