package pckg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class carloan {

	@AfterTest
	public void aftertest() {
		System.out.println("Changes done");
		System.out.println("After Test");
	}
	
	@Test(groups= {"smoketests"})
	public void WebLogin() {
		System.out.println("Car Loan Web Login");
	}

	@Test
	public void MobileLogin() {

		System.out.println("Car Loan Mobile Login");

	}

	@Test
	public void LoginAPI() {

		System.out.println("Car Loan Login API");
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("After Class");
	}
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("I created changes in github");
		System.out.println("before class");
	}

}
