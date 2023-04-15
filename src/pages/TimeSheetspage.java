package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeSheetspage {

	WebDriver driver;

	By TimeSheetsLocator = By.xpath("//*[text()='My Timesheets']");
	By EditBtnLocator = By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--ghost']");
	By projectboxLocator = By.xpath("//*[@placeholder='Type for hints...']");
	By prjctHintletter = By.xpath("//div[@class='oxd-autocomplete-text-input--after']");
	By ActivtyLocator = By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
	By TimeMon = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[3]/div/div[2]/input");
	By TimeTue = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[4]/div/div[2]/input");
	By TimeWed = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[5]/div/div[2]/input");
	By TimeThu = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[6]/div/div[2]/input");
	By TimeFri = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[7]/div/div[2]/input");
	By TimeSat = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[8]/div/div[2]/input");
	By TimeSun = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[9]/div/div[2]/input");
	By submitbtn = By.xpath("//*[@type='submit']");

	By EmpTsLocator = By.xpath("//*[text()='Employee Timesheets']");

	By EmpNameHintsBox = By.xpath("//*[@placeholder='Type for hints...']");
	By Empname = By.xpath("//*[@class='oxd-autocomplete-text-input--before']");
	By Viewbttn = By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	By EmployeeRecords = By.xpath("//div[@class='orangehrm-container']");

	public void myTimeSheets() {

		driver.findElement(TimeSheetsLocator).click();
		driver.findElement(EditBtnLocator).click();
		boolean prjctbox = driver.findElement(projectboxLocator).isEnabled();
		if (prjctbox == true) {
			System.out.println("Enter the hint letters to display the prjctname");
		}
		driver.findElement(projectboxLocator).sendKeys("h");
		driver.findElement(prjctHintletter).click();
		driver.findElement(ActivtyLocator).click();
		driver.findElement(TimeMon).sendKeys("10:30 AM");
		driver.findElement(TimeTue).sendKeys("11:30 AM");
		driver.findElement(TimeWed).sendKeys("08:30 AM");
		driver.findElement(TimeThu).sendKeys("9:30 AM");
		driver.findElement(TimeFri).sendKeys("11:0 AM");
		driver.findElement(TimeSat).sendKeys("02:30 pM");
		driver.findElement(submitbtn).click();

	}

	public void employeeTimeShets() {

		driver.findElement(EmpTsLocator).click();
		driver.findElement(EmpNameHintsBox).sendKeys("g");
		driver.findElement(Empname).click();
		driver.findElement(Viewbttn).click();
		boolean empdetailsdisplayed = driver.findElement(EmployeeRecords).isDisplayed();
		System.out.println(empdetailsdisplayed);

	}

}
