package javascript1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto1 {

	public String url="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver=new ChromeDriver(options);
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}
	@Test
	public void test1() throws InterruptedException
	{
		
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.getElementById('email').value='madhavilatha.medharametla@gmail.com'");
		
		js.executeScript("document.getElementById('passwd').value='lekhasree@2107'");
		Thread.sleep(3000);
		
		js.executeScript("document.getElementById('SubmitLogin').click()");
		
		
			js.executeScript("document.querySelector('[title=\"T-shirts\"]').click()");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,800)");
			js.executeScript("document.querySelector('[title=\"Add to cart\"]').click()");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('[title=\"Proceed to checkout\"]').click()");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,600)");
			js.executeScript("document.getElementsByClassName('label label-success')[0].style.border=\"thick solid red\"");
			
		
	}
	
	

	
	
}
