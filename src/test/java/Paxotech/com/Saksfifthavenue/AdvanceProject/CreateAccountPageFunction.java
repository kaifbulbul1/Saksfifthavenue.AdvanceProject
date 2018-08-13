

package Paxotech.com.Saksfifthavenue.AdvanceProject;

import java.io.IOException;
import org.testng.annotations.Test;
import com.Saksfifthavenue.page.CreateAccountPage;
import com.relevantcodes.extentreports.LogStatus;

public class CreateAccountPageFunction extends  ScriptBase{

	@Test(priority = 1)
	public void getCreateAccountPageTitle()throws InterruptedException{
		CreateAccountPage cPage = new CreateAccountPage(driver);
		cPage.getCreateAccountPageTitle();
		reportLogger.log(LogStatus.PASS,"CreateAccount Page Title Verified");
		}	

	@Test(priority = 2)
		public void getCreateAccountPageTitleText()throws InterruptedException{
			CreateAccountPage cPage = new CreateAccountPage(driver);
			cPage.getCreateAccountPageTitleText();
			reportLogger.log(LogStatus.PASS,"CreateAccount Page Title Text Verified");
			}		
		
	
	@Test(priority = 3)
	public void inbvalidCustomerCreateAccount() throws IOException
	{
		CreateAccountPage cPage = new CreateAccountPage(driver);
		cPage.invalidAccountCreation();
		reportLogger.log(LogStatus.INFO,"Invalid Customer not able to Create Account");
	}
	
	@Test(priority = 4)
	public void validCustomerCreateAccount() throws IOException
	{
		CreateAccountPage cPage = new CreateAccountPage(driver);
		cPage.validAccountCreation();
		reportLogger.log(LogStatus.INFO,"Valid Customer able to Create Account Successfullt");
	}
}
	



