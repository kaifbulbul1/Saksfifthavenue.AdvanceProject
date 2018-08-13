package com.Saksfifthavenue.page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import action.ObjectReader;
import action.ReusableAction;

public class CreateAccountPage extends BasePage{
	
	ReusableAction reusableAction;
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		reusableAction = new ReusableAction(driver);
	}
	
	public void invalidAccountCreation()throws IOException
		{
		
		ObjectReader creatAccountPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\CreatAccountPage.properties");
		reusableAction.click(creatAccountPageObj.getObject("signInLink"));
		reusableAction.click(creatAccountPageObj.getObject("createAccountPageLink"));
		reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-first-name"));
		reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-first-name"), "bilas");
		reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-last-name"));
		reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-last-name"), "usa");
		reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-email"));
		reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-email"), "bilasusa1@gmail.com");
		reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-password"));
		reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-password"), "test12345");
		reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-confirm-password"));
		reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-confirm-password"), "test12345");
		reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-phone-number"));
		reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-phone-number"), "3476599893");
		reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-postal-code"));
		reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-postal-code"), "10000");
		reusableAction.clickAction(creatAccountPageObj.getObject("selectRadioButton"));
		reusableAction.clickAction(creatAccountPageObj.getObject("createAccountButton"));
	}

public void validAccountCreation()throws IOException
	
	{
		
	ObjectReader creatAccountPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\CreatAccountPage.properties");
	reusableAction.click(creatAccountPageObj.getObject("signInLink"));
	reusableAction.click(creatAccountPageObj.getObject("createAccountPageLink"));
	reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-first-name"));
	reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-first-name"), "bilas");
	reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-last-name"));
	reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-last-name"), "usa1");
	reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-email"));
	reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-email"), "kaif.bulbul1@gmail.com");
	reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-password"));
	reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-password"), "Testqa123!");
	reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-confirm-password"));
	reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-confirm-password"), "Testqa123!");
	reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-phone-number"));
	reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-phone-number"), "3476599893");
	reusableAction.clearText(creatAccountPageObj.getObject("create-new-account-postal-code"));
	reusableAction.sendText(creatAccountPageObj.getObject("create-new-account-postal-code"), "11423");
	reusableAction.clickAction(creatAccountPageObj.getObject("selectRadioButton"));
	reusableAction.clickAction(creatAccountPageObj.getObject("createAccountButton"));
	}

public String getCreateAccountPageTitle()
{
  return reusableAction.getPageTitle(driver);
}

public String getCreateAccountPageTitleText()
{
	System.out.println();
  return reusableAction.getPageTitleText(driver);
}
}
