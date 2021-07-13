package VCTCChinchwad.MarchBMaven;


	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class WordHomepageTestNG
	{
	     @FindBy(xpath="//div[@id=\"primary\"]/main/div[1]/header/h1")
	     private WebElement logo;
	     @FindBy(xpath="//header[@id=\"header\"]/a[3]")
	     private WebElement profile;
	     @FindBy(xpath="//button[@class='button sidebar__me-signout-button is-compact']")
	     private WebElement logout;
	     WebDriver d;
	     
	     public WordHomepageTestNG(WebDriver d)
	     {
	    	 PageFactory.initElements(d,this);
	     }
	    
	     
	     public void verifylogo() throws InterruptedException
	     {
	    	 Thread.sleep(5000);
	    	boolean c =  logo.isDisplayed();
	    	if(c==true)
	    	{
	    		System.out.println("Test Passed");
	    	}
	     }
	     public void verifyprofile() throws InterruptedException
	     {
	    	 Thread.sleep(5000);
	    	 profile.click();
	    	 Thread.sleep(5000);
	     }
	     public void verifylogout() throws InterruptedException
	     {
	    	 Thread.sleep(3000);
	    	 logout.click();
	     }
	}


