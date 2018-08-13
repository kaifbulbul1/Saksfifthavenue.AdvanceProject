
package com.Saksfifthavenue.page;
import java.io.IOException;
import org.openqa.selenium.WebDriver;

import action.ObjectReader;
import action.ReusableAction;
import pages.HomePage;

public class SignInPage extends BasePage{
		ReusableAction reusableAction;	
	    public SignInPage(WebDriver driver) {
		super(driver);
		reusableAction = new ReusableAction(driver);
		}
	  
	    public void validsignInToAccount(String id, String pswd) throws IOException
		{
	    	ObjectReader signinPageObject = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\SigninPage.properties");
	    	reusableAction.clearText(signinPageObject.getObject("emailAddressTextBox"));
	    	reusableAction.sendText(signinPageObject.getObject("emailAddressTextBox"),id);
	    	reusableAction.clearText(signinPageObject.getObject("pswdTextBox"));
	    	reusableAction.sendText(signinPageObject.getObject("pswdTextBox"),pswd);
	    	reusableAction.clickAction(signinPageObject.getObject("signInSubmitButton"));
		}
	    
	   public CreateAccountPage CreateAccountPageLink()throws InterruptedException{	
		   ObjectReader signinPageObject = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\SigninPage.properties");
		   reusableAction.scrollDown(driver);
		   reusableAction.clickAction(signinPageObject.getObject("createAccountPageLink"));
			return new CreateAccountPage(driver);
		}	
	   
		public HomePage signOutFromAccount()
		{
			try {
				
				//reusableAction.doubleMouseHoverAndClick(ObjectReader.getObject("welcomeAccountLink"),ObjectReader.getObject("signOutLink"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}

			return new HomePage(driver);
		}	
		
	    public String getSigninPageTitle()
		{
		  return reusableAction.getPageTitle(driver);
		}
		
		public String SignintoAccount(String emailId, String password) throws InterruptedException
		{
			reusableAction.sendKeys("bilasusa1@gmail.com","testqa123");  
			reusableAction.clickAction("submitSignInBtn");
			return driver.getTitle();	
		}
		
		
}
		

		

		
		
		

