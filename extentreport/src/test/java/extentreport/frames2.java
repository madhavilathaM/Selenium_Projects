package extentreport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames2 {

	public static String url="https://the-internet.herokuapp.com/nested_frames";

	WebDriver driver;


	@BeforeTest
	public void Test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();

		
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);

		driver=new ChromeDriver(option);

		driver.get(url);

		driver.manage().window().maximize();

		Thread.sleep(3000);


	}
	@Test
	public void test1() throws InterruptedException, FileNotFoundException
	{

		driver.findElements(By.tagName("frameset")).size();

		System.out.println(driver.findElements(By.tagName("frameset")).size());

		driver.switchTo().frame(driver.findElement(By.name("frame-top")));

		System.out.println(driver.findElements(By.tagName("frame")).size());
		Thread.sleep(3000);
		System.out.println("driver in frame top");
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		System.out.println("driver in middle frame");

		WebElement text=driver.findElement(By.xpath("//*[@id=\"content\"]"));

		System.out.println(text.getText());
		
		
//		PrintStream ps = new PrintStream(new File("C:\\Users\\babu1\\Desktop\\madhavi/console.txt"));
//		 System.setOut(ps);
//		 ps.print(driver.findElement(By.xpath("//*[@id=\"content\"]")).getText());
//		
//		
		
		
		
		


	}




}
