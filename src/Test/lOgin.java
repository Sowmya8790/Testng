package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class lOgin extends BaseClass{
	
	@Test(priority=1)
	public void login() {
		
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		
		WebElement pass = driver.findElement(By.name("user_login"));
		pass.sendKeys("Sowmya@123");
		

		WebElement user = driver.findElement(By.name("user_login"));
		user.sendKeys("sowmi3v@gmail.com");
		
	}
	
	@Test(priority=3)
	public void upassword() {
		
System.out.println("this is prio 3");
	}
	

	@Test(priority=2)
	public void username() {
		
System.out.println("this is prio 2");
	}

}
