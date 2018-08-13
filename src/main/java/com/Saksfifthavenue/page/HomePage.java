package com.Saksfifthavenue.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import action.ObjectReader;
import action.ReusableAction;

public class HomePage extends BasePage {
		ReusableAction reusableAction;
		public HomePage(WebDriver driver) {
			super(driver);
			reusableAction = new ReusableAction(driver);
		}
		 public void searchNewItems()
		 {
		    	ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
		    	reusableAction.clearText(hPageObj.getObject("searchTextboxField"));
		    	reusableAction.sendText(hPageObj.getObject("searchTextboxField"),("Search new items"));
				//reusableAction.click("searchButton");
		    	reusableAction.jsClick(driver.findElement(By.xpath("//*[@data-qa-id='submit-search']")));
			    }
		 
		 public SignInPage gotoSignInPage()
		{
			ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
			String signInLink = hPageObj.getObject("signInLink");
			//String signInPage = hPageObj.getObject("signInPage");
			//reusableAction.doubleMouseHoverAndClick(signInLink, signInPage);
			reusableAction.click(signInLink);
			return new SignInPage(driver);
		}
		 public CreateAccountPage gotoCreateAccountPageLink()
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String createAccountPageLink = hPageObj.getObject("createAccountPageLink");
				reusableAction.click(createAccountPageLink);
				return new CreateAccountPage(driver);
			}
		 public void  gotoDesignersPage() throws InterruptedException 
			{
		 
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String designers = hPageObj.getObject("designers");
				reusableAction.singleMouseHoverAndClick(designers);
				reusableAction.click(designers);
				ClosePopUpMsg();
				//return new DesignersPage(driver);
			}
		 public void  gotoWomensApparelPage()throws InterruptedException
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String womensApparel = hPageObj.getObject("womensApparel");
				reusableAction.singleMouseHoverAndClick(womensApparel);
				reusableAction.click(womensApparel);
				ClosePopUpMsg();
				//return new WomensApparelPage(driver);
			}
		 public void  gotoShoesPage()throws InterruptedException
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String shoes = hPageObj.getObject("shoes");
				reusableAction.singleMouseHoverAndClick(shoes);
				reusableAction.click(shoes);
				ClosePopUpMsg();
				//return new ShoesPage(driver);
			}
		 public void  gotoHandbagsPage()throws InterruptedException
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String handbags = hPageObj.getObject("handbags");
				reusableAction.singleMouseHoverAndClick(handbags);
				reusableAction.click(handbags);
				ClosePopUpMsg();
				//return new HandbagsPage(driver);
			}
		 public void  gotoJewelryAccessoriesPage()throws InterruptedException
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String jewelryAccessories = hPageObj.getObject("jewelryAccessories");
				reusableAction.singleMouseHoverAndClick(jewelryAccessories);
				reusableAction.click(jewelryAccessories);
				ClosePopUpMsg();
				//return new JewelryAccessoriesPage(driver);
			}
		 public void  gotoBeautyPage()throws InterruptedException
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String beauty = hPageObj.getObject("beauty");
				reusableAction.singleMouseHoverAndClick(beauty);
				reusableAction.click(beauty);
				ClosePopUpMsg();
				//return new BeautyPage(driver);
			}
		 public void  gotoMenPage()throws InterruptedException
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String men = hPageObj.getObject("men");
				reusableAction.singleMouseHoverAndClick(men);
				reusableAction.click(men);
				ClosePopUpMsg();
				//return new menPage(driver);
			}
		 public void  gotoKidsPage()throws InterruptedException
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String kids = hPageObj.getObject("kids");
				reusableAction.singleMouseHoverAndClick(kids);
				reusableAction.click(kids);
				ClosePopUpMsg();
				//return new KidsPage(driver);
			}
		 public void  gotoHomePage()throws InterruptedException
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String home = hPageObj.getObject("home");
				reusableAction.singleMouseHoverAndClick(home);
				reusableAction.click(home);
				ClosePopUpMsg();
				//return new HomePage(driver);
			}
		 public void  gotoSalePage() throws InterruptedException
			{
				ObjectReader hPageObj = new ObjectReader("C:\\Users\\PaxoTech Student\\workspace02\\Saksfifthavenue.AdvanceProject\\Object\\HomePage.properties");
				String sale = hPageObj.getObject("sale");
				reusableAction.singleMouseHoverAndClick(sale);
				reusableAction.click(sale);
				ClosePopUpMsg();
				//return new SalePage(driver);
			}
		}

   		
		
	   


