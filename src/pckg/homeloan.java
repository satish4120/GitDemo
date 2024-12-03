package pckg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homeloan {

	@Test(groups= {"smoketests"})
	public void WebLogin() {
		System.out.println("Home Loan Web Login");
	}

	@Test
	public void MobileLogin() {

		System.out.println("Home Loan Mobile Login");

	}


	@Test(dependsOnMethods= {"WebLogin"})   //WebLogin executes first of Login API
	public void LoginAPI() {

		System.out.println("Home Loan Login API");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
}
