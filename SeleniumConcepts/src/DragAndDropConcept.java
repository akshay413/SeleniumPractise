

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {


		 System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
		   WebDriver driver=new ChromeDriver();    // launch chrome driver
		    
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    // dynamic wait
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    
		    Actions action = new Actions(driver);
		    action.clickAndHold(driver.findElement(By.id("asd"))).moveToElement(driver.findElement(By.id("asd"))).release().build().perform();

	}

}
