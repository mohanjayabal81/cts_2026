package pages;

import org.openqa.selenium.By;

import utils.WaitUtils;

public class HomePage extends BasePage
{
	 By enterStoreBtn = By.linkText("Enter the Store");

	    public void openApplication(String url) {

	        driver.get(url);
	    }

	    public void clickEnterStore() {
	    	
	    		//WaitUtils.waitForElementClickable(enterStoreBtn).click();

	        driver.findElement(enterStoreBtn).click();
	    }
	    public String verifyTitle()
	    {
	    	  String actualTitle =  driver.getTitle();
	    	  return actualTitle;
	    }

}
