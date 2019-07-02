package testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configuration.Config;
import libraries.ApplicationLibrary;
import pages.Flightfinder;
import pages.Homepage;

public class TC_Login {
	ApplicationLibrary lib;
	WebDriver driver;
	@BeforeMethod
	public void initialize() {
		lib=new ApplicationLibrary();
	}
	@Test
	public void script() {
		 
		
		//Launch browser
		WebDriver driver=lib.LaunchBrowser();
		assertTrue(driver!=null);
		
		//Navigate to application
		String res=lib.navigate(driver, Config.urlapplicationurl);
		assertTrue(res.contains("Mercury Tours"));
		
		//login
		Homepage page=new Homepage(driver);
		page.login("mercury", "mercury");
		
		
		Flightfinder page2=new Flightfinder(driver);
		assertTrue(lib.isElementPresent(driver, page2.oneway));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
