package actitimePageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

	
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName ;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement login;
	
	
	public ActitimeLoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	
	public void setActitimeUserName() {
		userName.sendKeys("admin");
		}
	public void setActitimePassword() {
		password.sendKeys("manager");
		}
	public void verifyLoginButton() {
		login.click();;
		}
	
}
