package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class Maincode {
	  
	  public static void main(String[] args) {
	  try {
	  			ChromeDriver driver = new ChromeDriver();
	  			driver.manage().window().maximize();
	  			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  			Thread.sleep(2000);
	  			LoginPage login = new LoginPage(driver);
	  			login.enterUserName("Admin");

	  			Thread.sleep(2000);

	  			login.enterPassword("admin123");
	  			Thread.sleep(2000);
	  			login.ClickOnLogin();
	  			Thread.sleep(2000);

}
	  catch (Exception e) {
	
		}
	  }
	  }
	  
