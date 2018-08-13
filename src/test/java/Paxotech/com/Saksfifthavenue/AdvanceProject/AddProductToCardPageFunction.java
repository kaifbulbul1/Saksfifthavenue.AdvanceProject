package Paxotech.com.Saksfifthavenue.AdvanceProject;

import java.io.IOException;

import org.testng.annotations.Test;
import com.Saksfifthavenue.page.AddProductToCartPage;
import com.relevantcodes.extentreports.LogStatus;

public class AddProductToCardPageFunction extends ScriptBase {
	
	//static HomePage hPage;
	//static AddProductToCartPage addCart;
	//AddProductToCartPage addCart = new AddProductToCartPage(driver);
	
	@Test(priority = 1)
	public  void verifyCardPage()
	{
		AddProductToCartPage addCart = new AddProductToCartPage(driver);
		addCart.getAddProductToCartPageTitle();
		addCart.getAddProductToCartPageTitleText();
		reportLogger.log(LogStatus.PASS,"CreateAccount Page Title Verified");
	}	
	
	//@Test(priority = 3)
	public void AddProductToCartPagVerification() throws IOException, InterruptedException
	{
		AddProductToCartPage addCart = new AddProductToCartPage(driver);
		addCart.SelectAddProductToCartPage();
	}
	@Test(priority = 2)
		public void ProductToCartPagVerification() throws IOException, InterruptedException
		{
		AddProductToCartPage addCart = new AddProductToCartPage(driver);
		addCart.gotoMenJeansPage();
		addCart.selectDesigner();
		addCart.selectArmaniJeans();
		addCart.selectPrice();
		addCart.selectPriceRefinementsCheckBox();
		addCart.selectColorSelectionBtn();
		addCart.selectBlackcolorBtn();
		addCart.selectSizeBtn();
		addCart.selectSizeCheckBox();
		addCart.selectFitBtn();
		addCart.selectFitSelection();
		addCart.selectWashBtn();
		addCart.selectWashSelection();
		addCart.selectApplyBtn();
		addCart.selectSelectedItemDieselJeans();
		addCart.selectSelectedItemSize32x32();
		addCart.selectAddToBagBtn();
		addCart.selectViewMyBagCheckoutBtn();
		reportLogger.log(LogStatus.INFO, "Add Product To Cart Page");
		
}	 
	
}
