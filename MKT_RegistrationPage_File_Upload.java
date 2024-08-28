package File_Upload_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MKT_RegistrationPage_File_Upload {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Rajan");
		driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Sethi");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("rajansethi19@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Automation123");
		driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		driver.findElement(By.xpath("//textarea[@id=\"Present-Address\"]")).sendKeys("Chandigarh");
		driver.findElement(By.xpath("//input[@id=\"Pincode\"]")).sendKeys("160001");
		driver.findElement(By.xpath("//input[@id=\"relocate\"]")).click();
		WebElement choosefile = driver.findElement(By.id("file"));
		choosefile.sendKeys("C:\\Users\\hp\\Downloads\\Rajan_Sethi_Resume_Latest (1).pdf");
		
		// choosefile.sendKeys("location\\Filename.extension");

	}

}
