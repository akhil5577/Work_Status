package dataDriven_Testing;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dataDrivenTesting
{
	
	@Test(dataProvider="MyData")
	public void GmailLogin(String emailid,String password) throws InterruptedException
	{
		
		// Open Browser		
		WebDriver d=new FirefoxDriver();	
		
		
		// Open Url
		Thread.sleep(1000);
		d.get("https://www.facebook.com/");
		
		
		// enter email id
		Thread.sleep(1000);
		d.findElement(By.id("email")).sendKeys(emailid);

		// enter password
		Thread.sleep(1000);
		d.findElement(By.id("pass")).sendKeys(password);
		
		
		// click on sign in
		Thread.sleep(1000);
		d.findElement(By.id("u_0_n")).click();
		
		
		// click on link
		Thread.sleep(1000);
		d.findElement(By.id("userNavigationLabel")).click();
		
		
		// click on sing out image
		Thread.sleep(2000);
		d.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[13]/a/span/span")).click();
		
		
			
		// close browser
		Thread.sleep(3000);
		d.close();
			
	}

	
	@DataProvider(name="MyData")
	public Object[][] GmailTestData() throws BiffException, IOException
	{
		
		
		// // ExcelSheet Path
		File F=new File("C:\\Users\\akhil\\Desktop\\selinum\\Selineum_home _work\\Login_Details.xls");
		
		// Get Work
		Workbook wb=Workbook.getWorkbook(F);
		
		// Get Sheet
		Sheet s=wb.getSheet(0);
		
		
		// get Rows and cloumns 
		int rcount=s.getRows();
		
		// Get column count
		int ccount=s.getColumns();
		
		
		
		// Store excel sheet data in string variables
		String data[][]=new String[rcount][ccount];
		
		
		//start row loop
		for(int i=1;i<rcount;i++)
		{
			
			// start column loop
			for(int j=0;j<ccount;j++)
			{
				
				Cell cvalue=s.getCell(j, i);	
				
				data[i][j]=cvalue.getContents();
				
				
			}
			
			
		} 
		
		
		
		return data;
		
		
	}
}

