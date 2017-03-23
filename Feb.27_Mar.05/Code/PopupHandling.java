package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*12) how to handle windows based popups (upload and dropdown).*/
public class PopupHandling {
		/*Fetching pop-up message in Selenium-WebDriver
		this is the function that would help you in fetching the message
*/
		public static String getPopupMessage(final WebDriver driver) {
		String message = null;
		try {
		Alert alert = driver.switchTo().alert();
		message = alert.getText();
		alert.accept();
		} catch (Exception e) {
		message = null;
		}
		System.out.println("message"+message);
		return message;
		}
		
		
		/*Canceling pop-up in Selenium-WebDriver
		*/
		public static String cancelPopupMessageBox(final WebDriver driver) {
		String message = null;
		try {
		Alert alert = driver.switchTo().alert();
		message = alert.getText();
		alert.dismiss();
		} catch (Exception e) {
		message = null;
		}
		return message;
		}
}