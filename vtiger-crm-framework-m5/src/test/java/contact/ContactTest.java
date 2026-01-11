package contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_utility.BaseClass;

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
		if (actLastName.equals(lastName)) {
			System.out.println("Contact Successfully created !!!");
		} else {
			System.out.println("Failed.....");
		}

//		logout
//		close the browser
	}
}
