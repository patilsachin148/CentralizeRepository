package googleTravel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travel {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software_Testing\\\\Selenium_Crome_Browser\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver ();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.google.com/");
		
		d.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(3000);
		WebElement element = d.findElement(By.xpath("//iframe[@role='presentation']"));
		d.switchTo().frame(element);
		
		d.findElement(By.xpath("//a[@href='https://www.google.com/travel/?dest_src=al']")).click();;
		

}
}
