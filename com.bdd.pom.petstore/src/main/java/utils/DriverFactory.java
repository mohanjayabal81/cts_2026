package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory 
{
	private static WebDriver driver;

	// Method to get the Browser Instance 
    public static WebDriver getDriver() 
    {
        if(driver == null) 
        {
            WebDriverManager.chromedriver().setup(); //Setting up the Browser Version 
            driver = new ChromeDriver(); // Opening the Chrome Browser 
            driver.manage().window().maximize(); // Maximize the Window
        }
        return driver;         
    }
    
 // Method to Quit the Browser Instance 
    public static void quitDriver()
    {

        if(driver != null)
        {
            driver.quit(); // Quit the Browser Instance 
            driver = null;
        }
    }


}
