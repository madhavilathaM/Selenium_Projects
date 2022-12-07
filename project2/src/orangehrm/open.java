package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open {

	public static String urlname="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//babu1//Downloads//chromedriver.exe");
		WebDriver madhavi=new ChromeDriver();
		madhavi.get(urlname);
		Thread.sleep(3000);
		madhavi.findElement(By.name("username")).sendKeys("Admin");
		madhavi.findElement(By.name("password")).sendKeys("admin123");
		madhavi.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
		
		madhavi.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		madhavi.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		madhavi.close();

	}

}
