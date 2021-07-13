package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(annotations.LogItestListner.class)

public class FirstTestNGListner {
	
	
		
		@Test(priority= 0)
		public void test1() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "F:\\\\Software_Testing\\\\Selenium_Crome_Browser\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://en.wikipedia.org/wiki/Apache_Maven");
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(2000);
			driver.quit();
		}
		@Test(priority= 1, invocationCount = 3)
		public void Titlematch() {
			System.out.println("Test 2 is dummy");	
			Assert.fail();
		}
		@Test(priority= 2)
		public void Titlematch3() {
			System.out.println("Test 3 is dummy");
		}
	}


