package Casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taacliq {
	
	
	public static String url="https://www.tatacliq.com/";
	WebDriver driver;
	
	@Test
	public void beforetest() throws InterruptedException
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get(url);

		
		driver.findElement(By.xpath("//*[@class='DesktopHeader__loginTab']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//*[@class='DropdownMenu__accountHolder']/div[2]/div")).click();
	}

}
