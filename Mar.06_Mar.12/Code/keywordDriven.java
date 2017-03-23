package keywordDriven_testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class keywordDriven {
	
		
		WebDriver d;
		
		public void Open_Browser(String tdata)
		{
			
			if(tdata.equalsIgnoreCase("Firefox"))
			{
				d=new FirefoxDriver();
			}
			else if(tdata.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("", "");
				d=new ChromeDriver();
			}
			else if(tdata.equalsIgnoreCase("IE"))
			{
				System.setProperty("", "");
				d=new InternetExplorerDriver();
			}
			
		}
		
		public void Enter_Url(String tdata)
		{
			
			d.get(tdata);
		}
		
		public void Click_link(String ptype,String pvalue)
		{
			By b=ElementValue(ptype,pvalue);
			d.findElement(b).click();
		}
		
		public void Enter_Username(String ptype,String pvalue,String tdata)
		{
			
			By b=ElementValue(ptype,pvalue);
			d.findElement(b).sendKeys(tdata);
			
		}
		public void Click_Next(String ptype,String pvalue)
		{
			
			By b=ElementValue(ptype,pvalue);
			d.findElement(b).click();
		}
		public void Enter_Password(String ptype,String pvalue,String tdata)
		{
			
			By b=ElementValue(ptype,pvalue);
			d.findElement(b).sendKeys(tdata);
			
		}
		public void Click_Login_Button(String ptype,String pvalue)
		{
			
			By b=ElementValue(ptype,pvalue);
			d.findElement(b).click();
		}
		public void Click_Gmail(String ptype,String pvalue)
		{
			
			By b=ElementValue(ptype,pvalue);
			d.findElement(b).click();
		}
		public void Click_image(String ptype,String pvalue)
		{
			
			By b=ElementValue(ptype,pvalue);
			d.findElement(b).click();
		}
		
		public void Click_Logout_button(String ptype,String pvalue)
		{
			
			By b=ElementValue(ptype,pvalue);
			d.findElement(b).click();
		}
		public By ElementValue(String ptype,String pvalue)
		{
			
			By b;
			
			switch(ptype)
			{
				
				case "id":
					b=By.id(pvalue);
					break;
				case "name":
					b=By.name(pvalue);
					break;
				case "xpath":
					b=By.xpath(pvalue);
					break;
				case "cssSelector":
					b=By.cssSelector(pvalue);
					break;
				case "className":
					b=By.className(pvalue);
					break;
				case "linkText":
					b=By.linkText(pvalue);
					break;
				case "partialLinkText":
					b=By.partialLinkText(pvalue);
					break;
				case "tagName":
					b=By.tagName(pvalue);
					break;
				default:
					b=null;
					break;
					
					
			}
			
			return b;
			
		}	
		
	}


//Excel Sheet  Access Process
	
	
	


