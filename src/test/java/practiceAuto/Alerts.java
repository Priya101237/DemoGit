package practiceAuto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("accept")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		driver.findElement(By.id("confirm")).click();
		 Alert atl1=driver.switchTo().alert();
		System.out.println(atl1.getText());
		 atl1.dismiss(); 
		 
		 driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		 Alert atl2=driver.switchTo().alert();
		 System.out.println(atl2.getText());
	     atl2.sendKeys("priya"); 
	     atl2.accept();
	     String  name =driver.findElement(By.id("myName")).getText();
	      System.out.println(name);
	    
	}

}
