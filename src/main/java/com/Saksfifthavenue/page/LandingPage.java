package com.Saksfifthavenue.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(how = How.ID , using = "email-popup-container")
	WebElement welcomeModalMsg;
	@FindBy(how = How.ID, using = "close-button")
	WebElement closeDialog;
	
	
	
	public void closewelcomeDialog()
	{
		closeDialog.click();

	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	wait.pollingEvery(100, TimeUnit.MILLISECONDS);
	wait.withTimeout(10, TimeUnit.SECONDS);

			
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("close-button")));
		driver.findElement(By.id("close-button")).click();
}
	
	public boolean verifyhomepageTitle()
	{
		String actualTitle = "Designer Women's Apparel, Men's Apparel, Shoes & Handbags - Saks.com";
		String expectedTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			
			return true;
		}
		else
			return false;
	}
	
	

}
