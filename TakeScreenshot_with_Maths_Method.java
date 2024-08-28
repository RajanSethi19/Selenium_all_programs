package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import dev.failsafe.internal.util.Maths;

public class TakeScreenshot_with_Maths_Method {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination =new File ("C:\\Users\\hp\\Downloads\\Screenshot_selenium\\rajan" +Math.random()+".png");
		FileHandler.copy(source, destination);

	}

}
