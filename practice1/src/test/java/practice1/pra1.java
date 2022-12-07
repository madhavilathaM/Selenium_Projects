package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pra1 {
	
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	

	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get(url);
		driver.navigate().to(url);
		
		Thread.sleep(3000);
	}
	@Test(enabled=true,priority=0)
	public void Test1() throws InterruptedException
	{
		WebElement name = driver.findElement(By.name("username"));
		WebElement pass=driver.findElement(By.name("password"));
		WebElement login=driver.findElement(By.xpath("//*[@type='submit']"));
		
		if(name.isEnabled())
		{
			name.sendKeys("Admin");
		}
		
		if(pass.isDisplayed())
		{
			pass.sendKeys("admin123");
		}
		
		
		driver.manage().window().maximize();
		if(login.isDisplayed())
		{
			login.click();
		}
		
		Thread.sleep(3000);
		//driver.navigate().back();
	}
	
	/*@Test(enabled=true,priority=1)//forgot password
	public void test2() throws InterruptedException
	{
		Thread.sleep(3000);
		
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		
		driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}*/
	
	@Test
	public void test2() throws InterruptedException
	{
		WebElement R= driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[3]/div/div[2]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(R).click().build().perform();
		Thread.sleep(3000);
		act.sendKeys(R,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(R,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(R,Keys.ARROW_DOWN).doubleClick().build().perform();
		Thread.sleep(5000);
		
		WebElement S=driver.findElement(By.xpath("//*[@type='submit']"));
		act.moveToElement(S).doubleClick().build().perform();
	}
	
	
	@AfterTest(enabled=false)
	public void aftertest()
	{
	driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a"));
	driver.close();
		
		
		
		}
		
	
	
	
	
	
	
}
