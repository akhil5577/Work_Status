package keywordDriven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class KeywordDriven_ExcelData 
{
	
		// create the workbook,sheet variables	
		Workbook wb;
		Sheet sh;
		
		// open Sheet
		
		public void OpenSheet(String Filepath) throws BiffException, IOException
		{
			FileInputStream fs;
			fs=new FileInputStream(Filepath);
			
			wb=Workbook.getWorkbook(fs);
			sh=wb.getSheet(0);
			
			
		}
		
		// Get values from cell in sheet
		public String GetValueFromCell(int c,int r)
		{
			String CellData=sh.getCell(c,r).getContents();
			
			return CellData;
			
		}
		
		// Get Row count
		public int GetRowCount()
		{
			int r=sh.getRows();
			
			return r; 
			
		}
		
		
		// Get Column Count
		
		public int GetColumnCount()
		{
			int c=sh.getColumns();
			
			return c;
		}
		

}



