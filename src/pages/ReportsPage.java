package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportsPage {
	
		WebDriver driver;
	
		By reportslocator = By.xpath("//*[text()='Reports ']");
		By projectreports = By.xpath("//*[text()='Project Reports']");
		By projectname = By.xpath("//*[@placeholder='Type for hints...']");
		By view = By.xpath("//*[@typer='submit']");
		By empreports = By.xpath("//*[text()='Employee Reports']");
		By empname = By.xpath("//*[@placeholder='Type for hints...']");
		By viewbtn = By.xpath("//*[@typer='submit']");
		By attendancesummary = By.xpath("//*[text()='Attendance Summary']");
		By empyname=By.xpath("//*[@placeholder='Type for hints...']");
		By viewBttn = By.xpath("//*[@type='submit']");
		
		
		public void prjctReports()
		{
			driver.findElement(reportslocator).click();
			driver.findElement(projectreports).click();
			driver.findElement(projectname).sendKeys("d");
			driver.findElement(view).click();
		}
		
		public void employeereports()
		{
			driver.findElement(reportslocator).click();
			driver.findElement(empreports).click();
			driver.findElement(empname).sendKeys("g");
			driver.findElement(viewbtn).click();
						
		}
		public void attendanceSummary()
		{
			driver.findElement(reportslocator).click();
			driver.findElement(attendancesummary).click();
			driver.findElement(empyname).sendKeys("h");
			driver.findElement(viewBttn).click();
			
		}
		
		
		
		
		

}
