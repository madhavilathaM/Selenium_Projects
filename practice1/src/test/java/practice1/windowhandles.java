package practice1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {

	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String url1="https://www.google.com/";
	public static String url2="https://www.youtube.com";
	public static String url3="https://demoqa.com/alerts/";
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Timeout,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void windowhandles() throws InterruptedException
	{
		
		
		Set<String>parent=driver.getWindowHandles();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(url1);
		
Set<String>child=driver.getWindowHandles();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(url2);
Set<String>child2=driver.getWindowHandles();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(url3);
		
		ArrayList<String>list=new ArrayList<String>(driver.getWindowHandles());
		int n=list.size();
		driver.switchTo().window(list.get(3));
		
		Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='alertButton']")).click();
	Thread.sleep(4000);
	Alert M=driver.switchTo().alert();
	System.out.println(M.getText());
	M.accept();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
