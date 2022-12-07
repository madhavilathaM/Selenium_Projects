package demoframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assetion2 {
	
	
	
	public String url="https://www.google.com/";
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		
		driver.get(url);
	}
	
	
	
	@Test
	public void test1()
	{
		
	String T=	driver.getTitle();
	System.out.println(T);
	Assert.assertEquals(T, "Googlechrome");
		
		
		
	}
	@Test(dependsOnMethods="test1",alwaysRun = true)
	public void test2()
	{
		
		System.out.println("my name madhavi");
		
	}
	
	
	
	

}
