/**
 * 
 */
package com.Saksfifthavenue.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutProductPage {
	WebDriver driver;
	public CheckOutProductPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	@FindBy(how = How.ID, using = "jsStartCheckout")
	WebElement checkOut;

	
	public void proceedforcheckOut()
	{
		checkOut.click();
		
	}
	
}

