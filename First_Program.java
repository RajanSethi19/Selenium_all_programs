package Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Program {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement w = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		w.sendKeys("RajanSethi");
		Thread.sleep(3000);

		String ws = driver.getWindowHandle();
		System.out.println(ws);

		List<WebElement> l = driver.findElements(By.tagName("a"));
		System.out.println(l.size());
		for (WebElement e : l) {

			System.out.println(e.getAttribute("href"));
		}
		// driver.close();

	}

}
