import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
		   WebDriver driver=new ChromeDriver();    // launch chrome driver
		    
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    // dynamic wait
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.get("https://www.freecrm.com");
			
			driver.findElement(By.name("username")).sendKeys("naveenk");
			driver.findElement(By.name("password")).sendKeys("test@123");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
			
			driver.switchTo().frame("mainpanel");   // if there is a frame in the page we need to first to that frame and then perform the operation
			
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}

}
