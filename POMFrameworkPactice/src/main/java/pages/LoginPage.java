package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement btn;
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String name, String pwd){
		email.sendKeys(name);
		password.sendKeys(pwd);
		btn.click();   	
		
		return new HomePage();
	}
	
}
