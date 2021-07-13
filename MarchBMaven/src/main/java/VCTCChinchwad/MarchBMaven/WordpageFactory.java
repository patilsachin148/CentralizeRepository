package VCTCChinchwad.MarchBMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WordpageFactory {
	
	WebDriver d;
	    WebElement user = d.findElement(By.xpath("//input[@id='usernameOrEmail']")) ;
	    @FindBy(xpath="//input[@id='usernameOrEmail']")
	    private WebElement un;
	    @FindBy(xpath="//button[@type='submit']")
	    private WebElement con;
	    @FindBy(xpath="//input[@type='password']")
	    private WebElement pwd;
	    @FindBy(xpath="//button[@type='submit']")
	    private WebElement login;
	    
	    
	    
	    
	    
	    public WordpageFactory (WebDriver d)
	    {
	    	PageFactory.initElements(d,this);
	    }
	    public void username()
	    {
	    	un.sendKeys("mayujain34@gmail.com");
	   	//JavascriptExecutor js = ((JavascriptExecutor)d);
	   	//js.executeScript("arguments[0].value='mayujain34@gmail.com';", user);
	 	
	    }
	    public void continueButton()
	    {
	    	con.click();
	    	//d.findElement(By.xpath("//span[@class=\"form-password-input__toggle form-password-input__toggle-visibility\"]")).click();
	    	   	
	    }
	    public void pwd()
	    {
	    	pwd.sendKeys("Mayu@7663");
	    }
	    public void login()
	    {
	    	login.click();
	    }
	}


