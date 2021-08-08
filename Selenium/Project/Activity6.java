package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Java\\software\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement jobLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a[text()='Jobs']")));
		jobLink.click();
		
		WebElement searchInputTag = wait.until(ExpectedConditions.elementToBeClickable(By.id("search_keywords")));
		searchInputTag.clear();
		searchInputTag.sendKeys("Banking");
		
		WebElement searchbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
		searchbtn.click();
		
		WebElement firstSearchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='job_listings']/li[1]")));
		firstSearchResult.click();
		
		WebElement applyForJob = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Apply for job']")));
		applyForJob.click();
		
		WebElement applicationJobText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='application_details']/p")));
		String output=applicationJobText.getText();
		
		System.out.println(output);
		
		//div[@class='application_details']/p

	}

}
