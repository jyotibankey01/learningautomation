package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flightfinder {
	WebDriver driver;
	public Flightfinder(WebDriver driver)
	{
		this.driver=driver;
	}

	public By oneway=By.xpath("//input[@value='oneway']");
	
}
