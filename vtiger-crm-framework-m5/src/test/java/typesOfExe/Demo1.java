package typesOfExe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	@Parameters("browser")
	
	@Test(groups = "reg")
	public void case1(String browser)					 throws InterruptedException {
		WebDriver driver;

//		String browser = "firefox";

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		Thread.sleep(2000);
		System.out.println(browser + " is opened...");
		driver.quit();
	}

	@Parameters("browser")
	@Test(groups = "smoke")
	public void case11(String browser) throws InterruptedException {
		WebDriver driver;

//		String browser = "firefox";

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		Thread.sleep(2000);
		System.out.println(browser + " is opened...");
		driver.quit();
	}

	@Parameters("browser")
	@Test(groups = "reg")
	public void case111(String browser) throws InterruptedException {
		WebDriver driver;

//		String browser = "firefox";

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		Thread.sleep(2000);
		System.out.println(browser + " is opened...");
		driver.quit();
	}
}
