package myorg.api.servicing.accountdetails.service.model;

import java.util.List;

public class AccountDetails {

	private String accountNumber;
	private List<Address> addresses;
	private List<Phone> phones;
	
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	/**
	 * @return the phones
	 */
	public List<Phone> getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	
}
