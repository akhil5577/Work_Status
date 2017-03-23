package com.org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Items {
	WebDriver driver;
	 
	 public Search_Items(WebDriver ldriver){
		 this.driver= ldriver;
	 }
	    @FindBy(id = "headerSearch")
		public WebElement txtSearch;	
	 
		@FindBy(id = "headerSearchButton")
		public WebElement btnSearch;
		
		public  void selectItem(String shipDetails, String itemSearch, String brand) throws InterruptedException {
			 
				
			 txtSearch.sendKeys(itemSearch);
			 btnSearch.click();
			 System.out.println(brand);
					int item;
					switch (brand) {
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
					case "Estwing Straight":
						item = 7;
						break;
					case "Stiletto":
						item = 8;
						break;
					case "HART":
						item = 9;
						break;
					case "QEP":
						item = 23;
						break;
					default:
						item = 15;
						break;
					}
					System.out.println(item);
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
						if(shippingText.contains(shipDetails))
						 {
							AddCartDiv.click();
							System.out.println("YOur item added into cart successfully");
						} else {
							
							JavascriptExecutor js = (JavascriptExecutor) driver;
							Thread.sleep(5000);
							js.executeScript("alert('Your Item does not have free shipping');");
							
							Thread.sleep(5000);
							System.out.println(" your item cannot have free shipping");
						}
					} 

		
		}
}
