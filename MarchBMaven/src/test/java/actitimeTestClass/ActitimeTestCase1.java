package actitimeTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actitimePageClass.ActitimeHome;
import actitimePageClass.ActitimeLoginPage;

public class ActitimeTestCase1 {
	
	
	WebDriver driver;
	ActitimeLoginPage login ;
	ActitimeHome  home;
	
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Software_Testing\\Selenium_Crome_Browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login = new ActitimeLoginPage(driver);
		home = new ActitimeHome (driver);
		}
	
	
	@BeforeMethod
	public void actitimelogin() {
		login.setActitimeUserName();
		login.setActitimePassword();
		login.verifyLoginButton();
	}
	
	
	
	
  @Test
  public void scenarioVerifyLogo1() {
	  home.verifyActitimeLogo();
	  System.out.println("Test 1 excuted");
  }
 
  @AfterMethod
	public void actitimelogout() {
		home.verifiedActitimeLogout();
	}
	
  @AfterClass
	public void closeBrowser() {
		driver.close();
	}
  
  
    
}
