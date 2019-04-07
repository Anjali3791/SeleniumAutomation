package logictesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReturnClassObject 
{
	
	public int test()
	{
		//int a=10
		return 10;
		
	}
	
	public ChromeDriver test2()
	{
		
		//ChromeDriver dr = new ChromeDriver();
		
		//return dr;
		//or
		return new ChromeDriver();
	}
	
	//interface/abstract therefore an object cannot be made of an webdriver/Interface
	
	//We cannot create an object of an interface
	
	public WebDriver test3(String browserName)
	{
		WebDriver dr= null;
		
		if(browserName.equalsIgnoreCase("Chrome")) 
		{
			dr = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("Firefox"))
		{
			dr = new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("edge"))
		{
			dr = new EdgeDriver();
			
		}
		
		return dr;
		
	}
	
	
}
