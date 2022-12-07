package demoframework;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class dataprovider {
	
	public static String tour="https://demo.guru99.com/test/newtours/";
	WebDriver guru;
	
	
	
  @Test(dataProvider = "madhu")
  public void test(String n, String s) throws InterruptedException {
	  
	  guru.findElement(By.name("userName")).sendKeys("n");
		guru.findElement(By.name("password")).sendKeys("s");
		Thread.sleep(3000);
		guru.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		guru.findElement(By.linkText("REGISTER")).click();
	  
	  
	  
  }

  @DataProvider
  public Object[][] madhu() {
    return new Object[][] {
      new Object[] { "user", "user" },
      new Object[] { "madhu", "madhu123" },
    };
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  guru=new ChromeDriver();
	  guru.get(tour);
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  
	  guru.close();
	  
  }

}
