package defination4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class defination4 {
	String url="https://demo.guru99.com/test/newtours/index.php";
	
	WebDriver driver;
	
	@Given("I should go to the login page")
	public void i_should_go_to_the_login_page() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		
	   
		
	}
	@Given("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys(string);
	   
		
	}
	@Given("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(string);
	    
	}
	@Given("Click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("submit")).click();
	    
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
		
		String T=driver.getTitle();
		Assert.assertEquals(string, T);
		
		System.out.println(T);
	    
	}

}
