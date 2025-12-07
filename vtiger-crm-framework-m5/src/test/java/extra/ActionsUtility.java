package extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility {
	WebDriver driver;
	Actions act;


	ActionsUtility(WebDriver driver) {
		
		
		this.driver = driver;
		
		
		act = new Actions(driver);
	}

	
	public void goBack() {
		driver.navigate().back();
	}
	
	public void hover(WebElement element) {
		act.moveToElement(element).build().perform();
	}

	public void click(WebElement element) {
		act.click(element).build().perform();
	}

	public void rightClick(WebElement element) {
		act.contextClick(element).build().perform();
	}

	public void doubleClick(WebElement element) {
		act.doubleClick(element).build().perform();
	}
}
