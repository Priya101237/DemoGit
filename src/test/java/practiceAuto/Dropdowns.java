package practiceAuto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Dropdowns {

	public static void main(String[] args) {
		
		/*
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns ");
		driver.manage().window().maximize();
		
		Select slt = new Select(driver.findElement(By.id("fruits")));
		slt.selectByVisibleText("Mango");
		
		List<WebElement> options = driver.findElements(By.id("fruits"));
		options.size();
		
		for(int i=0; i<options.size(); i++)
		{
		  System.out.println(options.get(i).getText());
		}
		
		Select slt2 = new Select(driver.findElement(By.id("country")));
		slt2.selectByValue("India");  */
		 
		
		//AutoSuggestions 
		

		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement d=	 driver.findElement(By.xpath("//textarea[@name='q']"));
	 d.sendKeys("Selenium");
	 
	  List<WebElement> autosuggestion =driver.findElements(By.xpath("//div[@id='Alh6id']//ul//li"));
	  
	   int suggestioncount =autosuggestion.size();
	  
	  for(int i=0;i<autosuggestion.size();i++)
	  {
		  System.out.println(autosuggestion.get(i).getText());
	  }	
		
	  autosuggestion.get(suggestioncount-2).click();
		
		

	}

}
