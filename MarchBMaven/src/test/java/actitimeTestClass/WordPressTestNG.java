package actitimeTestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import VCTCChinchwad.MarchBMaven.WordHomepageTestNG;
import VCTCChinchwad.MarchBMaven.WordpageFactory;



public class WordPressTestNG {
	
	WebDriver d;
	   WordpageFactory lg;
	   WordHomepageTestNG hp;
	   
	   @BeforeClass
	   public void openbrowser()
	   {
		   
		   System.setProperty("webdriver.chrome.driver", "F:\\\\Software_Testing\\\\Selenium_Crome_Browser\\\\chromedriver_win32\\\\chromedriver.exe");
			d = new ChromeDriver ();
		    d.manage().window().maximize();
			d.navigate().to("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
			d.findElement(By.xpath("//button [@type=\"button\"]")).click();
			  lg = new WordpageFactory(d);
			    hp = new WordHomepageTestNG(d);
		    
	   }
	   @AfterClass
	   public void closeBrowser()
	   {
		   System.out.println("closing browser");
		   d.close();
	   }
	   @BeforeMethod
	   public void loggin() throws InterruptedException
	   {   
		   System.out.println("Login Successfully");
		   lg.username();
		   Thread.sleep(10000);
		   lg.continueButton();
		   Thread.sleep(5000);
		   //d.switchTo().alert().dismiss();
		   lg.pwd();
		   lg.login();
	   }
	   @AfterMethod
	   public void homepage1() throws InterruptedException
	   {
		  System.out.println("logout successfully");
		   hp.verifyprofile();
		   hp.verifylogout();
		   
	   }
	   @Test
	   public void scenerios() throws InterruptedException
	   {
		  System.out.println("Checked Scnerios");
		 hp.verifylogo();
	   }
	}



