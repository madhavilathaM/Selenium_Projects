package firstdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven1 {
	
	
public static	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

@Test
public  void testcase1() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	Thread.sleep(3000);
	String beforelogin=driver.getTitle();
	System.out.println(beforelogin);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	Thread.sleep(3000);
	String afterlogin=driver.getTitle();
	System.out.println(afterlogin);
	if(beforelogin.equals(afterlogin))
	{
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		System.out.println("the title is same browser logout ");
	}else
	{
		System.out.println("the title is not same");
	}
	
	driver.close();
}
}

