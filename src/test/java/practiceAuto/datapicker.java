package practiceAuto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datapicker {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("travname")).sendKeys("Priya");
		driver.findElement(By.id("travlastname")).sendKeys("Rama");
		driver.findElement(By.id("order_comments")).sendKeys("Enjoy");
		driver.findElement(By.id("dob")).click();
		
		Select monthslt = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthslt.selectByVisibleText("Feb");
		
		Select yearslt = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yearslt.selectByVisibleText("2010");
		
		//table[@class='ui-datepicker-calendar']//td
		
		String date="12";
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt :dates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Visa application" +Keys.ENTER);
		
		driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Iran" +Keys.ENTER);
		
		driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Bihar" +Keys.ENTER);
		
        		
		
		

	}

}
