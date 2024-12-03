package pckg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test3 {
	
	@Test(dataProvider = "getData")
	public void testcase(String username, String password) 
	{
		System.out.println(username);
		System.out.println(password);
		
	}

	@DataProvider
	public Object[][] getData()
	{
		//If we want to pass 3 combinations of username and password (2 values)
		Object[][] data = new Object[3][2];
		data[0][0] = "good cibil username";
		data[0][1] = "good cibil password";
		data[1][0] = "bad cibil username";
		data[1][1] = "bad cibil password";
		data[2][0] = "no cibil username";
		data[2][1] = "no cibil password";
		return data;
		
		
	}
	
}

