package com.org.test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.org.pages.Cart;
import com.org.pages.Login_Page;
import com.org.utility.Browser_Factory;

public class ItemCheckOut {
	WebDriver driver=Browser_Factory.startBrowser("firefox", "http://www.homedepot.com");
	Cart cart =PageFactory.initElements(driver, Cart.class);
	Login_Page login_page =PageFactory.initElements(driver, Login_Page.class);
	
	
	//
	@Test
	public void checkUser() throws InterruptedException{
		login_page.loginAccount("akhil534chanti@gmail.com", "akhil534");
		Thread.sleep(10000);
	cart.itemCheckOut("3","BOPIS");
	}
}
