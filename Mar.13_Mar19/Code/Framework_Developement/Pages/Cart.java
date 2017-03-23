package com.org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cart {
	WebDriver driver;
	 
	 public Cart(WebDriver ldriver){
		 this.driver= ldriver;
	 }
	 
	 @FindBy(xpath = ".//*[@id='headerCart']/div[1]/span[1]")
		public WebElement lnkCart;
	    
	    @FindBy(id = "checkout-btn")
		public WebElement btnChkout;	
	   
	    @FindBy(linkText = "Check out with")
		public WebElement btnChkoutPaypal;
	    
	    @FindBy(how = How.CSS, using = "[type='radio']")
	    private List<WebElement> radioButtons;
	    
		@FindBy(id = "quantity_1253764321_0dcdc927-7b71-4c8c-96bb-a6c0a4a396d4")
		public WebElement txtQuantity;
		
		@FindBy(xpath = ".//*[@id='add-to-list-1253764321_0dcdc927-7b71-4c8c-96bb-a6c0a4a396d4 addToList_1253764321_0dcdc927-7b71-4c8c-96bb-a6c0a4a396d4']")
		public WebElement lnkAddList;
		
		@FindBy(xpath = ".//*[@id='cartLineItem_1253764321_0dcdc927-7b71-4c8c-96bb-a6c0a4a396d4']/div/div[2]/div[2]/div/div[1]/div/a")
		public WebElement lnkRemoveCart;
		
		@FindBy(id = "promoCode")
		public WebElement txtPromoCode;
		
		@FindBy(id = "promo-apply")
		public WebElement btnPromocode;
		
		
		
		
		public void itemCheckOut(String quantity, String shipOption) throws InterruptedException{
			lnkCart.click();
			Thread.sleep(2000);
			for(WebElement radio : radioButtons){
			    if(radio.getAttribute("value").contains(shipOption))
			        radio.click();
			    System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
			    System.out.println(radio.getAttribute("value"));  
			}
				
			
			//txtQuantity.click();
			Thread.sleep(2000);
			txtQuantity.sendKeys(quantity);
			Thread.sleep(2000);
			btnChkout.click();
			
			
		}
		
}
