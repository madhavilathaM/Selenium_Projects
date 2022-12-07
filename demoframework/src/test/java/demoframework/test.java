package demoframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	
	
	public static String browser="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver ;
	public String title;
	public String url;
	
	@Test(dataProvider="madhavi")
	public void madhu(String N,String S) throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(N);
		driver.findElement(By.name("password")).sendKeys(S);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		Thread.sleep(3000);
		
	}
	@DataProvider
	public Object[][] madhavi()
	{
		return new Object[][]
				{
			new Object[] { "Admin", "admin123"},
			new Object[] { "Admin", "admin123"},
			
			
				};
		
	}
	
	

	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(browser);
		Thread.sleep(3000);
		
	}
	
		
	
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
	}
	
	
}
