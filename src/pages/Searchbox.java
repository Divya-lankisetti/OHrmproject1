package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchbox {
	WebDriver driver ;
	By Search = By.xpath("//div[@class='oxd-main-menu-search']");
	By TimeModule = By.xpath("//a[@class='oxd-main-menu-item active']");
	public void enteronSearchbox()
	{
		boolean serachenable = driver.findElement(Search).isEnabled();
		if(serachenable == true)
		{System.out.println("Search bttn is enabled");
	}
		driver.findElement(Search).sendKeys("Time");
		driver.findElement(TimeModule).click();
		
}
	

}
