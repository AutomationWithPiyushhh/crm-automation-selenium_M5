package testng_extra;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTest {
//	public static void main(String[] args) {
//		System.out.println("hey there this is console...");
//	}

	@Test(priority = 1)
	public void createCity() {
		Reporter.log("NOIDA", true);
	}

	@Test(priority = 0)
	public void modifyCity() {
		Reporter.log("Greater NOIDA", true);
	}

	@Test(priority = -1)
	public void deleteCity() {
		Reporter.log("Delete Greater NOIDA", true);
	}

}
