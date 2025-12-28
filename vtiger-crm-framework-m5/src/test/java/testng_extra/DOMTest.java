package testng_extra;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DOMTest {
//	public static void main(String[] args) {
//		System.out.println("hey there this is console...");
//	}

	@Test
	public void createCity() {
		Reporter.log("NOIDA", true);
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "createCity")
	public void modifyCity() {
		Reporter.log("Greater NOIDA", true);
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "modifyCity" , alwaysRun = true)
	public void deleteCity() {
		Reporter.log("Delete Greater NOIDA", true);
	}
	
	

}
