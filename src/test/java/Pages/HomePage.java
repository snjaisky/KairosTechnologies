package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.base;

public class HomePage extends base {

	public HomePage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//h1//span[text()='Home']")
	WebElement verifyhome;
	
	
	public String verifyhome() {
		 return verifyhome.getText();
	}
	
	
	
	public  String verifyHomePageTitle() {
		return driver.getTitle();
	}

}
