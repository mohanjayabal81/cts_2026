package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CatalogPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest
{
	
	 @Test
	    public void verifyLogin() {

	        HomePage home = new HomePage(utils.DriverFactory.getDriver());
	        home.clickEnterStore();

	        CatalogPage catalog = new CatalogPage(utils.DriverFactory.getDriver());
	        catalog.clickSignIn();

	        LoginPage login = new LoginPage(utils.DriverFactory.getDriver());
	        login.login("j2ee", "j2ee");
	    }

}
