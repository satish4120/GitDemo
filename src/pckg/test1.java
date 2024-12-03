package pckg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void example1() {
		
		System.out.println("Hello");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	
	@Test(groups= {"smoketests"})
	public void example2() {
		System.out.println("I am Test1");
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Hi");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Bye");
	}
	
	
	

}
