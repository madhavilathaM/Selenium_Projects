package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class act {
	
	
	public static String url="https://www.browserstack.com/";
	
	WebDriver driver;
	
	@BeforeTest
	public void before() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		driver.navigate().to(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		
		Actions act=new Actions(driver);
		
		/*WebElement A = driver.findElement(By.linkText("Get started free"));
		
		act.moveToElement(A).click().build().perform();
		
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement B=driver.findElement(By.xpath("//*[@class='product-cards-wrapper--click--hoverclick product-card-live']"));
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(3000);
		
		act.moveToElement(B).click().build().perform();
		driver.navigate().back();
		
		WebElement c=driver.findElement(By.xpath("//*[@class='product-cards-wrapper--click--hoverclick product-card-live']"));
		
		Thread.sleep(3000);
		act.moveToElement(c).click().build().perform();
		
		driver.navigate().back();*/
		Thread.sleep(3000);
		WebElement F=driver.findElement(By.xpath("//*[@class='btn-secondary-white btn-md']"));
		
	act.moveToElement(F).doubleClick().build().perform();
	Thread.sleep(3000);
	driver.navigate().back();
		
	}

}
