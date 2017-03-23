package selenium;




import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hammer {
	
	WebDriver driver ;
	@BeforeTest
	 public void setup() throws InterruptedException {
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("http://www.homedepot.com");

		driver.findElement(By.id("headerSearch")).sendKeys("hammer");
		driver.findElement(By.id("headerSearchButton")).click();
				}
	@Test
	public  void selectItem() throws InterruptedException {
 String itemText ="HDX rubber";// free shipping  DEWALT 0, Husky 1,HDX 2,Estwing double 4,Striker Tools 5,Estwing Straight 7,Stiletto 8, Stiletto 23,
	// no free shipping HDX rubber 6,Hart 10, husky 15.
	
		String Shipping45 = "Free shipping with $45 order";
		String Shipping = "Free shipping ";
	
		int item;
		switch (itemText) {
		case "DEWALT":
			item = 0;
			break;
		case "Husky":
			item = 1;
			break;
		case "HDX":
			item = 2;
			break;
		case "Estwing double":
			item = 4;
			break;
		case "Striker Tools":
				item = 5;
				break;
		case "HDX rubber":
			item = 6;
			break;
		
		case "Estwing Straight":
			item = 7;
			break;
		case "Stiletto":
			item = 8;
			break;
		case "HART":
			item = 10;
			break;
		case "QEP":
			item = 23;
			break;
		default:
			item = 15;
			break;
		}
		WebElement ParentDiv = (WebElement) driver
				.findElement(By
						.cssSelector(".plp-pod.plp-pod--default.pod-item--"    //plp-pod plp-pod--default pod-item--0
								+ item + ""));
		WebElement ChildDiv = ParentDiv.findElement(By.className("pod-inner"));
		WebElement DescriptionDiv = ChildDiv.findElement(By
				.className("pod-plp__description"));
		WebElement BrandDiv = DescriptionDiv.findElement(By
				.className("pod-plp__brand-name"));
		WebElement FullfillmentDiv = ChildDiv.findElement(By
				.className("pod-plp__fulfillment-message"));
		WebElement ShippingDiv = FullfillmentDiv.findElement(By
				.cssSelector(".alert-inline.alert-inline--success"));
		WebElement AddCartDiv = ChildDiv.findElement(By
				.className("pod-plp__bttn-area"));

		String shippingText = ShippingDiv.getText();
		System.out.println(BrandDiv.getText());
		System.out.println(ShippingDiv.getText());
		System.out.println(AddCartDiv.getText());

		if (BrandDiv != null) {
			if (Shipping45.equalsIgnoreCase(shippingText)
					|| Shipping.equalsIgnoreCase(shippingText)) {
				AddCartDiv.click();
				System.out.println("YOur item added into cart successfully");
			} else {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("alert('Your Item does not have free shipping');");
				Thread.sleep(10000);
				System.out.println(" your item cannot have free shipping");
			}
		} 
	}

	
	 @AfterTest
	  public void close() {
	  driver.quit();
	  }
}