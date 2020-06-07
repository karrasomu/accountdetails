package myorg.api.servicing.accountdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 
 * This is used to bootstrap and launch a Spring application from a Java main method.
 */
@SpringBootApplication(scanBasePackages={"myorg.api"})
public class AccountDetailsRestApiApp {

	/**
	 * @param args
	 * Main method to launch the application
	 */
	public static void main(String[] args) {
		SpringApplication.run(AccountDetailsRestApiApp.class, args);
	}
}
