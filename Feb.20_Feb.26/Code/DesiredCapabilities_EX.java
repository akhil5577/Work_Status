package selenium;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
/*9)  How  to launch webpage using chrome driver?*/
public class DesiredCapabilities_EX {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver;
		String baseUrl , nodeUrl;
		baseUrl = "https://www.facebook.com";
		nodeUrl = "http://192.168.10.21:5568/wd/hub";

		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WIN8_1);

		driver = new RemoteWebDriver(new URL(baseUrl),capability);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
}
}