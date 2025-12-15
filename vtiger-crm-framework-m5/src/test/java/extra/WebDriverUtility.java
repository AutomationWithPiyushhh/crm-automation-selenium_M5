package extra;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	WebDriver driver;
	Actions act;

	WebDriverUtility(WebDriver driver) {
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
	
	
	public void switchToWinOnTitle(String partialTitle) {
		Set<String> IDs = driver.getWindowHandles();
		for (String i : IDs) {
			driver.switchTo().window(i);
			if (driver.getTitle().contains(partialTitle)) {
				break;
			}
		}
	}
	
}
