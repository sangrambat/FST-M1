package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Java\\software\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/");
		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement secondHeading = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2")));
		String secondHeadingText = secondHeading.getText();

		if (secondHeadingText.equalsIgnoreCase("Quia quis non")) {
			System.out.println("Second Heading Text is correct");
			driver.close();
		} else {
			System.out.println("incorrect print the 2nd header " + secondHeadingText);
		}
	}

}