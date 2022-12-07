package demoframework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class annotation1 {

	public static String browser="www.google.com";
	WebDriver driver ;
	public String title;
	public String url;
	
	
	@Before
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(browser);
		
		
	}
	@Test
	public void test()
	{
		title=driver.getTitle();
	}
	@Test
	public void test2()
	{
		url=driver.getCurrentUrl();
	}
	@Test
	public void test3()
	{
		System.out.println(title+url);
	}
	@After
	public void aftertest()
	{
		driver.close();
	}
	
}