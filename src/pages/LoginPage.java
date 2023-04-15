package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
    By uname = By.name("username");
    By password = By.name("password");
	By login = By.xpath("//button[@type = 'submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String name) {
		driver.findElement(uname).sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	 
	}
	
	public void ClickOnLogin() {
		 driver.findElement(login).click();
	}


}
