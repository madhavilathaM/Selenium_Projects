package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myinfo {
	
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	
	@Parameters("mybrowser")
	@BeforeTest
	public void befortest(String mybrowser)
	{
		
		if(mybrowser.equalsIgnoreCase("chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		
		else if(mybrowser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		
		
		
	}
	
	@Test
	public void test() throws InterruptedException
	{
		
		
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[6]")).click();
		Thread.sleep(5000);
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,400)");
				
		Thread.sleep(5000);

		//Select S=new Select(driver.findElement(By.xpath("//*[@type='radio']")));
		
		//S.selectByValue("1");
		
		
		List<WebElement>radio=driver.findElements(By.xpath("//*[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']"));
		radio.get(1).click();
		List<WebElement>calender=driver.findElements(By.xpath("//*[@class='oxd-icon bi-calendar oxd-date-input-icon']"));
		calender.get(1).click();
		
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
		
		
		
	}
	
	
	
	

}
