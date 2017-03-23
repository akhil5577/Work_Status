package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


/*11) how to set language while opening website?*/
public class LanguageSetUp {
	public static void main(String[] args) {
	
		
	// Using Firefox  Browser
	FirefoxProfile fireFoxProfile = new FirefoxProfile();
	// setting language to telugu using firefoz profile
	fireFoxProfile.setPreference("intl.accept_languages","te");
	WebDriver driver = new FirefoxDriver(fireFoxProfile);
	driver.get("https://www.facebook.com/");
	
	
	//Using Chrome Browser :
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\Desktop\\Saibersys\\Training\\selinum\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("–lang= sl");
		ChromeDriver driver1 = new ChromeDriver(options);
		driver1.get("http://google.co.in&#8221");
}
}