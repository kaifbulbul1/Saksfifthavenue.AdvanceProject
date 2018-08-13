package Paxotech.com.Saksfifthavenue.AdvanceProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class HomePageFuntionality extends ScriptBase{
	 
	@Test(priority = 0)
	public  void verifyHomePage()
	{
		String expectedPageTitle = "Designer Women's Apparel, Men's Apparel, Shoes & Handbags - Saks.com";
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		reportLogger.log(LogStatus.INFO, "PageLoad Successful");
		}
	
	@Test(priority = 2)
	public void navigateToDesignersPage() throws InterruptedException
	{
		hPage.gotoDesignersPage();   
		reportLogger.log(LogStatus.INFO, "Navigate to the Designers Page");
	}
	@Test(priority = 3 )
	public void navigateToWomensApparelPage() throws InterruptedException
	{
		hPage.gotoWomensApparelPage();
		reportLogger.log(LogStatus.INFO, "Navigate to the WomensApparel Page");
	}
	@Test(priority = 4)
	public void navigateToShoesPage() throws InterruptedException
	{
		hPage.gotoShoesPage();
		reportLogger.log(LogStatus.INFO, "Navigate to the Shoes Page");
	}
	@Test(priority = 5)
	public void navigateToHandbagsPage() throws InterruptedException
	{
		hPage.gotoHandbagsPage();
		reportLogger.log(LogStatus.INFO, "Navigate to the Handbags Page");
	}
	@Test(priority = 6)
	public void navigateToJewelryAccessoriesPage() throws InterruptedException
	{
		hPage.gotoJewelryAccessoriesPage();
		reportLogger.log(LogStatus.INFO, "Navigate to the JewelryAccessories Page");
	}
	@Test(priority = 7)
	public void navigateToBeautyPage() throws InterruptedException
	{
		hPage.gotoBeautyPage();
		reportLogger.log(LogStatus.INFO, "Navigate to the Beauty Page");
	}
	@Test(priority = 8)
	public void navigateToMenPage() throws InterruptedException
	{
		hPage.gotoMenPage();
		reportLogger.log(LogStatus.INFO, "Navigate to the Men Page");
	}
	@Test(priority = 9)
	public void navigateToKidsPage() throws InterruptedException
	{
		hPage.gotoKidsPage();
		reportLogger.log(LogStatus.INFO, "Navigate to the Kids Page");
	}
	@Test(priority = 10)
	public void navigateToHomePage() throws InterruptedException
	{
		hPage.gotoHomePage();
		reportLogger.log(LogStatus.INFO, "Navigate to the HomePage");
	}
	@Test(priority = 11)
	public void navigateToSalePage() throws InterruptedException
	{
		hPage.gotoSalePage();
		reportLogger.log(LogStatus.INFO, "Navigate to the Sale Page");
	}
	
	@Test(priority = 12)
	public  void  searchSaleItems()
	{
		hPage.searchNewItems();
		reportLogger.log(LogStatus.INFO, "Search new items");
	}
	
	@Test(priority = 13)
	public void navigateToSignInPage() throws InterruptedException
	{
		hPage.gotoSignInPage();
		reportLogger.log(LogStatus.INFO, "Navigate to the Signin Page");
		
	}
	
	@Test(priority = 14)
    public void verifycreateAccountPageLink() throws InterruptedException {
		signInPage.CreateAccountPageLink();
    	reportLogger.log(LogStatus.PASS,"Create Account Link Verified");
	}	 
	}


	