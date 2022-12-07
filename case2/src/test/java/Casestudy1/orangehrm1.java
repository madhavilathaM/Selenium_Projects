package Casestudy1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm1 {
	
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.navigate().to(url);
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void Testcase1() throws InterruptedException
	{
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> Links1=driver.findElements(By.tagName("a"));
		System.out.println("the total number of links   "+ Links1.size());
		
		//driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[2]/a")).click();
	
List<WebElement> links2=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));

System.out.print("the total number of records  "+links2.size());


//driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(4).click();
Thread.sleep(5000);
driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(4).click();
Thread.sleep(5000);
driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(4).click();

  //Alert M=driver.switchTo().alert();
// M.accept();

driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();

}
	@Test
	public void Testcase3() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		
		driver.close();
	}
	
	
}