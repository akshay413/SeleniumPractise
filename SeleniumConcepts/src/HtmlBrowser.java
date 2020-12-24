

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlBrowser {

	public static void main(String[] args) {

	   System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
	   WebDriver driver=new ChromeDriver();    // launch chrome driver
	    
		//WebDriver driver = new HtmlUnitDriver();
		//html jar is not part of selenium 3.X version we need to download seperately add add the jar file
		
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    // dynamic wait
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("https://google.com");
	    System.out.println(driver.getTitle());
	    

	}

}


//htmlunitdriver -> java
//phantomJS  -> java script
// ghost driver -> headless browser
// not sutible for actions class, mouse movement, double click, drag and drop
//very fast
// testing happens behind the scenes