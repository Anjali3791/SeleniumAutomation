package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Study materials\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		
		
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='login']")).click();
		
		
		
		
		
	}

}
