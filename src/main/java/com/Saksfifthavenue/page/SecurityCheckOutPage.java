
package com.Saksfifthavenue.page;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SecurityCheckOutPage  extends BasePage{
	
	@FindBy(how = How.CSS, using = ".masthead-saksbag-title")
	WebElement saksbagTitle;
	
	@FindBy(how = How.ID, using = "jsSelectShippingMethod")
	WebElement shippingMethodOption;
	
	@FindBy(how = How.XPATH, using = "#jsBagZipCode")
	WebElement zipCodeField;
	
	
		public SecurityCheckOutPage(WebDriver driver)
		{
		super(driver);
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		}
		
//*******************************************Action*******************************************\\	
		public String getPageTitle() {
			String title = driver.getTitle();
			return title;
		}
		
		public boolean verifyPageTitle() {
			String pageTitle = "Saks Bag";
			return getPageTitle().contains(pageTitle);
		}
		public boolean verifyCreateAccountPageText() {
			
			WebElement element = driver.findElement((By) saksbagTitle);
			String pageText ="Saks Bag";
			return element.getText().contains(pageText);
		}
		 public void enterZipCode(String zipCode){
			 highlight(zipCodeField);
			 zipCodeField.clear();
			 zipCodeField.sendKeys("10003");
		    }
		/*public void selectShippingMethodOption()
		{
			Select dropdown = new Select(driver.findElement(By.id("jsSelectShippingMethod")));
			 dropdown.selectByIndex(1);
			//highlight(shippingMethodOption);
			
		
	    }*/
}
	


