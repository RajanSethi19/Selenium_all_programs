package Keys_Function_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Functions_Use {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		for(int i=1;i<=10;i++) {
			
			e1.sendKeys(Keys.ARROW_DOWN);
		}
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Computer");
		search.sendKeys(Keys.ENTER);

	}

}
