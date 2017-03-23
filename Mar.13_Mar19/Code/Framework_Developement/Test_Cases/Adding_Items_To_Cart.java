package com.org.test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;







import com.org.pages.Login_Page;
import com.org.pages.Search_Items;
import com.org.utility.Browser_Factory;
import com.org.utility.ExcellLib;

public class Adding_Items_To_Cart {
	WebDriver driver=Browser_Factory.startBrowser("firefox", "http://www.homedepot.com");
	Search_Items search_item =PageFactory.initElements(driver, Search_Items.class);
	Login_Page login_page =PageFactory.initElements(driver, Login_Page.class);

	ExcellLib excel = new ExcellLib("C:\\Users\\akhil\\Desktop\\Saibersys\\homeworks\\Testing Sheets\\UserLogins.xls","ItemShipDetails");
	
	@Test
	public void items_Search() throws InterruptedException{
		//login_page.loginAccount(ExcellLib.ReadCell("UserName", 1),ExcellLib.ReadCell("Passoword", 1));
		excel.ColumnDictionary();
		search_item.selectItem(excel.ReadCell("ShippingType", 1),excel.ReadCell("ShippingItem", 1),excel.ReadCell("Brand", 1));
		
		// free shipping  DEWALT 0, Husky 1,HDX 2,Estwing double 4,Striker Tools 5,Estwing Straight 7,Stiletto 8, Stiletto 23,
		// no free shipping HART 10,
		
	}
}
