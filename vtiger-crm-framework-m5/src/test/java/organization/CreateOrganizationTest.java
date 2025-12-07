package organization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import extra.GenRanNum;
import generic_utility.FileUtility;

public class CreateOrganizationTest {
	public static void main(String[] args) throws InterruptedException, IOException {
//		get data from properties file
		FileUtility fUtil = new FileUtility();

		String BROWSER = fUtil.getDataFromPropertiesFile("bro");
		String URL = fUtil.getDataFromPropertiesFile("url");
		String USERNAME = fUtil.getDataFromPropertiesFile("un");
		String PASSWORD = fUtil.getDataFromPropertiesFile("pwd");

		String orgName = fUtil.getDataFromExcelFile("org", 1, 0);

//		open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Login
		driver.get(URL);

		WebElement username = driver.findElement(By.name("user_name"));
		WebElement password = driver.findElement(By.name("user_password"));
		username.sendKeys(USERNAME);
		password.sendKeys(PASSWORD + Keys.ENTER);

//		Create organization
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();

//		Filling Form
//		String orgName = "MakunaiGlobal_" + GenRanNum.generateRandomNumber();
		WebElement orgField = driver.findElement(By.name("accountname"));
		orgField.sendKeys(orgName);

//		Save
		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();

//		Verification
		String actOrgName = driver.findElement(By.id("dtlview_Organization Name")).getText();

		if (actOrgName.equals(orgName)) {
			System.out.println("Organization Succesfully created !!!");
		} else {
			System.out.println("Failed.....");
		}

//		logout
		WebElement profile = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));

		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();

		driver.findElement(By.linkText("Sign Out")).click();

//		close the browser
		Thread.sleep(10000);
		driver.quit();
	}
}
