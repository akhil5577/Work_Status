package com.org.test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.org.pages.Login_Page;
import com.org.pages.Register_Page;
import com.org.utility.Browser_Factory;
import com.org.utility.ExcellLib;

public class User_Register {
	WebDriver driver=Browser_Factory.startBrowser("firefox", "http://www.homedepot.com");
	Register_Page user_register =  PageFactory.initElements(driver, Register_Page.class);
	ExcellLib excel = new ExcellLib("C:\\Users\\akhil\\Desktop\\Saibersys\\homeworks\\Testing Sheets\\UserLogins.xls","userRegister");
	
	
	@SuppressWarnings("static-access")
	@Test
	public void register() throws InterruptedException{
		user_register.user_Register(excel.ReadCell("Email", 1), excel.ReadCell("Email", 1),excel.ReadCell("Zip", 1));
	}
}
