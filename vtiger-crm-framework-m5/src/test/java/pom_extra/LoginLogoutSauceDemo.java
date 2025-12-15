package pom_extra;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import object_repository.HomePage;
import object_repository.LoginPage;

public class LoginLogoutSauceDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.saucedemo.com/");

		LoginPage lp = new LoginPage(driver);
		
		WebElement un = lp.getUn(); 
		WebElement pwd = lp.getPwd(); 
		WebElement loginBtn = lp.getLoginBtn(); 
		
		driver.navigate().refresh();

//		utilize
		un.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
		loginBtn.click();

		Thread.sleep(2000);
//		logout

		HomePage hp = new HomePage(driver);
		
		WebElement hamBurger = hp.getHamBurger();
		driver.navigate().refresh();
		hamBurger.click();

		Thread.sleep(1000);
		WebElement logOut = hp.getLogOut();
		
		
		logOut.click();

		Thread.sleep(2000);
		driver.quit();
	}
}
