package com.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Page {

	 WebDriver driver;
	public Register_Page(WebDriver ldriver){
		this.driver= ldriver;
	}
	
	 @FindBy(linkText = "My Account")
		public WebElement lnkMyAccount;	
	 
	 @FindBy(linkText = "Register")
		public WebElement lnkRegister;	
	 	
		@FindBy(xpath = ".//*[@id='dualSignIn-registrationEmail']")
		public WebElement userId;
		
		@FindBy(xpath = ".//*[@id='dualSignIn-registrationPassword']")
		public WebElement userPass;
		
		@FindBy(xpath = ".//*[@id='dualSignIn-zipcode']")
		public WebElement zipCode;
		
		@FindBy(xpath = ".//*[@id='tab_register']/div[1]/div[12]/label/span/div")
		public WebElement ChkAgree;
		
		@FindBy(id = "dualSignIn-Register")
		public WebElement btnRegister;
		
		@FindBy(id = "fancybox-close")
		public WebElement btnCancle;
		
		@FindBy(tagName = "title")
		public WebElement txtTitle;
		
		public void user_Register(String email , String pass, String zip) throws InterruptedException{
			lnkMyAccount.click();
			lnkRegister.click();
			Thread.sleep(3000);
			//userId.click();
			userId.sendKeys(email);
			
			userPass.sendKeys(pass);
			
			zipCode.sendKeys(zip);
			Thread.sleep(5000);
			ChkAgree.click();
			Thread.sleep(5000);
			btnRegister.click();
			Thread.sleep(5000);
			btnCancle.click();
			String Title =txtTitle.getText();
			
			if(Title.equals("Homedepot.com - My Account")){
				System.out.println("Registration Success");
			}
			System.out.println("Registration Failed");
			
			
		}
		
}
