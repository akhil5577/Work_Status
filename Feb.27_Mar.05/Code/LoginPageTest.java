package selenium;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.UnknownHostException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*13) write code to verify any application login page is working or not?*/

		public class LoginPageTest{

	//private HtmlUnitDriver driver;
			WebDriver driver;

	@Before
	public void setup() throws MalformedURLException, UnknownHostException, InterruptedException{
	    driver = new FirefoxDriver();
	    Thread.sleep(5000);
	    driver.get("https://www.facebook.com/");
	}

	@Test
	public void testAuthenticationFailureWhenProvidingBadCredentials(){
	    driver.findElement(By.id("email")).sendKeys("fakeuser");
	    driver.findElement(By.id("pass")).sendKeys("fakepassword");     
	    driver.findElement(By.id("u_0_o")).click();

	    assertTrue(driver.getCurrentUrl().endsWith("failed"));
	}

	@Test
	public void testAuthenticationSuccessWhenProvidingCorrectCredentials(){
	    driver.findElement(By.id("email")).sendKeys("akhilashlakma@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("akhil534");
	    driver.findElement(By.id("u_0_o")).click();

	    assertTrue(driver.getCurrentUrl().endsWith("/<facebook>/"));
	}

	}