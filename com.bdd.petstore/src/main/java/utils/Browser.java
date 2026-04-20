package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser 
{
	WebDriver driver;	
	 
	
	public WebDriver getChrome()
	{
		 	
		if(driver==null)
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		return driver;
	}
		public void quitDriver()
		{
			if(driver!=null)
			{
				driver.quit();
			}
		}
}
			
		
		 
		
 

 
