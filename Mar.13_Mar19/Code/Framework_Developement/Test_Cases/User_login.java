package com.org.test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.org.pages.Login_Page;
import com.org.utility.Browser_Factory;
import com.org.utility.ExcellLib;

public class User_login {
	WebDriver driver=Browser_Factory.startBrowser("firefox", "http://www.homedepot.com");
	Login_Page login_page =PageFactory.initElements(driver, Login_Page.class);
	ExcellLib excel = new ExcellLib("C:\\Users\\akhil\\Desktop\\Saibersys\\homeworks\\Testing Sheets\\UserLogins.xls","userlogin");
	//
	@SuppressWarnings("static-access")
	@Test
	public void checkUser() throws InterruptedException{
		//System.out.println(excel.RowCount());
		excel.ColumnDictionary();
	login_page.loginAccount(excel.ReadCell("UserName", 1),excel.ReadCell("Passoword", 1));
	}
	
}
