package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectInfo {
	WebDriver driver;
	By projectinfo = By.xpath("//*[@class='oxd-topbar-body-nav-tab --parent --visited']");
	By customers = By.xpath("//*[text()='Customers']");
	By customersinfo= By.xpath("//*[@class='orangehrm-paper-container']");
	By projects = By.xpath("//*[text()='Projects']");
	By customername= By.xpath("//*[@placeholder='Type for hints...']");
	By search = By.xpath("//*[@type='submit']");
	
	
	public void custmers()
	{
		driver.findElement(projectinfo).click();
		driver.findElement(customers).click();
		driver.findElement(customersinfo).isDisplayed();
	}
	public void projects()
	{
		driver.findElement(projectinfo).click();
		driver.findElement(projects).click();
		driver.findElement(customername).sendKeys("d");
		driver.findElement(search).click();
		
	}

}
