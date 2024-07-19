package Flip;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmi" +Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='REDMI 12 5G (Pastel Blue, 128 GB)']")).click();
		Set<String>  h=driver.getWindowHandles();
		System.out.println(h);
		for(String v:h)
		{
			driver.switchTo().window(v);
		}
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		

	}

}
