package scripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import configuration.config;
import liberaries.ApplicationLib;
import liberaries.Xls_Reader;
import pages.LoginPage;

public class TC_Login 
{
	//Launch Browser
	WebDriver dr; 			//Declared Globally so as, to not get a null on WebDriver
	
	@BeforeClass
	@Parameters({"browser"})
	public void preCondition(String browsername) 
	{
		ApplicationLib lib = new ApplicationLib();
		dr = lib.launchBrowser(browsername);
//		System.setProperty("webdriver.chrome.driver", config.chromeDriverPath);
//		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(config.URL);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		dr.close();
		
	}
	
	
	@Test(dataProvider="getData")
	public void script(String username, String password, String title)
	{		
		//Perform Login
		
		LoginPage obj_login = new LoginPage(dr);
		
		obj_login.login(username, password);
		
		
		assertEquals(dr.getTitle(), title);
		
		//dr.manage().timeouts().pageLoadTimeout(60,  TimeUnit.SECONDS);
				
	}
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		
		Xls_Reader xl = new Xls_Reader(config.testData);
		String sheetName = this.getClass().getSimpleName();  //here we have made the sheet name dynamic now.
		int rows = xl.getrowcount(sheetName);
		int cols = xl.getColumncount(sheetName);
		
		String[][] data = new String[rows-1][cols];
		
		for( int r=2; r<=rows; r++)
		{
			for (int c= 1; c<=cols; c++)
			{
//				System.out.println(xl.getCellData(sheetName, r, c));
				
				data[r-2][c-1]= xl.getCellData(sheetName, r, c);
			}
		}
		
		return data;   //The array is of type string and is two dimensional, therefore the return type will be data here.  

	
	}
}
