package testSuit2Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxLaunch {
  @Test
  public void fireFox() {
	  WebDriver f;
	  System.setProperty("webdriver.gecko.driver", "F:\\\\Software_Testing\\\\Selenium_geckodriver\\\\geckodriver-v0.29.1-win32\\\\geckodriver.exe");
		f = new FirefoxDriver();
		f.manage().window().maximize();
		
		Dimension a =  new Dimension(0,700);
		f.manage().window().setSize(a);
		
		Point p = new Point(500,0);
		f.manage().window().setPosition(p);
			
	    f.get("https://www.olacabs.com/");
  
  }
}
