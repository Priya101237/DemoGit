package practiceAuto;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		  TakesScreenshot ts = driver;
	 	  
	 	  WebElement img =driver.findElement(By.xpath("//div[@class='titlewrapper']//h1"));
	 	  File src = img.getScreenshotAs(OutputType.FILE);
	 	 File target= new File("C:\\Users\\premj\\eclipse-workspace\\DemoGit\\ScreenShots\\screen.png");
	 	  FileUtils.copyFile(src, target);
	 	  
	 	

	}

}
