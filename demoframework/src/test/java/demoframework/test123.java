package demoframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test123 {

	
	public class annaoTESTNG {
		
		public  String browser="https://www.google.com/";
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
		@Test(priority=1)
		public void apple()
		{
			title=driver.getTitle();
			
		
		}
		
		@Test(priority=2)
		public void car()
		{
			System.out.println(title+url);
		}
		
		@Test(priority=0)
		public void bat()
		{
			url=driver.getCurrentUrl();
		}
		@AfterTest
		public void aftertest()
		{
			driver.close();
		}
		
		
		
		
}
}
