

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveto {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
		   WebDriver driver=new ChromeDriver();    // launch chrome driver
		    
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    // dynamic wait
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.get("https://www.spicejet.com/");
		    
		    Actions action = new Actions(driver);
		    action.moveToElement(driver.findElement(By.xpath("//a[@id ='highlight-addons']"))).build().perform();
		    Thread.sleep(10000);
		    driver.findElement(By.linkText("You 1st")).click();
		    
		    

	}

}
