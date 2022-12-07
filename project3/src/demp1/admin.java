package demp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class admin {
	
public static String orange="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Users//babu1//Downloads//chromedriver.exe");
		
		WebDriver madhu=new ChromeDriver();
		madhu.get(orange);
		Thread.sleep(3000);
		madhu.findElement(By.name("username")).sendKeys("Admin");
			madhu.findElement(By.name("password")).sendKeys("admin123");
		madhu.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
		madhu.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(5000);
	//madhu.findElement(By.xpath("//*[@class='oxd-table-body']/div[4]/div/div[1]")).click();
		//madhu.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).click();
//		Thread.sleep(3000);
//		madhu.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(3).click();
//		Thread.sleep(3000);
//		madhu.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
//		Thread.sleep(3000);
//		madhu.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//		//addind  user
madhu.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']/i")).click();

		//madhu.findElement(By.xpath("//*[@class='oxd-table-body']/div[4]/div/div[6]/div/button/i")).click();
		//Thread.sleep(5000);
		//madhu.findElement(By.xpath("//*[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow oxd-dialog-sheet--gutters orangehrm-dialog-popup']/div[3]/button[2]/i")).click();
		//madhu.findElement(By.linkText("Nationalities")).click();
		//madhu.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[4]")).click();
		//Thread.sleep(3000);
		//madhu.findElement(By.linkText("Education")).click();
		//Thread.sleep(3000);
		//madhu.findElement(By.xpath("//*[@class='oxd-table-body']/div/div/div[1]")).click();
		
		//madhu.findElement(By.xpath("//*[@class='oxd-table-body']/div/div/div/div/div/label/span/i")).click();
		//madhu.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[4]")).click();
		//Thread.sleep(3000);
		//madhu.findElement(By.linkText("Languages")).click();
		
		//Thread.sleep(3000);
		//madhu.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		//Thread.sleep(3000);
		//madhu.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[2]/input")).sendKeys("Telugu");
		//Thread.sleep(6000);
		//madhu.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	
		
		//Thread.sleep(6000);
		//clicking checkbox
		//madhu.findElement(By.xpath("//*[@class='oxd-table-body']/div[7]/div/div")).click();
		//Thread.sleep(6000);
		//click delete
		//madhu.findElement(By.xpath("//*[@class='oxd-table-body']/div[7]/div/div[3]/div/button[1]/i")).click();
		//Thread.sleep(6000);
		//pop up
		//madhu.findElement(By.xpath("//*[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow oxd-dialog-sheet--gutters orangehrm-dialog-popup']/div[3]/button[2]/i")).click();
		
		//madhu.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[5]")).click();
		//madhu.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		//Thread.sleep(3000);
		//madhu.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		//madhu.close();
		//madhu.quit();
		
		//madhu.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[1]/div/div[2]/input")).sendKeys("madhu");
		//madhu.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[3]/div/div[2]/div/div/input")).sendKeys("madhavi");
		//madhu.findElement(By.xpath("//*[@type='submit']")).click();
		//madhu.findElement(By.xpath("//*[@class='oxd-main-menu']/li[4]/a")).click();
		//madhu.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[1]/div/div[2]/div/div/input")).sendKeys("lekha");
		//madhu.findElement(By.xpath("//*[@class='oxd-main-menu']/li[7]/a")).click();
	
		//madhu.findElement(By.xpath("//*[@class='oxd-form']/div/div[1]/div/div[2]/div/div/input")).sendKeys("babu");
		//madhu.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		//madhu.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		//madhu.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[2]/div/div[2]/div/div/div[2]")).click();
		
		//System.out.print("no records found");
	}

}
