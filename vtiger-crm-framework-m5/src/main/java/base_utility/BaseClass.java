package base_utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import generic_utility.FileUtility;

public class BaseClass {
	public WebDriver driver;

	@BeforeSuite
	public void repConfig() {
		System.out.println("report config. + db conn");
	}

	@BeforeTest
	public void preCon() {
		System.out.println("pre conditions");
	}

	@BeforeClass
	public void openBro() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void login() throws IOException {

		FileUtility fUtil = new FileUtility();

		String URL = fUtil.getDataFromPropertiesFile("url");
		String USERNAME = fUtil.getDataFromPropertiesFile("un");
		String PASSWORD = fUtil.getDataFromPropertiesFile("pwd");

		driver.get(URL);

		WebElement username = driver.findElement(By.name("user_name"));
		WebElement password = driver.findElement(By.name("user_password"));
		username.sendKeys(USERNAME);
		password.sendKeys(PASSWORD + Keys.ENTER);
	}

	@AfterMethod
	public void logout() {
		WebElement profile = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));

		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();

		driver.findElement(By.linkText("Sign Out")).click();
	}

	@AfterClass
	public void closeBro() {
		driver.quit();
	}

	@AfterTest
	public void postCon() {
		System.out.println("post condition");
	}

	@AfterSuite
	public void repBackup() {
		System.out.println("report backup + DB conn close");
	}

}
