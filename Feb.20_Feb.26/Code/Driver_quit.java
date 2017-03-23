package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver_quit {
	public static WebDriver driver;
	public static String baseUrl;
	 
	@BeforeTest
	public void setup(){
	 
	driver = new FirefoxDriver();
	baseUrl="http://www.wikishown.com";
	driver.manage().window().maximize();
	}
	 
	@Test
	public void wikiShown(){
	 
	//Navigate to above website urk
	driver.navigate().to(baseUrl);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 
	}
	@AfterTest
	public void tearDown(){
	driver.quit();
	}
}
