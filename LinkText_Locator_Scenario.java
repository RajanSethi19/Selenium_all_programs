package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Locator_Scenario {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmail_Link=driver.findElement(By.linkText("Gmail"));
		/*
		 * WebElement Partialgmail_Link=driver.findElement(By.partialLinkText("Gma"));
		 * Partialgmail_Link.click();
		 */
		gmail_Link.click();
		
		


	}

}
