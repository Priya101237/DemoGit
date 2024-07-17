package practiceAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();

		driver.findElement(By.name("firstname")).sendKeys("priya");
		driver.findElement(By.name("lastname")).sendKeys("p");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-1")).click();
		driver.findElement(By.id("datepicker")).sendKeys("02-03-2024");
		driver.findElement(By.xpath("//input[@id='profession-0']")).click();
	   







	}

}
