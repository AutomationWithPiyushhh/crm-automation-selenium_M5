package extra;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.shoppersstack.com/products_page/24");

		Thread.sleep(20000);

		String pid = driver.getWindowHandle();

		driver.findElement(By.id("compare")).click();

		WebDriverUtility wdUtil = new WebDriverUtility(driver);
		wdUtil.switchToWinOnTitle("zon");

		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

		
//		step 5 > come back home
		driver.switchTo().window(pid);
		driver.quit();
	}
}
