package action;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.Saksfifthavenue.page.BasePage;



public class ReusableAction extends BasePage {

	public ReusableAction(WebDriver driver) {
		super(driver);
	}
	
	public void click(String elementLink) {
		driver.findElement(By.xpath(elementLink)).click();
		//highlight(elementLink);
				//Thread.sleep(2000);
	}
	
	public void sendKeys(String elementLink, String text){
		driver.findElement(By.xpath(elementLink)).sendKeys(text);
	}
	
	public void ClosePopUpMsg(WebElement element){

	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(10, TimeUnit.SECONDS)
	            .pollingEvery(500, TimeUnit.MILLISECONDS)
	            .ignoring(NoSuchElementException.class);

	        try{
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='fsrFloatingContainer']")));
	        System.out.println("found");
	        }
	        catch(Exception ex){
	        }
	    	        driver.findElement(By.xpath("//div[@class='fsrFloatingContainer']//a[@class='fsrCloseBtn']")).click();
	        }
	
	public void clickAction(String elementLink) {
		driver.findElement(By.xpath(elementLink)).click();
		//highlight(elementLink);
		//Thread.sleep(2000);
	}

	public void sendText(String element, String value) {
		
		driver.findElement(By.xpath(element)).sendKeys(value);
	}
	
	public void clearText(String element) {
		
		driver.findElement(By.xpath(element)).clear();
	}
	public void MouseHover(String elementLink) throws InterruptedException
	{
		Actions build = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(elementLink));
		build.moveToElement(element).build().perform();
		highlight(element);
		//Thread.sleep(2000);
		//build.moveToElement(element).build().perform();
	}
	public void singleMouseHoverAndClick(String elementLink) throws InterruptedException
	{
		Actions build = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(elementLink));
		build.moveToElement(element).build().perform();
		highlight(element);
		Thread.sleep(2000);
		build.moveToElement(element).build().perform();
	}
	
	public void doubleMouseHoverAndClick(String elementLink1,String elementLink2) throws InterruptedException{
		Actions build = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath(elementLink1));
		build.moveToElement(element1).build().perform();
		highlight(element1);
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath(elementLink2));
		build.moveToElement(element2).build().perform();
		highlight(element2);
		Thread.sleep(2000);
		build.click().perform();
		Thread.sleep(2000);
	}
	
	public void clear(String elementLink, String loc){
		//driver.findElement(By.xpath(elementLink)).click();
		   // String locator = getLocator(loc);
			//driver.findElement(By.
	}
	
	public String getPageTitle(WebDriver driver){
		return driver.getTitle();
	}
	
	public String getPageTitleText(WebDriver driver){
		return driver.getTitle();	
	}
	
	public String getElementText(WebElement driver){	
		return driver.getText();	
	}
	
	public void scrollDown(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,300);");
	}
	
	public String getLocator(String locator){
		
		//String id,xpath,name,className,linkText,partialLinkText,cssSelector,tagName;
		if(locator.equalsIgnoreCase("id"))
			return "id";
		else if(locator.equalsIgnoreCase("xpath"))
			return "xpath";
		else if(locator.equalsIgnoreCase("name"))
			return "name";
		else if(locator.equalsIgnoreCase("className"))
			return "className";
		else if(locator.equalsIgnoreCase("linkText"))
			return "linkText";
		else if(locator.equalsIgnoreCase("partialLinkText"))
			return "partialLinkText";
		else if(locator.equalsIgnoreCase("cssSelector"))
			return "cssSelector";
		else if (locator.equalsIgnoreCase("tagName"))
			return "tagName";
		else 
			return " ";
	}
	
	public void jsClick(String elementLink){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", elementLink);
	}
	
	
}











