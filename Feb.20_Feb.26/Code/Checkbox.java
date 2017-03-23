package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*15) how to know if checkbox is checked or not in webpage.*/
public class Checkbox {
	public static void main(String[] args){
	 // Store all the elements of same category in the list of WebLements	
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	// Launch the URL
	driver.get("http://toolsqa.wpengine.com/automation-practice-form");


	// List<WebElement>  oRadioButton = driver.findElements(By.name("sex"));

	/* // Create a boolean variable which will hold the value (True/False)

	 boolean bValue = false;

	 // This statement will return True, in case of first Radio button is selected

	 bValue = oRadioButton.get(0).isSelected();

	 // This will check that if the bValue is True means if the first radio button is selected

	 if(bValue = true){

		// This will select Second radio button, if the first radio button is selected by default

		oRadioButton.get(1).click();

	 }else{

		// If the first radio button is not selected by default, the first will be selected

		oRadioButton.get(0).click();

	 }
*/	 
	 // Find the checkbox or radio button element by Name

	 List oCheckBox = driver.findElements(By.name("tool"));

	 // This will tell you the number of checkboxes are present

	 int iSize = oCheckBox.size();

	 // Start the loop from first checkbox to last checkboxe

	 for(int i=0; i < iSize ; i++ ){

		 // Store the checkbox name to the string variable, using 'Value' attribute

		 String sValue = ((WebElement) oCheckBox.get(i)).getAttribute("value");

		 // Select the checkbox it the value of the checkbox is same what you are looking for

		 if (sValue.equalsIgnoreCase("Selenium IDE")){

			 ((WebElement) oCheckBox.get(i)).click();

			 // This will take the execution out of for loop

			 break;

			 }

		}
}
}
