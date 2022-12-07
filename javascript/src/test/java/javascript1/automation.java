package javascript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automation extends util1 {
	
	

	public String url="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
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
		
		
		WebElement email=driver.findElement(By.name("email"));
		util1.scrollIntoView(email, driver);
		
		util1.passingValuesUsingJS(email, "madhavilatha.medharametla@gmail.com", driver);
		
		WebElement pass=driver.findElement(By.name("passwd"));
		util1.passingValuesUsingJS(pass, "lekhasree@2107", driver);
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.name("SubmitLogin"));
		
		util1.clickElementByJS(login, driver);
		Thread.sleep(3000);
	}
	@Test
	public void test2() throws InterruptedException
	{
		
		Thread.sleep(3000);
	WebElement tshirt=	driver.findElement(By.xpath("//*[@title='T-shirts']"));
	
	
		util1.clickElementByJS(tshirt, driver);
		Thread.sleep(3000);
	//WebElement more=	driver.findElement(By.xpath("//*[@class='button lnk_view btn btn-default']"));
		//util1.clickElementByJS(more, driver);
	
		WebElement cart=driver.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default']"));
		Thread.sleep(6000);
		util1.scrollIntoView(cart, driver);
		util1.clickElementByJS(cart, driver);
		
		//WebElement addtocart=driver.findElement(By.xpath("//*[@id='add_to_cart']"));
		//util1.scrollIntoView(addtocart, driver);
		Thread.sleep(5000);
		//util1.clickElementByJS(addtocart, driver);
		WebElement check=driver.findElement(By.xpath("//*[@title='Proceed to checkout']"));
		//util1.scrollIntoView(check, driver);
		util1.clickElementByJS(check, driver);
		Thread.sleep(3000);
	WebElement stock=	driver.findElement(By.xpath("//*[@class='label label-success']"));
		util1.scrollIntoView(stock, driver);
	util1.drawBorder(stock, driver);
	//util1.changeColor("Black", stock, driver);
	}
	

}
