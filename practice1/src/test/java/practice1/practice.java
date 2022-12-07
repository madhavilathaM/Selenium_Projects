package practice1;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	
	
	
	public static String url="https://itera-qa.azurewebsites.net/home/automation";
	public static String url1="http://www.tutorialsninja.com/demo/";
	public static String url2="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String url3="https://testautomationpractice.blogspot.com/";
	
	public static String url4="https://nxtgenaiacademy.com/alertandpopup";
	public static String url5="https://demoqa.com/nestedframes";
	public static String url6="https://duckduckgo.com";
	public static String url7="https://itera-qa.azurewebsites.net/home/automation";
	
	WebDriver driver,driver1,driver2;
	
	@BeforeTest
	public void befortest()
	{
				
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
				driver.manage().window().maximize();
		//driver1.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Timeout<R>, null)
		
				
	}
	@Test
	public void test() throws InterruptedException
	{
			
		
		driver.findElement(By.id("name")).sendKeys("madhavilatha");
		
		driver.findElement(By.id("phone")).sendKeys("76543829");
		driver.findElement(By.id("email")).sendKeys("madhu@gmail.com");
	
		driver.findElement(By.id("password")).sendKeys("12345");
		
		driver.findElement(By.id("address")).sendKeys("Bangalore");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.xpath("//*[@value='option1']")).click();
		driver.findElement(By.xpath("//*[@id='wednesday']")).click();
	
		Select M=new Select(driver.findElement(By.xpath("//*[@class='custom-select']")));
		M.selectByVisibleText("Spain");
		
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get(url1);
	
	driver.findElement(By.xpath("//*[@class='list-inline']/li[2]")).click();
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.name("firstname")).sendKeys("madh43i51");
	driver.findElement(By.name("lastname")).sendKeys("M");
	driver.findElement(By.name("email")).sendKeys("madhave15r3584@gmail.com");
	driver.findElement(By.name("telephone")).sendKeys("865412724");
	driver.findElement(By.name("password")).sendKeys("865422");
	driver.findElement(By.name("confirm")).sendKeys("865422");
	
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(5000);
	List<WebElement>li=driver.findElements(By.xpath("//*[@class='list-group-item']"));
	System.out.println(li.size());
	Thread.sleep(5000);
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("window.scroll(0,200)");
	Thread.sleep(5000);
	li.get(12).click();
		
			driver.switchTo().newWindow(WindowType.TAB);
	driver.get(url2);
	Thread.sleep(5000);
	WebElement username=driver.findElement(By.name("username"));
	if(username.isEnabled())
	{
		username.sendKeys("Admin");
	}
	WebElement password=driver.findElement(By.name("password"));
	if(password.isEnabled())
	{
		password.sendKeys("admin123");
	}
	
	WebElement login=driver.findElement(By.xpath("//*[@type='submit']"));
	if(login.isDisplayed())
	{
		login.click();
	}
	
	Thread.sleep(3000);
	List<WebElement>ORtabs=driver.findElements(By.xpath("//*[@class='oxd-main-menu-item-wrapper']"));
	ORtabs.get(2).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Leave List")).click();
	Thread.sleep(3000);
	WebElement user=driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']"));
	System.out.println(user.getText());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]")).click();
	ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
	System.out.println(al.size());
	driver.switchTo().window(al.get(1));
	Thread.sleep(5000);
	driver.quit();
	
		
	WebDriverManager.chromedriver().setup();
		driver1=new ChromeDriver();
		driver1.manage().window().maximize();
				driver1.get(url3);
		Thread.sleep(4000);
		JavascriptExecutor js1= ((JavascriptExecutor)driver1);
		js1.executeScript("window.scroll(0,800)");
		Thread.sleep(4000);
		WebElement image1=	driver1.findElement(By.xpath("//*[@class='gallery ui-helper-reset ui-helper-clearfix ui-droppable']/li[1]"));
	WebElement image2=driver1.findElement(By.xpath("//*[@class='gallery ui-helper-reset ui-helper-clearfix ui-droppable']/li[2]"));
	Thread.sleep(4000);
	WebElement Trash=driver1.findElement(By.xpath("//*[@class='ui-widget-content ui-state-default ui-droppable']"));
	Thread.sleep(4000);
	
	Thread.sleep(4000);
		Actions ac=new Actions(driver1);
		ac.dragAndDrop(image1, Trash).build().perform();
		ac.dragAndDrop(image2, Trash).build().perform();
		Thread.sleep(6000);
		driver1.findElement(By.xpath("//*[@class='gallery ui-helper-reset']/li[1]/a")).click();
		driver1.findElement(By.xpath("//*[@class='gallery ui-helper-reset']/li[2]/a")).click();
		Thread.sleep(6000);
		driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get(url4);
		Thread.sleep(4000);
		driver1.findElement(By.name("alertbox")).click();
		Alert M1=driver1.switchTo().alert();
		Thread.sleep(4000);
		M1.accept();
		Thread.sleep(4000);
		driver1.findElement(By.name("confirmalertbox")).click();
		Alert N=driver1.switchTo().alert();
		Thread.sleep(4000);
		N.accept();
		Thread.sleep(4000);
		driver1.findElement(By.name("promptalertbox1234")).click();
		Alert O=driver1.switchTo().alert();
		Thread.sleep(4000);
		O.sendKeys("yes");
		O.accept();
		System.out.println(driver1.getCurrentUrl());
		Thread.sleep(4000);
		driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get(url2);
		
		Thread.sleep(3000);
		driver1.findElement(By.name("username")).sendKeys("Admin");
		driver1.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
				driver1.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(3000);
				List<WebElement>ORtabs1=driver1.findElements(By.xpath("//*[@class='oxd-main-menu-item-wrapper']"));
				ORtabs1.get(7).click();
				Thread.sleep(3000);
				driver1.findElement(By.xpath("//*[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']")).click();
				Thread.sleep(3000);
				driver1.findElement(By.xpath("//*[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
				Thread.sleep(3000);
				driver1.findElement(By.xpath("//*[@type='submit']")).click();
				Thread.sleep(3000);
			driver1.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
				Thread.sleep(3000);
			driver1.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]")).click();
			Thread.sleep(3000);
			ArrayList<String> alo=new ArrayList<String>(driver1.getWindowHandles());
			System.out.println(alo.size());
			driver1.switchTo().window(alo.get(1));
			Thread.sleep(6000);
			driver1.quit();
			
			WebDriverManager.chromedriver().setup();
			driver2=new ChromeDriver();
			driver2.manage().window().maximize();
			
			driver2.get(url6);
			Thread.sleep(5000);
		WebElement search=	driver2.findElement(By.xpath("//*[@class='js-search-input search__input--adv']"));
		if(search.isDisplayed())
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		
		if(search.isEnabled())
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
		
		driver2.switchTo().newWindow(WindowType.TAB);
		driver2.get(url7);
		Thread.sleep(5000);
		JavascriptExecutor js2= ((JavascriptExecutor)driver2);
		js2.executeScript("window.scroll(0,800)");
		Thread.sleep(5000);
	WebElement male=	driver2.findElement(By.xpath("//*[@value='option2']"));
	male.click();
	if(male.isSelected())
	{
		System.out.println(driver2.findElement(By.xpath("//*[@id='male']")).getText());
		
	}
	
	
	driver2.switchTo().newWindow(WindowType.TAB);
	driver2.get(url7);
	Thread.sleep(5000);
	
	driver2.findElement(By.linkText("Login")).click();
	driver2.navigate().back();
	driver2.navigate().forward();
		driver2.navigate().refresh();
		ArrayList<String> ale=new ArrayList<String>(driver2.getWindowHandles());
		System.out.println(ale.size());
		driver2.switchTo().window(ale.get(1));
		Thread.sleep(5000);
		driver2.quit();
	
	
	
				
	}
	

}
