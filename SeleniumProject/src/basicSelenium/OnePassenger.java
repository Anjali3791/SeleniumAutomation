package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnePassenger {

	public static void main(String[] args) 
	{
		//to open the chrome web browser
		System.setProperty("webdriver.chrome.driver", "C:\\Study materials\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		
		//to perform operations on the we browser
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='login']")).click();
		dr.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		//to book a flight: one way-one passenger
		dr.findElement(By.xpath("//input[@type  = 'radio'][@value = 'oneway']")).click();
		//1 Passenger
		WebElement ele = dr.findElement(By.name("passCount"));
		Select sel = new Select(ele);
		sel.selectByValue("1");
		
		//From London
		dr.findElement(By.xpath("//select [@name ='fromPort']//option[@value = 'London']")).click();
		//Date
		WebElement ele1 = dr.findElement(By.name("fromMonth"));
		Select sel1 = new Select(ele1);
		//sel1.selectByValue("5");
		sel1.selectByVisibleText("May");
		
		WebElement ele2 = dr.findElement(By.name("fromDay"));
		Select sel2 = new Select(ele2);
		sel2.selectByValue("10");
		
		//To Paris
		dr.findElement(By.xpath("//select [@name ='toPort']//option[@value = 'Paris']")).click();
		//Date
		WebElement ele3 = dr.findElement(By.name("toMonth"));
		Select sel3 = new Select(ele3);
		//sel1.selectByValue("5");
		sel3.selectByVisibleText("May");
				
		WebElement ele4 = dr.findElement(By.name("toDay"));
		Select sel4 = new Select(ele4);
		sel4.selectByValue("15");
		
		//Service Class
		dr.findElement(By.xpath("//input[@type  = 'radio'][@value = 'Business']")).click();
		
		//Preferred Airline
		WebElement ele5 = dr.findElement(By.name("airline"));
		Select sel5 = new Select(ele5);
		sel5.selectByIndex(1);
		
		//Continue : //input [@name = 'findFlights']
		dr.findElement(By.xpath("//input[@name = 'findFlights']")).click();
		
		
		//Continue on next page : //input [@name = 'reserveFlights']
		dr.findElement(By.xpath("//input [@name = 'reserveFlights']")).click();
		
		//input name, number etc, : //input [@name = 'passFirst0']
		dr.findElement(By.xpath("//input [@name = 'passFirst0']")).sendKeys("Anjali");
		
		dr.findElement(By.xpath("//input [@name = 'passLast0']")).sendKeys("Khonde");
		
		dr.findElement(By.xpath("//input [@name = 'creditnumber']")).sendKeys("1234567890123456");
		
		//Secure Purchase
		dr.findElement(By.xpath("//input [@name = 'buyFlights']")).click();
		
		//Back to home 
		dr.findElement(By.xpath("//a [@href= 'mercurysignoff.php'] //img[@src = '/images/forms/Logout.gif']")).click();
		
		
		
		
		
		
	}

}
