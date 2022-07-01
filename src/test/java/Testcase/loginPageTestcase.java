package Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.loginPage;
import TestBase.base;

public class loginPageTestcase extends base {

	loginPage lp;
	HomePage hp;


	public loginPageTestcase() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws Exception {
		intialization();
		lp = new loginPage();

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 1)
	public void verifyLogin() throws Exception {
		 hp = new HomePage();
		lp.userName();
		lp.Password();
		lp.LoginBtn();
		Thread.sleep(2000);
		String hometitle = hp.verifyHomePageTitle();
		Assert.assertEquals(hometitle, "Home | Salesforce");
		
	}

	@Test(priority = 0)
	public void loginPageTitle() {
		String title = lp.PageTitle();
		Assert.assertEquals(title, "Login | Salesforce");
	}

}
