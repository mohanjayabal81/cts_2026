package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import utils.Browser;
import utils.ConfigReader;

public class HomePage {
	ConfigReader cog;
	Browser bo;
	static WebDriver driver;

	public static void main(String[] args) throws IOException
	{
		 ConfigReader cog = new ConfigReader();
		 Browser bo = new Browser();
		 try {
			driver = bo.getChrome();
			Thread.sleep(2000);
			String url = cog.getUrl();
			System.out.println(url);
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 bo.quitDriver();
		 
		 

	}

}
