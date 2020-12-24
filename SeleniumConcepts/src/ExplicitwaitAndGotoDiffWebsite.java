

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitAndGotoDiffWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
		   WebDriver driver=new ChromeDriver();    // launch chrome driver
		    
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    // dynamic wait
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.get("s");  // used to launch the application
		    driver.navigate().to("A");  // used to goto some external URL
		    
		    

	}
	
	//Explicit wait
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout). ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
