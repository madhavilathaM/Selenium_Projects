package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMTime {
	
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	
	
	@Parameters("mybrowser")
	@BeforeTest()
	public void befortest(String mybrowser)
	{
		
		if(mybrowser.equalsIgnoreCase("firefox"))
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
			if(mybrowser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
			}
		
		
		
		
		
		
		
	}
	@Test
	public void test() throws InterruptedException
	{
		
		
	//WebDriverManager.chromedriver().setup();
	//driver=new ChromeDriver();
	driver.get(url);
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[4]")).click();
	Thread.sleep(5000);
	
		
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("window.scrollBy(0,400)");
	
	
	Thread.sleep(5000);
	List<WebElement> li=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
	System.out.println(li.size());
	
	Thread.sleep(5000);
		driver.findElements(By.xpath("//*[@type='button']")).get(4).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement edit=driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
		act.moveToElement(edit).click().build().perform();
		
		System.out.println("you clicked on edit button");
		Thread.sleep(5000);
	//List<WebElement>	li1=driver.findElements(By.xpath("//*[@class='oxd-select-wrapper']"));
	
		List<WebElement>li1=driver.findElements(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		li1.get(1).click();
		Thread.sleep(10000);
		//act.sendKeys(li1.get(1),Keys.ARROW_DOWN);
		//act.sendKeys(li1.get(0),Keys.ARROW_DOWN);
		
		//act.sendKeys(li1.get(0),Keys.ARROW_DOWN);
		act.sendKeys(li1.get(0),Keys.ARROW_DOWN).click().build().perform();
		
		Thread.sleep(5000);
		List<WebElement>li2=driver.findElements(By.xpath("//*[@class='oxd-input oxd-input--active']"));
		Thread.sleep(5000);
		li2.get(11).sendKeys("09:00");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
	}
	
	
	
	
	
}
