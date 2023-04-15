package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrowButton {
	WebDriver driver ;
	By Chevron = By.xpath("//*[@class='oxd-icon bi-chevron-right']");
	public ArrowButton(WebDriver driver) {
		this.driver = driver;
	}
public void clickonChevron()
{
	driver.findElement(Chevron).click();
}
}
