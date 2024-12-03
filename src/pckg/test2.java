package pckg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class test2 {
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
	
	
	@Test(groups= {"smoketests"})
	public void example3() {
		
	System.out.println("I Am test2");
	}
}
