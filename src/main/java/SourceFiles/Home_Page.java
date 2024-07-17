package SourceFiles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {

	
	 WebDriver driver;
	 
	 
	@FindBy(id="nav-link-accountList") WebElement SigninButton;
	@FindBy(xpath="//input[@name='email']") WebElement Enter_UserName;
	@FindBy(xpath="//span[@id='continue']") WebElement Continue;
	@FindBy(xpath="//input[@id='ap_password']") WebElement Enter_Passwd;
	@FindBy(xpath="//input[@id='signInSubmit']") WebElement SignIn;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement SearchBox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']") WebElement SearchBoxClick;
    @FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]") WebElement SearchProduct;
	@FindBy(id="submit.add-to-cart") WebElement AddToCart;
	@FindBy(name="proceedToRetailCheckout") WebElement ProceedToBuy;
//	@FindBy(id="cvfPhoneNumber") WebElement phoneNum;
	//@FindBy(name="cvf_action") WebElement ContinueClick;
	
	@FindBy(css="#shipToThisAddressButton>span>input") WebElement UseThisAddress;
	
	

	
	
	public void Signin() 
	{
		SigninButton.click();
	}
	
	public void UserName() 
	{
		Enter_UserName.sendKeys("priyasram373@gmail.com");
	}
	
	public void Continue() 
	{
		Continue.click();
	}
	
	public void Password() 
	{
		Enter_Passwd.sendKeys("Cucumber@373");;
	}
	
	public void sign() 
	{
		SignIn.click();
	}
	
	public void Searchbox() 
	{
		SearchBox.sendKeys("shoe");
		SearchBox.sendKeys(Keys.ENTER);
	}
	
	public void SearchboxClick() 
	{
		SearchBoxClick.click();
		
	}
	
	public void SearchProd() 
	{
		SearchProduct.click();
		
	}
	
	public void SwitchToChildTab() 
	{
		 Set<String> handle =driver.getWindowHandles();
		  Iterator <String> itarate =handle.iterator();
		  itarate.next();
		  String Child_tab =itarate.next();
		  driver.switchTo().window(Child_tab);
		
	} 
	
	public void addToCart() 
	{
		AddToCart.click();
		
	}
	
	public void Proceedtobuy() 
	{
		ProceedToBuy.click();
		
	}
	
	public void UseAddress() 
	{
		UseThisAddress.click();
		
	}
	
	
	public void wait_until_payment_Method_Visible() 
	{
		WebDriverWait Mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//div[@class='a-radio'])/label/input)[3]")));
		
		
	}
	
	public void Credit_debitcard() 
	{
		
		
		
	}
	
	
	//((//div[@class='a-radio'])/label/input)[1]
	
	
	
	
	public Home_Page(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
}
