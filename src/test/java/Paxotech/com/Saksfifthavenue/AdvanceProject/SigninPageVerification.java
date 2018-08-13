package Paxotech.com.Saksfifthavenue.AdvanceProject;

import java.io.IOException;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import com.Saksfifthavenue.page.HomePage;
//import com.Saksfifthavenue.page.SignInPage;
import com.relevantcodes.extentreports.LogStatus;

public class SigninPageVerification extends ScriptBase {
	//private WebDriver driver;
	//private HomePage hPage;
	//private SignInPage sPage;
	
	/*static SignInPage sPage;
	@Test
	public void validSignInTest() throws InterruptedException
	{
		hPage.gotoSignInPage();
		sPage = new SignInPage(driver);
		try {
			sPage.validsignInToAccount("bilasusa1@gmail.com","testqa123");
			logger.log(LogStatus.PASS,"login successfull");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void signOutFromAccount1()
	{
		sPage.signOutFromAccount();
		logger.log(LogStatus.PASS,"logout successfull");
		
	}*/
	
	@Test(priority = 1)
	public void signInToAccount() throws IOException, InterruptedException{
		hPage.gotoSignInPage();
		//sPage = new SignInPage(driver);
		signInPage.validsignInToAccount("bilasusa1@gmail.com","testqa123");
		reportLogger.log(LogStatus.INFO,"Login Successfull");
	}
	
	@Test(priority = 2)
	public void verifySigninPageTitle()throws InterruptedException{
		String my_title = signInPage.getSigninPageTitle();
		Assert.assertEquals(signInPage.getSigninPageTitle(), "Saks.com");
		Assert.assertTrue(my_title.contains("Saks.com"));
		reportLogger.log(LogStatus.PASS,"Signin Page Title Verified");
		}		
	
	/*@Test(priority = 2)
    public void verifycreateAccountPageLink() throws InterruptedException {
		signInPage.CreateAccountPageLink();
    	reportLogger.log(LogStatus.PASS,"Create Account Link Verified");
	}	 */
	@Test(priority = 3)
	public void signOutFromAccount(){
		signInPage.signOutFromAccount();
		reportLogger.log(LogStatus.INFO,"Signout Successfull");	
	}
}
         

