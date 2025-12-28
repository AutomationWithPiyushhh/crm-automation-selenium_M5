package testng_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountTest {
//	public static void main(String[] args) {
//		System.out.println("hey there this is console...");
//	}

//	executing same test script, multiple time, 
//	with same set of data
	
//	to execute test scripts Parallelly we go for tps
	@Test(invocationCount = 5, threadPoolSize = 3)
	public void createCity() throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		Thread.sleep(1000);
//		driver.quit();
	}

	@Test
	public void modifyCity() {
		Reporter.log("Greater NOIDA", true);
	}

	@Test
	public void deleteCity() {
		Reporter.log("Delete Greater NOIDA", true);
	}
	
	
//	executing same test script, multiple time, 
//	with different set of data => DATAPROVIDER


}
