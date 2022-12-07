package defination1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class defination1 {

	
	 String url="https://demoapp.skillrary.com/login.php?type=login";
		
		WebDriver driver;
		//JavascriptExecutor js= ((JavascriptExecutor)driver);
	
	@Given("I should go to the login page")
	public void i_should_go_to_the_login_page() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
	    	    
	}
	@And("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(3000);
		
	WebElement email=	driver.findElement(By.id("email"));
	util1.passingValuesUsingJS(email, string, driver);
		//js.executeScript("document.getElementById('email').value='admin'");
		
	    
	}
	@And("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException {
		Thread.sleep(3000);
		
		WebElement pass=driver.findElement(By.id("password"));
		util1.passingValuesUsingJS(pass, string, driver);
		//js.executeScript("document.getElementById('password').value='admin'");
	    
	}
	@And("Click on the login button")
	public void click_on_the_login_button() {
		
		//js.executeScript("document.getElementById('last').click()");
		WebElement login=driver.findElement(By.id("last"));
		util1.clickElementByJS(login, driver);
	    
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException, IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Users//babu1//Desktop//seleniumshots//Homepage.png"));
		WebElement username=driver.findElement(By.xpath("//*[@class='hidden-xs']"));
		String R=username.getText();
//		js.executeScript("document.getElementsByClassName('hidden-xs')").
   Assert.assertEquals(string, R);
   util1.clickElementByJS(username, driver);
   System.out.println(R);
   Thread.sleep(3000);
  WebElement signout= driver.findElement(By.xpath("//*[@class='dropdown-menu']/li[2]/div[2]/a"));
	   util1.clickElementByJS(signout, driver);
	   driver.close();
	}

		
	
	
}
