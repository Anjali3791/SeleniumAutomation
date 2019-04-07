package logictesting;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuration.config;
import liberaries.Xls_Reader;

public class Testing 
{

	@Test(dataProvider="getData")
	public void testScript(String username, String password, String title)
	{
		
		System.setProperty("webdriver.chrome.driver", config.chromeDriverPath);
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(config.URL);
		
		dr.findElement(By.name("userName")).sendKeys(username);
		dr.findElement(By.name("password")).sendKeys(password);
		dr.findElement(By.name("login")).click();
		
		System.out.println(dr.getTitle());
		
		String expectedTitle="Find a Flight: Mercury Tours:";
		
		assertEquals(dr.getTitle(), title);
		
		dr.close();
		
		
	}
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		
		Xls_Reader xl = new Xls_Reader(config.testData);
		
		int rows = xl.getrowcount("Sheet1");
		int cols = xl.getColumncount("Sheet1");
		
		String[][] data = new String[rows-1][cols];
		
		for( int r=2; r<=rows; r++)
		{
			for (int c= 1; c<=cols; c++)
			{
//				System.out.println(xl.getCellData("Sheet1", r, c));
				
				data[r-2][c-1]= xl.getCellData("Sheet1", r, c);
			}
		}
		
		
//		Xls_Reader xl = new Xls_Reader(config.testData);
//		
//		
//		
//		String[][] data = new String[2][3];
//		
//		//Row no. 1
//		
//		data [0][0]= "mercury";
//		data [0][1]= "mercury";
//		data [0][2]= "Find a Flight: Mercury Tours:";
//		
//		//Row 2
//		
//		data [1][0]= "mercury";
//		data [1][1]= "mercury";
//		data [1][2]= "Find a Flight: Mercury Tours:";
		
		return data;   //The array is of type string and is two dimensional, therefore the return type will be data here.  
		
	}
	
	
	
	
	
	
}
