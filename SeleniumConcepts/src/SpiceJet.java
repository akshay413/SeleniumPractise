

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
		   WebDriver driver=new ChromeDriver();    // launch chrome driver
		    
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    // dynamic wait
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.get("https://www.spicejet.com/");
		    //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("Hyderabad (HYD)");
		   
		 
		    
		    driver.findElement(By.xpath("//div[@id ='divpaxinfo']")).click();
		    Thread.sleep(5000);
		    Select dropdown = new Select(driver.findElement(By.xpath("//select[@name = 'ctl00$mainContent$ddl_Adult']")));  
			   dropdown.selectByValue("2");
		    
		    		

	}

}
