package selenium;
/*8) How to handle multiple windows in selenium webdriver?*/


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultiWindowHandle {
	  

		WebDriver driver ;
		@Before
		 public void setup() throws Exception {
		 driver=new FirefoxDriver();
		 String URL="https://accounts.google.com/signup";
		 driver.get(URL);
		 driver.manage().window().maximize();
		 }
		 @Test
		 public void test() throws Exception {
			 //opening help window
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		//opening child window
		System.out.println(driver.getTitle());
		// Performing actions on child window
				 driver.findElement(By.xpath(".//*[@id='gb']/div[2]/div[4]/div/a")).click();
				 
				 Thread.sleep(1000);driver.findElement(By.id("Email")).sendKeys("akhil534nvn@gmail.com"); // enter mail id
				   Thread.sleep(1000);
				   driver.findElement(By.id("next")).click();// click next
				   Thread.sleep(1000);
				   driver.findElement(By.id("Passwd")).sendKeys("akhil534");// enter password
				   Thread.sleep(1000);
				   driver.findElement(By.id("signIn")).click();//click sigin button
				   Thread.sleep(1000);
				   driver.findElement(By.xpath(".//*[@id='gb']/div[2]/div[4]/div/div[3]/div/a/span")).click(); // click on user account
				   Thread.sleep(1000);
				   driver.findElement(By.id("gb_71")).click(); // click sign out
				   Thread.sleep(2000);

		driver.switchTo().window(parentid);
		//switching to again parent window
		System.out.println("Switching Back to Parent");
		
		 //Performing some actions on Parent Window
		 driver.findElement(By.id("link-signin")).click();
		 Thread.sleep(1000);
		   driver.findElement(By.id("Passwd")).sendKeys("akhil534");// enter password
		   Thread.sleep(1000);
		   driver.findElement(By.id("signIn")).click();//click sigin button
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click(); // click on user account
		    Thread.sleep(1000);
		   driver.findElement(By.id("gb_71")).click(); // click sign out
		   Thread.sleep(5000);

		System.out.println(driver.getTitle());
	}
		 @After
		  public void close() {
		  driver.quit();
		  }
}
		