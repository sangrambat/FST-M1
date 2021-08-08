package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {

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
		WebElement  actualsigninlink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='wp-menu-name'][text()='Job Listings']")));
		actualsigninlink.click();
		WebElement  addnewjob = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='wrap']//a[text()='Add New']")));
		addnewjob.click();
				
		
		WebElement  location = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Location:')]/following-sibling::input")));
		location.clear();
		location.sendKeys("abcd");
		
		WebElement  appURL = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Application email/URL:')]/following-sibling::input")));
		appURL.clear();
		appURL.sendKeys("abcd.com");
		
		String positionText="Position3";
		WebElement  position = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@placeholder='Position']")));	
		position.sendKeys(positionText);
		
		WebElement  publish = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Publish…']")));
		publish.click();
		
		WebElement  confirmPublish = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Publish']")));
		confirmPublish.click();
		WebElement  logohome = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='View Posts']")));
		logohome.click();
		
		
		WebElement  tableRowOneData = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody[@id='the-list']/tr[1]/td[1]/div/a")));
		
		if(tableRowOneData.getText().equalsIgnoreCase(positionText)) {
			System.out.println("job listing showing sucessfully");
		}else {
			System.out.println("Test Case Failed");
		}
	}

}
