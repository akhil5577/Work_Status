package selenium;
/*7) How to save screen shots using selenium webdriver?*/
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver DRIVER = new FirefoxDriver(); //open browser
		   DRIVER.get("http://www.google.com");//redirect url
		   
		System.out.println("hello world");
		File scrFile =(File) ((TakesScreenshot)DRIVER).getScreenshotAs(OutputType.FILE);
        org.apache.commons.io.FileUtils.copyFile(scrFile, new File("d://screeny.png"));

	}

}
