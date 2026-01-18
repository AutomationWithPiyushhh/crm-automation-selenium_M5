package organization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base_utility.BaseClass;
import generic_utility.FileUtility;
import generic_utility.JavaUtility;

public class OrgTest extends BaseClass {

	@Test
	public void createOrgTest() throws IOException, InterruptedException {
		FileUtility fUtil = new FileUtility();
		String orgName = fUtil.getDataFromExcelFile("org", 1, 0) + JavaUtility.genRanNum();

//		open the browser
//		Login
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
//		close the browser
	}
}
