package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username=	driver.findElement(By.id("email"));
		username.sendKeys("stbymkt@gmail.com");
		WebElement password=	driver.findElement(By.id("pass"));
		password.sendKeys("JUYTRER%");	
		WebElement loginbutton=	driver.findElement(By.name("login"));
		//loginbutton.click();
		loginbutton.sendKeys(Keys.ENTER);
	}

}
