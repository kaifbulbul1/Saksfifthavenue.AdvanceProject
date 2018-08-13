package com.Saksfifthavenue.page;

import org.openqa.selenium.WebDriver;

import action.ObjectReader;
import action.ReusableAction;

public class SaleItems extends BasePage {
		ReusableAction reusableAction;
		public SaleItems(WebDriver driver) {
			super(driver);
			reusableAction = new ReusableAction(driver);
		}
		 public void searchMenSaleItems(){
			
		    	ObjectReader homePageObject = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
		    	reusableAction.clearText(homePageObject.getObject("searchTextboxField"));
		    	reusableAction.sendText(homePageObject.getObject("searchTextboxField"),("Men Sale items"));
				reusableAction.clickAction("searchButton");
			    }
		 
}
