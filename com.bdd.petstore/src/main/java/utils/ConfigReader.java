package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ConfigReader 
{
	Properties pro;
	FileInputStream fis;
	
	
	public ConfigReader() throws IOException
	{
		pro = new Properties();
		fis = new FileInputStream("D:\\PlayWright\\Selenium\\com.bdd.petstore\\src\\test\\resources\\Config\\config.properties");
		pro.load(fis);	
	}
	
	public String getUrl()
	{
		return pro.getProperty("BaseURL");
	}

}
