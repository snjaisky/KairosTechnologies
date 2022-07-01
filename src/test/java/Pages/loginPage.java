package Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.base;

public class loginPage extends base {
	


	public loginPage() throws Exception {
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(id = "username")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement password;
	
	
	@FindBy(id = "Login")
	WebElement Login;
	
	
	public void userName() {
		userName.sendKeys(prop.getProperty("uname"));
	}
	
	public void Password() {
		password.sendKeys(prop.getProperty("pswd"));
	}
	
	public void LoginBtn() {
		Login.click();
	}

	
	public String PageTitle() {
		 return driver.getTitle();
		
	}
}
