package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Java\\software\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		
		String heading = driver.findElement(By.className("entry-title")).getText();
		if (heading.matches("Welcome to Alchemy Jobs"))		{
			System.out.println("The heading of current page is :: " +heading);
			
				
				driver.close();
		}
		else 
				{ 
					System.out.println(" the heading of the current page is not as expected  "+heading);
				}
	    }

}