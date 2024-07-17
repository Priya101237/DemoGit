package Amz_Test;

import org.testng.annotations.Test;

import SourceFiles.Home_Page;
import SourceFiles.Launch_Quite_Browser;

public class AMZ_TC extends Launch_Quite_Browser{
	
     @Test
     public void amaz_TC()
     {
    	 Home_Page home = new Home_Page(driver);
    	 home.Signin();
    	 home.UserName();
         home.Continue();;
         home.Password();
         home.sign();
         home.Searchbox();
         home.SearchboxClick();
         home.SearchProd();
         home.SwitchToChildTab();
         home.addToCart(); 
         home.Proceedtobuy();
         home.UseAddress();
         home.wait_until_payment_Method_Visible();
         
       //  home.phonenum();
       //  home.Continuebutton();
        
    	 
     }
	
}
