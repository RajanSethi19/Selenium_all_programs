package Keys_Function_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// WAP to launch amazon, search shoes then select 5th option
public class Amazon_Scenario_Second {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		search.sendKeys("Shoes");
		Thread.sleep(3000);
		
		for(int i=1;i<=5;i++) {
			Thread.sleep(3000);
			search.sendKeys(Keys.ARROW_DOWN);
		}
		search.sendKeys(Keys.ENTER);
		
	}

}
