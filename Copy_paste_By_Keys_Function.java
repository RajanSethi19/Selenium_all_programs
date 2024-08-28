package Keys_Function_Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_paste_By_Keys_Function {
// WAP to Copy & Paste the Present address to Permanent address https://grotechminds.com/registration/
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(3000);
		WebElement Present_address= driver.findElement(By.id("Present-Address"));
		Thread.sleep(3000);
		Present_address.sendKeys("House no-1836,C;handigarh");
		Thread.sleep(3000);
		Present_address.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		Present_address.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		WebElement Permanent_address= driver.findElement(By.id("Permanent-Address"));
		Thread.sleep(3000);
		Permanent_address.sendKeys(Keys.CONTROL+"v");
	}

}
