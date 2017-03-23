package com.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login_Page {
 WebDriver driver;
 
 public Login_Page(WebDriver ldriver){
	 this.driver= ldriver;
 }
    @FindBy(linkText = "My Account")
	public WebElement lnkMyAccount;	
 
	@FindBy(xpath = ".//*[@id='authSignIn']/span/a")
	public WebElement lnkLogin;
	
	@FindBy(id = "email_id")
	public WebElement userId;
	
	@FindBy(id = "password")
	public WebElement userPass;
	
	@FindBy(id = "signIn")
	public WebElement btnSignIn;
	
	public void loginAccount(String uId,String uPass) throws InterruptedException{
		lnkMyAccount.click();
		Thread.sleep(3000);
		lnkLogin.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		userId.sendKeys(uId);
		userPass.sendKeys(uPass);
		btnSignIn.click();
		
	}
	
}
