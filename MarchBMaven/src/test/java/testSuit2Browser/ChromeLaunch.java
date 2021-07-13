package testSuit2Browser;

import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeLaunch {
  @Test
  public void chrome() {
	  WebDriver d;
	  System.setProperty("webdriver.chrome.driver", "F:\\\\Software_Testing\\\\Selenium_Crome_Browser\\\\chromedriver_win32\\\\chromedriver.exe");
		d = new ChromeDriver ();
		d.manage().window().maximize();
		Dimension a =  new Dimension(0,700);
		d.manage().window().setSize(a);
		
		//Point p = new Point(500,0);
		//d.manage().window().setPosition(p);
	    d.get("https://www.zoomcar.com/bangalore/");
  }
}
