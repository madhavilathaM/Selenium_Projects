package defination;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class defination {

	
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
		
	

@Given("Go to login page")
public void go_to_login_page() throws InterruptedException {
    
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	Thread.sleep(3000);
	driver.manage().window().maximize();
			
	
}

@Then("Enter Username {string}")
public void enter_username(String string) {
	
	
	driver.findElement(By.name("username")).sendKeys(string);
    
}

@Then("Enter Password {string}")
public void enter_password(String string) {
    
	driver.findElement(By.name("password")).sendKeys(string);
	
}

@Then("Click Login Button")
public void click_login_button() {
    
	
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}

@And("User Name Should be {string}")
public void user_name_should_be(String string) throws InterruptedException {
	
	Thread.sleep(3000);
	
	
	WebElement name=driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']"));
	String N=name.getText();
	
	 Assert.assertEquals(string,N );
	System.out.println(N);
	
    
}

@Then("Click Logout")
public void click_logout() throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
	
	
    
}


}
