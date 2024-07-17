package SourceFiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import dev.failsafe.internal.util.Durations;

public class Launch_Quite_Browser 
{
	 public static WebDriver driver;
	@BeforeMethod
	public void Launch_Browser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	/*
	
	@AfterMethod 
	
	public void Quite_Browser() {
		
		driver.close();
		
	} */
	

}
