package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*19) difference between assert and verify?*/
public class AssertAndVerify {
	@Test
	 public void testMultiply() {
	 System.out.println("Before Error");
	 Assert.assertEquals(21, multiply(10, 5));
	 System.out.println("After Error");
	 }
	 
	 public int multiply(int x, int y) {
	 return x / y;
	 }
	 
	
}
