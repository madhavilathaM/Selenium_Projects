package practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationtesting {
	
	
	public static String url="https://testautomationpractice.blogspot.com/";
	
	WebDriver driver;
	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[text()='Click Me']")).click();
		Thread.sleep(3000);
		Alert M=driver.switchTo().alert();
		
		System.out.println(M.getText());
		M.accept();
		Thread.sleep(3000);
		Select N=new Select(driver.findElement(By.id("speed")));
		N.selectByVisibleText("Medium");
			      
		
		driver.findElement(By.xpath("//*[@value='Radio-1']"));
		
	}
	

}
