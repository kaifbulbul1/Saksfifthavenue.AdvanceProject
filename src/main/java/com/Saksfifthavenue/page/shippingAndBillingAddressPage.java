package com.Saksfifthavenue.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class shippingAndBillingAddressPage extends BasePage {
	

	@FindBy(how = How.ID, using = "tab-shipbill")
	private WebElement shippingAndBillingHeader;
	
	@FindBy(how = How.ID, using = "shipTitle")
	private WebElement title;
	
	@FindBy(how = How.ID, using = "shipFirst")
	private WebElement firstName;
	
	@FindBy(how = How.ID, using = "shipMI")
	private WebElement middelName;
	
	@FindBy(how = How.ID, using = "shipLast")
	private WebElement lastName;
	
	@FindBy(how = How.ID, using = "shipCompany")
	private WebElement companyName;
	
	@FindBy(how = How.ID, using = "shipAddress1")
	private WebElement addressLine1;
	
	@FindBy(how = How.ID, using = "shipAddress2")
	private WebElement addressLine2;
	
	@FindBy(how = How.ID, using = "shipCity")
	private WebElement city;
	
	@FindBy(how = How.ID, using = "shipZip")
	private WebElement zipCode;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='makeBilling-wrap']/label/span")
	private WebElement billingAddressBtn;
	
	@FindBy(how = How.ID, using = "shipEmail")
	private WebElement emailAddress;
	
	@FindBy(how = How.ID, using = "shipPhone")
	private WebElement phoneNumber;

	public shippingAndBillingAddressPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}	
	//******************************************Action******************************************//
}
