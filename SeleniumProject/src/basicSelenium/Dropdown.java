package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Study materials\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
			
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		
//		dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.partialLinkText("ISTER")).click();
		
		
		WebElement ele = dr.findElement(By.name("country"));
		Select sel = new Select(ele);
		
		sel.selectByIndex(0);
		
		Thread.sleep(2000);
		sel.selectByVisibleText("INDIA");
		
		Thread.sleep(2000);
		sel.selectByValue("234");
		
		
		
		

	}

}
