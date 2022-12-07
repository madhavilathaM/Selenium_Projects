package demoframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class asser1 {
	
	WebDriver driver;
	public static String url="https://www.google.com/";
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
		System.out.println(driver.getTitle());
		Assert.assertEquals("madhavi", "lekha");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("My name Madhavilatha");
	}

}
