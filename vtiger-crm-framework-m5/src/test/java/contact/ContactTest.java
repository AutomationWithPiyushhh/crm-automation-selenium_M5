package contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base_utility.BaseClass;

@Listeners(listener_utility.List_Imp.class)
public class ContactTest extends BaseClass {

	@Test
	public void createConTest() throws InterruptedException {
//		opening browser
//		Login
//		Create contact
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();

//		Filling Form
		String lastName = "Kumar";
		WebElement lastNameField = driver.findElement(By.name("lastname"));
		lastNameField.sendKeys(lastName);

//		Save
		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();

//		Verification
		String actLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
//		if (actLastName.equals(lastName + "123")) {
//			System.out.println("Contact Successfully created !!!");
//		} else {
//			System.out.println("Failed.....");
//		}
		
//		Hard assert
//		Assert.assertEquals(lastName, actLastName);
		
//		Soft Assert
		
		boolean status = actLastName.equals(lastName+"123");
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(status);
		
		System.out.println("logging out");

		sa.assertAll();
		
		System.out.println("uske baad");
//		logout
//		close the browser
	}
}
