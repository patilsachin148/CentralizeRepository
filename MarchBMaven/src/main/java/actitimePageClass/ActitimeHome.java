package actitimePageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHome {
	
	@FindBy(xpath = "//img[@height='61']")
	private WebElement logo ;
	
	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logout;
	

	
	public ActitimeHome (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void verifyActitimeLogo () {
		boolean lg = logo.isDisplayed();
		
		if (lg == true) {
			System.out.println("Test case is verified");
		}
		else {
			System.out.println("Test case is failed");
		
		}
		
	}
	public void verifiedActitimeLogout () {
		logout.click();
	}
}


