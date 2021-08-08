package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Java\\software\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement InputTag = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_login")));
		InputTag.clear();
		InputTag.sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).submit();
		//Thread.sleep(500);
		try {
		WebElement  actualsigninlink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Howdy')]")));
		actualsigninlink.click();
		System.out.println("Login sucessfully");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Login not sucessfully ");
		}
	
		driver.close();
	}

}
