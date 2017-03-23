package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
/*9)  How  to launch webpage using chrome driver?*/
public class CromeLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhil\\Desktop\\Saibersys\\Training\\selinum\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com ");
	Thread.sleep(5000);
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			//close the browser
			driver.close();

}
}