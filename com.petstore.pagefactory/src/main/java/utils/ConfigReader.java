package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	 private static Properties prop;

	    static {
	        try {
	            FileInputStream fis = new FileInputStream("D:\\Clients\\CTS_2026\\com.petstore.pagefactory\\src\\test\\resources\\objectrepository\\config.properties");
	            prop = new Properties();
	            prop.load(fis);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static String getProperty(String key) {
	        return prop.getProperty(key);
	    }

}
