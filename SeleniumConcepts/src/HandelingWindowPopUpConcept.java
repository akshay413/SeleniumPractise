

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandelingWindowPopUpConcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
		   WebDriver driver=new ChromeDriver();    // launch chrome driver
		    
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    // dynamic wait
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		    driver.findElement(By.xpath("//a[contains(text(),'  Follow On Twitter ')]")).click();
		    
		    Set<String> handler = driver.getWindowHandles();
		    
		    Iterator<String> it = handler.iterator();
		    String parentid=   it.next();
		    String childid = it.next();
		    driver.switchTo().window(childid);
		    
		    driver.findElement(By.name("session[username_or_email]")).sendKeys("Akshay");
		    
		    

	}

}
