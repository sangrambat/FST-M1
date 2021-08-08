package SeleniumProject;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;

public class Activity1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+ "drivers"+File.separator+"geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		
		   String title = driver.getTitle();
           	  if (title.matches("Alchemy Jobs – Job Board Application"))
           	  {
           		  System.out.println("Page title is: " + title);
	       
           		  driver.close();
           		  
           	  }
           	else 
			{ 
				System.out.println("the heading of the current page is not as expected  " + title);
			}
	}
}

	