package practiceAuto;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
         
		

		driver.findElement(By.id("name")).sendKeys("Priya");
		driver.findElement(By.id("email")).sendKeys("Rama@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9865230041");
		driver.findElement(By.id("textarea")).sendKeys("saravanampatti");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("sunday")).click();
		Select st = new Select(driver.findElement(By.id("country")));
		st.selectByVisibleText("Canada");
		
		//ultiple select dropdown
		WebElement colors =driver.findElement(By.id("colors"));
		Select multiple = new Select(colors);
	    boolean ismul=	multiple.isMultiple();
	    System.out.println("Is Multiple" +ismul);
        
	    driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/17/2024");
        
	    //AutoSuggestionDropdown
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
        
        List<WebElement> options = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div//a"));
          options.size();
        
        for(int i=0; i<options.size();i++)
        {
        	        
        System.out.println(options.get(i).getText());
	     }
        
         //SimpleAlert
         driver.findElement(By.xpath("//button[text()='Alert']")).click();
          Alert at=driver.switchTo().alert();
          System.out.println(at.getText());
          at.accept();
          
          //Confirm Alert
          driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
          Alert at2=driver.switchTo().alert();
          System.out.println(at.getText());
          at2.accept();
          
          //Promt Alert
          driver.findElement(By.xpath("//button[text()='Prompt']")).click();
          Alert at3=driver.switchTo().alert();
          System.out.println(at.getText());
          at3.sendKeys("priya");
          at3.accept();
          String name=  driver.findElement(By.id("demo")).getText();
          System.out.println(name);
          
        //Double Click  
         WebElement button =driver.findElement(By.xpath("//button[text()='Copy Text']"));
 		Actions act = new Actions(driver);
 		act.doubleClick(button).build().perform();
 		
 		//drag and Drop
 		
 		Actions act2 = new Actions(driver);
 	    WebElement dragbox=	driver.findElement(By.id("draggable"));
 	   WebElement dropbox=	driver.findElement(By.id("droppable"));
 	  act2.dragAndDrop(dragbox, dropbox).build().perform();
 	  
 	  //Frame
 	  
 	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame-one796456169']")));
 	  
 	  driver.findElement(By.id("RESULT_TextField-0")).sendKeys("priya");
 	 // driver.findElement(By.xpath("//input[@id='RESULT_RadioButton-1_0']")).click();
 	  driver.findElement(By.id("RESULT_TextField-2")).sendKeys("07/10/2024");
 	  
 	  Select stjob = new Select(driver.findElement(By.id("RESULT_RadioButton-3")));
 	  stjob.selectByVisibleText("QA Engineer");
 	  
    }


	}


