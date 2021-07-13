package actitimeTestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart {
	
	
	WebDriver d;
	
	@Test
	public void openbrowser()
	   {
		   System.setProperty("webdriver.chrome.driver", "F:\\\\Software_Testing\\\\Selenium_Crome_Browser\\\\chromedriver_win32\\\\chromedriver.exe");
			d = new ChromeDriver ();
		    d.manage().window().maximize();
			d.navigate().to("https://www.flipkart.com/");
			
			d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8055208763");
			d.findElement(By.xpath("//input[@type='password']")).sendKeys("8055208763");
			d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

			WebElement logo = d.findElement(By.xpath("//div[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img"));

		Actions a = new Actions(d);
		a.moveToElement(logo).perform();
	   }
}
