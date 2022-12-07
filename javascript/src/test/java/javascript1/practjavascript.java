package javascript1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practjavascript extends util1 {
	
public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	WebDriver driver;
	@BeforeTest
	public void befortest() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement K=driver.findElement(By.name("username"));
		Thread.sleep(3000);
		WebElement P=driver.findElement(By.name("password"));
		Thread.sleep(3000);
	WebElement M=	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
			util1.passingValuesUsingJS(K, "Admin", driver);
		util1.passingValuesUsingJS(P, "admin123", driver);
		M.click();
	
	//util1.drawBorder(M, driver);		
		//util1.flash(M, driver);
	//util1.clickElementByJS(M, driver);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollby(0,300)");
		
		
		
	}
	
	
	
	

}
