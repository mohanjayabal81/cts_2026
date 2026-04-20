package pages;

import org.openqa.selenium.By;

import utils.WaitUtils;

public class LoginPage extends BasePage {

	    By signIn = By.linkText("Sign In");
	    By username = By.name("username");
	    By password = By.name("password");
	    By loginBtn = By.name("signon");

	    public void clickSignIn() {

	   // 	WaitUtils.waitForElementClickable(signIn).click();    
	    	driver.findElement(signIn).click();
	    }

	    public void login(String user,String pass) {

	        driver.findElement(username).sendKeys(user);
	        driver.findElement(password).clear();
	        driver.findElement(password).sendKeys(pass);
	        driver.findElement(loginBtn).click();
	    }

}
