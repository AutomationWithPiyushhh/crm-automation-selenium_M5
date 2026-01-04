package testng_extra;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "getData")
	public void loginToSauceDemo(String fn, String ln) {
		System.out.println(fn + " " + ln);
	}
	
//	https://www.saucedemo.com/
	
	
	@DataProvider
	public Object[][] getData() {		
		Object[][] students = new Object[4][2];
//										row col
//								  execution data
		students[0][0] = "akshay";
		students[0][1] = "anand";
		
		students[1][0] = "kirti";
		students[1][1] = "shakya";
		
		students[2][0] = "Nikhil";
		students[2][1] = "sahu";
		
		students[3][0] = "riya";
		students[3][1] = "tiwari";
		
		return students;
	}
}
