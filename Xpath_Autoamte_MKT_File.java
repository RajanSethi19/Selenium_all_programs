package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Autoamte_MKT_File {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/hp/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("RajanSethi");
		Thread.sleep(3000);
		WebElement Hint = driver.findElement(By.xpath("//input[@id=\"2\"]"));
		Hint.sendKeys("Raj");
		Thread.sleep(3000);
		WebElement Pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Pass.sendKeys("Automation123");
		Thread.sleep(3000);
		WebElement FName = driver.findElement(By.xpath("(//form/input)[1]"));
		FName.sendKeys("Rajan");
		Thread.sleep(3000);
		
		/*
		 * WebElement submit= driver.findElement(By.xpath("(html/body/form/input)[3]"));
		 * submit.click();
		 */
		WebElement Boy = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		Boy.click();
		Thread.sleep(3000);
		WebElement Girl = driver.findElement(By.xpath("//input[@value=\"Girl\"]"));
		Girl.click();
		Thread.sleep(3000);
		WebElement Baby = driver.findElement(By.xpath("//input[@value=\"baby\"]"));
		Baby.click();
		Thread.sleep(3000);
		WebElement Male = driver.findElement(By.xpath("(//input)[11]"));
		Male.click();
		Thread.sleep(3000);
		WebElement Female = driver.findElement(By.xpath("//input[@type=\"radio\"][2]"));
		Female.click();
		Thread.sleep(3000);
		WebElement Location = driver.findElement(By.xpath("(/html/body/input)[6]"));
		Location.click();
		Thread.sleep(3000);
		WebElement Aboutus = driver.findElement(By.xpath("(/html/body/a)"));
		Aboutus.click();

	}

}
