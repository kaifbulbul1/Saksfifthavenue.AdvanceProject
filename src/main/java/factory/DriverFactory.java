package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import dataprovider.ConfigDataProvider;

public class DriverFactory {
static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			ProfilesIni profiles = new ProfilesIni();
			FirefoxProfile seleniumProfile = profiles.getProfile("Selenium");
			driver = new FirefoxDriver(seleniumProfile);
			
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",new ConfigDataProvider().getChromePath());
			driver = new ChromeDriver();		
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", new ConfigDataProvider().getIEPath());
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
	
	public static void quitBrowser()
	{
		driver.quit();
	}

}
