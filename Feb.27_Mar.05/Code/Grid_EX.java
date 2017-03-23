package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Grid_EX {

	// Expected Title
	 private String expectedTittle = "Yahoo";

	@Test(dataProvider = "getBrowser")
	 public void verifyTitleTest(String browser) throws MalformedURLException {
	 DesiredCapabilities cap = null;

	// Decide which browser need to invoke
	 if (browser.equalsIgnoreCase("firefox")) {
	 cap = DesiredCapabilities.firefox();
	 cap.setBrowserName("firefox");
	 cap.setPlatform(Platform.ANY);
	 } else if (browser.equalsIgnoreCase("chrome")) {
	 cap = DesiredCapabilities.chrome();
	 cap.setBrowserName("chrome");
	 cap.setPlatform(Platform.ANY);
	 } else if (browser.equalsIgnoreCase("iexplore")) {
	 cap = DesiredCapabilities.internetExplorer();
	 cap.setBrowserName("iexplore");
	 cap.setPlatform(Platform.WINDOWS);
	 }

	WebDriver driver = new RemoteWebDriver(new URL(
	 "http://localhost:4444/wd/hub"), cap);

	// Open the website
	 driver.get("https://in.yahoo.com/");
	 // Get the actual title using selenium code
	 String actualTittle = driver.getTitle();
	 // Verify the page title using by comparison of Actual and Expected
	 Assert.assertEquals(expectedTittle, actualTittle);
	 driver.close();
	 }

	// Use DataProvider to for the Browser Name
	 @DataProvider(parallel = true)
	 public Object[][] getBrowser() {
	 // Array with 3 Rows and one column
	 Object data[][] = new Object[3][1];
	 data[0][0] = "firefox";
	 data[1][0] = "chrome";
	 data[2][0] = "iexplore";
	 return data;
	 }
	}