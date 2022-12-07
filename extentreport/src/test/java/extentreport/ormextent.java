package extentreport;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ormextent {
	
				
		public static String browser="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver hrm ;
		
		 
		// initialize the HtmlReporter
	ExtentHtmlReporter htmlReporter;

	//initialize ExtentReports and attach the HtmlReporter
	ExtentReports extent;

	//creating tests
	ExtentTest test; 
		
		
		@BeforeTest
		public void beforetest() throws InterruptedException
		{

			 htmlReporter = new ExtentHtmlReporter("extent.html");
			 extent = new ExtentReports();
			 extent.attachReporter(htmlReporter);
			 
			
			
			
			
			WebDriverManager.chromedriver().setup();
			hrm =new ChromeDriver();
			hrm.get(browser);
			Thread.sleep(3000);
		}
		@Test(invocationCount = 3)//login
		public void Testcase1() throws InterruptedException
		{
			
			 test = extent.createTest("OrangeHRMTest");
				SoftAssert SA=new SoftAssert();
						
			
			hrm.findElement(By.name("username")).sendKeys("Admin");
			test.pass("user entered username");
			hrm.findElement(By.name("password")).sendKeys("admin123");
			test.pass("user entered password");
			hrm.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
			Thread.sleep(6000);
			test.info("you are in admin page");
			String Afterlogin=hrm.getCurrentUrl();
			System.out.println(Afterlogin);
			SA.assertEquals(Afterlogin, "latha");
			//SA.assertAll();
			hrm.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			Thread.sleep(3000);
			hrm.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
			Thread.sleep(3000);
			test.pass("you clicked logout");
			test.info("you are logout the page");
			//hrm.navigate().refresh();
			//extent.flush();
			
			
		}
				
	
		@Test(enabled=false)//logout
		public void Testcase3() throws InterruptedException
		{
			hrm.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			Thread.sleep(3000);
			hrm.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
			test.pass("you clicked logout");
			test.info("you are logout the page");
		}
		
		
		@AfterTest(enabled=true)
		public void aftertest() throws InterruptedException
		{
			Thread.sleep(3000);
			hrm.close();
			test.info("you closed the browser");
			extent.flush();
			
			
			
		}
	}



