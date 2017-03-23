package keywordDriven_testing;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.testng.annotations.Test;

public class KeywordDrivenMainProcess {
	@Test(priority=1)
	public void FinalProcess() throws BiffException, IOException, InterruptedException
	{
		
		// OpenExcel Sheet
		KeywordDriven_ExcelData mysheet=new KeywordDriven_ExcelData();
		String path="C:/Users/akhil/Desktop/selinum/Selineum_home _work/Keyword_Driven_Data1.xls";
		mysheet.OpenSheet(path);
		
		int rcount=mysheet.GetRowCount();
		int ccount=mysheet.GetColumnCount();
		
		System.out.println("Row Count : "+rcount);
		System.out.println("Column count : "+ccount);
		
		String tname="";
		String ptype="";
		String pvalue="";
		String tdata="";
		
		// create the test case function object
		keywordDriven tobj=new keywordDriven();
		
		//Excel Sheet Loop
		for(int r=1;r<rcount;r++)
		{
			// Get TestCaseName
			tname=mysheet.GetValueFromCell(1, r);
			
			// Get ptype,pvalue,tdata
			for(int c=1;c<ccount;c++)
			{
				if(c==1)
				{
					ptype=mysheet.GetValueFromCell(c, r);
				}
				else if(c==2)
				{
					pvalue=mysheet.GetValueFromCell(c, r);
				}
				else if(c==3)
				{
					tdata=mysheet.GetValueFromCell(c, r);
				}
			}  
			
			System.out.println(tname + "  "+ptype+" "+pvalue+" "+tdata);
			Thread.sleep(7000);
			switch(tname)
			{
			case "Open_Browser":
				tobj.Open_Browser(tdata);
				break;
			case "Enter_Url" :
				tobj.Enter_Url(tdata);
				break;
			case "Click_link":
				tobj.Click_link(ptype, pvalue);
				break;
			case "Enter_Username":
				tobj.Enter_Username(ptype, pvalue, tdata);
				break;
			case "Enter_Password":
				tobj.Enter_Password(ptype, pvalue, tdata);
				break;
				
			case "Click_Login_Button":
				tobj.Click_Login_Button(ptype, pvalue);
				break;
				
			case "Click_Gmail":
				tobj.Click_Gmail(ptype, pvalue);
				break;
			case "Click_image":
				tobj.Click_image(ptype, pvalue);
				break;
			case "Click_Logout_button":
				tobj.Click_Logout_button(ptype, pvalue);
				break;
			default:
				System.out.println("No TestCase");
				break;
			} 
			
		}
		
		
	}


}
