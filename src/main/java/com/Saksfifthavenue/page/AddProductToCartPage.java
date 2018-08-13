package com.Saksfifthavenue.page;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import action.ReusableAction;

public class AddProductToCartPage extends BasePage{
	ReusableAction reusableAction;
	public AddProductToCartPage(WebDriver driver){
		super(driver);
	reusableAction = new ReusableAction(driver);
	}
		
	public String getAddProductToCartPageTitle()
	{
	  return reusableAction.getPageTitle(driver);
	}
	
	public String getAddProductToCartPageTitleText()
	{
		System.out.println();
	  return reusableAction.getPageTitleText(driver);
	}
	
	public void SelectAddProductToCartPage() throws IOException, InterruptedException
	{
		reusableAction.doubleMouseHoverAndClick("//*[@id='TheMensStoreNavMenu']/a","//*[@id='TheMensStoreNavMenu']/ul/li[2]/ul/li[6]/a");
		reusableAction.scrollDown(driver);
		reusableAction.click("//*[@id='designer']");
		reusableAction.click(".//*[@id='refinement-1845'][@name='available-Designer-refinements']");
		reusableAction.click("//*[@id='price']");
		reusableAction.click("//*[@id='refinement-399545627']");
		reusableAction.click("//select[@id='pa-enh-sortby-dropdown']/option[5]");
		reusableAction.click(" //*[@id='color']");
		reusableAction.click("//*[@id='js-pa-layer-color']//ul[1]/li[3]");
		reusableAction.click("//*[@id='size']");
		reusableAction.click(" //*[@id='refinement-4294904062']");
		reusableAction.click("//*[@id='fit']");
		reusableAction.click("//*[@id='refinement-4294903515']");
		reusableAction.click("//*[@id='wash']");
		reusableAction.click("//*[@id='refinement-4294904446']");
		reusableAction.click("//*[@id='js-pa-layer-wash']//a[@class='action-link sfa-pa-refine-apply-button sfa-button transactional']");
		reusableAction.scrollDown(driver);
		reusableAction.click("//*[@id='img_0400093012635-0']");
		reusableAction.click("//li[@class='product-variant-attribute-value product-variant-attribute-value--text'][2]");
		reusableAction.click("//button[@class='hbc-button hbc-button--full hbc-button--primary product__add-to-bag-button']");
		reusableAction.click("//a[@class='sfa-button small transactional']");
	}
	
public   void gotoMenJeansPage() throws InterruptedException
	{
		String mendropDownList = "//*[@id='TheMensStoreNavMenu']/a";
		String jeans ="//*[@id='TheMensStoreNavMenu']/ul/li[2]/ul/li[6]/a";
		reusableAction.doubleMouseHoverAndClick(mendropDownList, jeans);
		}
	
public void selectDesigner() {
	String designer = "//*[@id='designer']";
	reusableAction.click(designer);
}

public void selectArmaniJeans() {
	String armaniJeans = ".//*[@id='refinement-1845'][@name='available-Designer-refinements']";
	reusableAction.click(armaniJeans);
}

public void selectPrice() {
	String price = "//*[@id='price']";
	reusableAction.click(price);	
}

public void selectPriceRefinementsCheckBox(){
	String priceRefinements = "//*[@id='refinement-399545627']";
	reusableAction.click(priceRefinements);	
}

public void selectSortByDropDownList(){
	String sortByDropDownList = "//select[@id='pa-enh-sortby-dropdown']/option[5]";
	reusableAction.click(sortByDropDownList);	
}

public void selectColorSelectionBtn(){
	String colorSelectionBtn = " //*[@id='color']";
	reusableAction.click(colorSelectionBtn);	
}

public void selectBlackcolorBtn(){
	String blackcolorBtn = "//*[@id='js-pa-layer-color']//ul[1]/li[3]";
	reusableAction.click(blackcolorBtn);	
}

public void selectSizeBtn(){
		String sizeBtn = "//*[@id='size']";
	reusableAction.click(sizeBtn);
}

public void selectSizeCheckBox() {
	String sizeCheckBox = " //*[@id='refinement-4294904062']";
	reusableAction.click(sizeCheckBox);
}

public void selectFitBtn() {
	String fitBtn = "//*[@id='fit']";
	reusableAction.click(fitBtn);
}
public void selectFitSelection() {
	String fitSelection = "//*[@id='refinement-4294903515']";
	reusableAction.click(fitSelection);
}
public void selectWashBtn() {
	String washBtn ="//*[@id='wash']";
	reusableAction.click(washBtn);
}
public void selectWashSelection(){
	String washSelection = "//*[@id='refinement-4294904446']";
	reusableAction.click(washSelection);
}

public void selectApplyBtn() {
	String applyBtn ="//*[@id='js-pa-layer-wash']//a[@class='action-link sfa-pa-refine-apply-button sfa-button transactional']";
	reusableAction.click(applyBtn);
}
public void selectSelectedItemDieselJeans() throws InterruptedException{
	String selectedItemDieselJeans = "//*[@id='product-0400093012635']//p[1]/span";
	reusableAction.scrollDown(driver);
	reusableAction.click(selectedItemDieselJeans);
}
public void selectSelectedItemSize32x32(){
	String selectedItemSize32x32 = " .//*[@id='pdp-content-area']//article/section[2]/section[3]/div//ul/li[2]";
	reusableAction.click(selectedItemSize32x32);
}
public void selectAddToBagBtn() {
	String addToBagBtn = "//button[@class='hbc-button hbc-button--full hbc-button--primary product__add-to-bag-button']";
	reusableAction.click(addToBagBtn);
}

public void selectViewMyBagCheckoutBtn(){
	String viewMyBagCheckoutBtn = "//a[@class='sfa-button small transactional']";
	reusableAction.click(viewMyBagCheckoutBtn);
}
	
}


