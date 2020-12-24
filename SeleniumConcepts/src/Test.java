

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  // setting property for Chrome driver
	    WebDriver driver=new ChromeDriver();    // launch Chrome
	      
	// Launch website  
	    driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
	    
	//click on the link
	    driver.findElement(By.xpath("//a[contains(text(),'link')]")).click();
	//come back to the page    
	    driver.navigate().back();
	//give value in text box
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("akshay");
	//click on submit button
	    driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
	//click on radio button
	    driver.findElement(By.xpath("//div[@class='col-md-12']//child::p//child::input[@id='fname']']")).click();
	//click on check box
	    driver.findElement(By.xpath("//input[@type='checkbox' and @class='Performance']")).click();
	    
    //select
	    Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
	    dropdown.selectByVisibleText("Database Testing");  
	    
	    
	   // Locators
	  //1. xpath: -- 2
	  		//absolute xath should not be used. -- html/body/div[1]/div[5]/div[2]/a 
	  		//only relative xpath should be used. -- //*[@id='firstname']
	  		
//	  		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Tom");
//	  		
//	  		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Peter");
//	  		
//	  		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("12, new street");
	  		
	  		
	  		
	  		//2. id: --1
//	  		driver.findElement(By.id("firstname")).sendKeys("Tom");
//	  		driver.findElement(By.id("lastname")).sendKeys("Peter");
	  		
	  		//3. name: --3
	  		driver.findElement(By.name("firstname")).sendKeys("Tom");
	  		driver.findElement(By.name("lastname")).sendKeys("Peter");
	  		
	  		
	  		//4. linkText : this is only for links
	  		//driver.findElement(By.linkText("Sign in")).click();
	  		
	  		//5. partialLinkText: not useful
	  		//driver.findElement(By.partialLinkText("How to pick")).click();
	  		
	  		
	  		//6. CSSSelector: ---2
	  		//if id is there--- #{id}
	  		//if class is there --- .{class}
	  		driver.findElement(By.cssSelector("#address1")).sendKeys("12 new strt");
	  		
	  		//7. class name: not useful  --4
	  		driver.findElement(By.className("ancAsb")).click();
	  		
	  		
	  		
	  		
	  

	}

}
