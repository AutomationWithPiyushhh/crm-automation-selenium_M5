package extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.xpath("//a[contains(@id,'u_0_6')]"));
		
		
		WebDriverUtility wdUtil = new WebDriverUtility(driver);
		
		Thread.sleep(3000);
		
//		Actions act = new Actions(driver);
//		act.moveToElement(element).build().perform();
		
		wdUtil.hover(element);

		Thread.sleep(3000);
		
		wdUtil.rightClick(element);
		


		
		driver.quit();
	}
}
