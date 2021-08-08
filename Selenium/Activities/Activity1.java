package SeleniumActivity;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//org.openqa.selenium.By;
//org.openqa.selenium.WebElement;

public class Activity1 {

	public static void main(String[] args) {
		
			// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver", "C:\\Java\\software\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//WebDriver driver = new ChromeDriver();	
			//Open the browser
			driver.get("https://www.training-support.net");
				
			//Close the browser
			driver.close();
		    }

		}
