package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Google_Scenario {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.name("q"));
		
		w.sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		
		
	}

}
