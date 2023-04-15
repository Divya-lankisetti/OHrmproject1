package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Attendance {
	WebDriver driver;
	By AttendanceLocator = By.xpath("//*[@class='--active oxd-topbar-body-nav-tab --parent']");
	By Myrecordslocator = By.xpath("//*[text()='My Records']");
	By punchINOUT = By.xpath("//*[text()='Punch In/Out']");
	By Indate = By.xpath("//*[@placeholder='yyyy-mm-dd']");
	By intime = By.xpath("//*[@placeholder='hh:mm']");
	By inbttn = By.xpath("//*[@type='submit']");
	By outdate = By.xpath("//*[@placeholder='yyyy-mm-dd']");
	By outtime = By.xpath("//*[@placeholder='hh:mm']");
	By outbttn = By.xpath("//*[@type='submit']");
	By emprcrds = By.xpath("//*[text()='Employee Records']");
	By empname = By.xpath("//*[@placeholder='Type for hints...']");
	By date = By.xpath("//*[@placeholder='yyyy-mm-dd']");
	By viewbtn = By.xpath("//*[@type='submit']");
	By recrdtable = By.xpath("//div[@class='orangehrm-container']");
	By configurationlocator = By.xpath("//*[text()='Configuration']");
	By buttons = By.xpath("//*[@type='checkbox']");
	By savebttn = By.xpath("//*[@type='submit']");


public void punchINOUTfield()
{
	driver.findElement(AttendanceLocator).click();
	driver.findElement(Myrecordslocator).click();
	driver.findElement(punchINOUT).click();
	driver.findElement(Indate).sendKeys("2023-04-12");
	driver.findElement(intime).sendKeys("9:00 AM");
	driver.findElement(inbttn).click();
	driver.findElement(outdate).sendKeys("2023-04-12");
	driver.findElement(outtime).sendKeys("06:00 PM");	
	
}
public void employeeRecords()
{
	driver.findElement(AttendanceLocator).click();
	driver.findElement(emprcrds).click();
	driver.findElement(empname).sendKeys("g");
	driver.findElement(date).sendKeys("2023-04-12");
	driver.findElement(viewbtn).click();
	driver.findElement(recrdtable).isDisplayed();
}


public void configurationfield()
{
	driver.findElement(AttendanceLocator).click();
	driver.findElement(buttons).click();
	driver.findElement(savebttn).click();
}
	
	
	
	
	
	
	
	
}