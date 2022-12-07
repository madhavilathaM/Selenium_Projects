package demoframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class annaoTESTNG {
	
	public static String browser="https://www.google.com/";
	WebDriver driver ;
	public String title;
	public String url;
	
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(browser);
		
		
	}
	@Test(priority=0)
	public void Login()
	{
		title=driver.getTitle();
		
	Assert.assertEquals("Madhavi", "Madhavi");
	}
	
	@Test(priority=1,dependsOnMethods="Login",alwaysRun=true)
	public void Logout()
	{
		System.out.println(title+url);
	}
	
	@Test(priority=2)
	public void Car()
	{
		url=driver.getCurrentUrl();
	}
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	
	
	
	

}
