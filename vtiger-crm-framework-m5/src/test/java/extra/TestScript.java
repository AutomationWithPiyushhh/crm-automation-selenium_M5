package extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.xpath("//a[contains(@id,'u_0_6')]"));
		
//		Actions act = new Actions(driver);
//		act.moveToElement(element).build().perform();
		
		ActionsUtility aUtil = new ActionsUtility(driver);
		
		
		
		aUtil.hover(element);
		
		aUtil.rightClick(element);
		


		
		driver.quit();
	}
}
