package Keys_Function_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Automate {
//WAP to launch google, type India, select 4th auto suggestion from drop
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement w=driver.findElement(By.name("q"));
		
		w.sendKeys("India");
		
		w.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		w.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		w.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		w.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		
	    w.sendKeys(Keys.ENTER);

	}

}
