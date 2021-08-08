package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Java\\software\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//WebElement PostajobLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a[text()='Jobs']")));
		//PostajobLink.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a")).click();
		driver.findElement(By.id("create_account_email")).sendKeys("sangrt@ff.com");
       driver.findElement(By.id("job_title")).sendKeys("Batch 11 TEST");
		
		WebElement check = driver.findElement(By.id("job_type"));
		if(check.isSelected()) {
		
			Select dropdown = new Select(check);
			dropdown.selectByVisibleText("Internship");
		}
		
		WebElement iframe = driver.findElement(By.id("job_description_ifr"));
		
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("tinymce")).sendKeys("This is an Simple Selenium TEST");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("application")).sendKeys("https://www.google.com");
		
		driver.findElement(By.id("company_name")).sendKeys("Training FST");
		  
		driver.findElement(By.name("submit_job")).click();
		
		driver.findElement(By.id("job_preview_submit_button")).click();
		
		driver.findElement(By.linkText("Jobs")).click();
		
		driver.findElement(By.id("search_keywords")).sendKeys("Selenium Batch 11 TEST",Keys.ENTER);
		
		//Thread.sleep(5000);
		//WebElement Job = wait.until(ExpectedConditions.elementToBeClickable()));
		
		Boolean isJobPresent = driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li/a/div[1]/h3")).isDisplayed();
		
		if(isJobPresent) {
			System.out.println("The Job is succesfully listed");
		}
		
		else {
			System.out.println("The Job is not listed at all");
		}
		
		driver.close();
		
	}

}
