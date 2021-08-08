package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Java\\software\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		WebElement imageElement=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='post-thumb-img-content post-thumb']/img")));
		
		String imageURL=imageElement.getAttribute("src");
		System.out.println("URL of the image is "+imageURL);
		driver.close();
		//String image = driver.findElement(By.className("attachment-large size-large wp-post-image")).getText();
		/*
		 * { System.out.println("The heading of current page is :: " +image);
		 * 
		 * System.out.println("The URl of the image is:::  " +
		 * driver.findElement(By.xpath("//img")).getAttribute("src")); driver.close(); }
		 */}}
		