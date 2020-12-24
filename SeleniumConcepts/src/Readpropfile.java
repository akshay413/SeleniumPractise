

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Readpropfile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();   // creating object for properties file
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Krishna\\eclipse-workspace3\\Test\\src\\test\\config.properties");  // connceting properties file with java code
		
		prop.load(ip);  // loading the properties file
		String browser = prop.getProperty("browser");
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
		    driver=new ChromeDriver();
		}else
		{
			System.setProperty("webdriver.chrome.driver", "E:\\testing\\InternetExplorerDriver.exe");  
		    driver=new InternetExplorerDriver();
		}
		
				
	}

}
