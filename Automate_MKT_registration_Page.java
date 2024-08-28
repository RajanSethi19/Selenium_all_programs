package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_MKT_registration_Page {

	public static void main(String[] args) throws InterruptedException {
		
		// WAP on registration page 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Rajan");
		//or we can use relative xpath for fname =(((//form)[3]/div)[1]//input)[1]
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Sethi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rajansethi19@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Automation123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id=\"Present-Address\"]")).sendKeys("Chandigarh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"Pincode\"]")).sendKeys("160001");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"relocate\"]")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
