package libraries;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Config;

public class ApplicationLibrary {
	/* Author : jyoti bankey
	 * Date :28/06/19
	 *Drc: this function will launch the browser
	 *parameter :no parameter
	 *return: this function will retun instance of webdriver
	 */
	
public WebDriver LaunchBrowser() {
	System.setProperty("window.chrome.driver", Config.chromeDriverPath);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	return driver;//Webdriver ka instance return karega
	//
	
}
/* Author : jyoti bankey
 * Date :28/06/19
 *Drc: this function will navigate to url
 *parameter :Webdriver and url
 *return: return title
 */
public String navigate(WebDriver driver, String url) {
	driver.get(url);
	return driver.getTitle();
}
public boolean isElementPresent(WebDriver driver, By element) {
	int size=driver.findElements(element).size();
	
	if(size>=1) {
		return true;
	}else {
		return false;
	}
	
	
}
}
