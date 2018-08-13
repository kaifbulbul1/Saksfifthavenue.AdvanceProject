
package Paxotech.com.Saksfifthavenue.AdvanceProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Saksfifthavenue.page.AddProductToCartPage;
import com.Saksfifthavenue.page.CreateAccountPage;
import com.Saksfifthavenue.page.HomePage;
import com.Saksfifthavenue.page.SignInPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import factory.DriverFactory;

public abstract class ScriptBase {

	protected static WebDriver driver; 
	HomePage hPage;
	CreateAccountPage cPage;
	SignInPage signInPage;
	AddProductToCartPage addCart;
	ExtentReports report;
	ExtentTest reportLogger;
	
	@BeforeClass
	@Parameters("Browser")
	public void setUp(String browserName)
	{
		driver = DriverFactory.getBrowser(browserName);
		driver.manage().deleteAllCookies();
		report = new ExtentReports(".//Reports//SmokeTest//SignintoAccount.html");
		reportLogger= report.startTest("Login To Account");	
		hPage = new HomePage(driver);
		cPage = new CreateAccountPage(driver);
		signInPage = new SignInPage(driver);
		addCart = new AddProductToCartPage(driver);
		hPage.openApplication();
	
		System.out.println("Before Class executed");
	}
	
	@AfterClass
	@Parameters("Browser")
	public void tearDown(String browserName)
	{
		report.endTest(reportLogger);
		report.flush();
		driver.close();
		driver.quit();
		System.out.println("After Class executed");
	}
	}

