import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectEnableDisableMethodsConcept {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver.exe");  
		   WebDriver driver=new ChromeDriver();    // launch chrome driver
		    
		
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    // dynamic wait
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    // is displayed method -> returns a boolean value
		    driver.findElement(By.id("s")).isDisplayed();
		    
		    // is enabled method -> this returns a boolean value
		    driver.findElement(By.id("s")).isEnabled();
		    
		    // is selected method -> this returns a boolean value : applicable for checkbox, dropdown, radiobutton
		    driver.findElement(By.id("A")).isSelected();
		    
		    /* is Displayed() is the method used to verify presence of a web element within the webpage. the method returns a boolean value
		     *we can check all kinds of weelements
		     *isEnabled() is the method to verify the webelement is enabled or disabled with in the webpage.
		     *isSelected() is the method used to check if webelement is selected or not
		     *it is pre-dominantly used with radio button, dropdowns and checkboxes.
		     */
		    
		  
		    
		    

	}

}
