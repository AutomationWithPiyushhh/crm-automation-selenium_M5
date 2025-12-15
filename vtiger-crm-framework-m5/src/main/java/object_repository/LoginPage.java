package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
//	init
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
//	dec
	@FindBy(id = "user-name")
	private WebElement un;

	@FindBy(id = "password")
	private WebElement pwd;

	@FindBy(id = "login-button")
	private WebElement loginBtn;

	public WebElement getUn() {
		return un;
	}
	
	public WebElement getPwd() {
		return pwd;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}


}
