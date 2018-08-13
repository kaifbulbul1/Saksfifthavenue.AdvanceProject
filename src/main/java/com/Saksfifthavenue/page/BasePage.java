package com.Saksfifthavenue.page;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import action.ExplicitWaitUtils;
public class BasePage {

	protected WebDriver driver;
	//public By popUpBox = By.xpath("//div[@class='fsrFloatingContainer']");
	//public By closeButton = By.xpath("//div[@class='fsrFloatingContainer']//a[@class='fsrCloseBtn']");
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public HomePage openApplication()
	{
		driver.navigate().to("http://www.saksfifthavenue.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement DialogMsg = driver.findElement(By.xpath("//div[@id='generic-modal']"));
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(DialogMsg));
		WebElement iFrame= driver.findElement(By.xpath("//div[@id='generic-modal']/iframe"));
		driver.switchTo().frame(iFrame);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@id='close-button']"))).build().perform();
		builder.click().perform();
		driver.switchTo().defaultContent();
		return new HomePage(driver);
	}
   
/*	public void closPopup(){
		
			List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
			System.out.println("TotalFrame:" + frameList.size());
			for(WebElement e: frameList){
				driver.switchTo().frame(e);
				
				try{
					WebElement element = driver.findElement(By.cssSelector(".sidebar2__close.proper-icon-close.sidebar2__close--desktop.js-sidebar-close"));
					
					element.click();
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				
				driver.switchTo().defaultContent();
			}
		}*/

	
	public void CloseDialogMsg(WebElement element)
	{
		WebElement DialogMsg = driver.findElement(By.cssSelector(".sidebar2__close.proper-icon-close.sidebar2__close--desktop.js-sidebar-close"));
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(DialogMsg));
		WebElement iFrame= driver.findElement(By.cssSelector(".sidebar2__close.proper-icon-close.sidebar2__close--desktop.js-sidebar-close/iframe"));
		driver.switchTo().frame(iFrame);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("html/body/div[2]/a[1]"))).build().perform();
		builder.click().perform();
		driver.switchTo().defaultContent();
	}
	
	/*public void CloseogMsg(WebElement element)
	{
		WebElement DialogMsg = driver.findElement(By.cssSelector(".fsrCloseBtn"));
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(DialogMsg));
	}*/
	
	public void ClosePopUpMsg(){
		ExplicitWaitUtils wait = new ExplicitWaitUtils(driver);
		WebElement popupDialge = null;
		try{
			popupDialge = wait.waitForElement(By.xpath("//div[@class='fsrFloatingContainer']"), 01);
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		if(popupDialge!=null){
			WebElement closeButton = popupDialge.findElement(By.cssSelector(".fsrCloseBtn"));
			closeButton.click();
		}
		
	}
	

	public void jsClick(WebElement element){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void jsScrollElementIntoView(WebElement element){
		((JavascriptExecutor) driver). executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void highlight(WebElement element) {
		for (int i = 0; i < 2; i++)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", 
					element, "border: 2px solid green;");
			delayFor(200);
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
			delayFor(200);
		}
	}
	public void verifTitle (String expected){
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	public void delayFor(int timeInMili) {
		try{
			Thread.sleep(timeInMili);
		}catch (InterruptedException e){
		}
	}
}
