package javascript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_orangehrm extends util1 {

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
	public void test1() throws InterruptedException
	{
		
		WebElement K=driver.findElement(By.name("username"));
		WebElement P=driver.findElement(By.name("password"));
	WebElement M=	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		
		//util1.drawBorder(M, driver);
		//util1.changeColor("red", M, driver);
		//util1.scrollIntoView(M, driver);
		//.flash(M, driver);
		Thread.sleep(3000);
		util1.getTitleByJS(driver);
		//util1.generateAlert(driver, "hello");
		Thread.sleep(4000);
		util1.passingValuesUsingJS(K, "Admin", driver);
		Thread.sleep(4000);
		util1.passingValuesUsingJS(P, "admin123", driver);
		Thread.sleep(4000);
		util1.clickElementByJS(M, driver);
		
		
	}
	
}
