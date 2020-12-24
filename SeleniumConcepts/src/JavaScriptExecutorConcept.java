

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException {

		 System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
		   WebDriver driver=new ChromeDriver();    // launch chrome driver
		    
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    // dynamic wait
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    driver.get("https://www.facebook.com/");
		    Thread.sleep(10000);
		    
		   WebElement search = driver.findElement(By.name("login"));
		    
            
            flash(search,driver);
            
            // screenshot code
            File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("path"));
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);   // casting driver
		String bgcolor = element.getCssValue("backgroundColor");  // taking the color of
		for(int i =0; i < 10; i++) {  // will change the color ten times
			changeColor("rgb(255,0,0)", element,driver);  // changing the color to red
			changeColor(bgcolor, element, driver);  // changing the color to green
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {  // change color method
		JavascriptExecutor js = ((JavascriptExecutor)driver);   
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);   // executeScript method is used to run java script code
	}
	
	public static void border(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver); 
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver); 
		js.executeScript("'alert("+message+")'");
	}
	
	public static void ClickByJs(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver); 
		js.executeScript("arguments[0].click()", element);
		js.executeScript("history.go(0)");  // refresh
		js.executeScript("return document.title;").toString();  // get page title
		js.executeScript("return document.documentElement.innerText;").toString(); // Complete text of that page
	}
	

}
