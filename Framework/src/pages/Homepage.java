package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
WebDriver driver;
public Homepage(WebDriver driver) {
	
	this.driver=driver;
}

By username= By.name("userName");
By password= By.name("password");
By login= By.name("login");
By register= By.linkText("REGISTER");

public void login(String username, String password) {
	
	driver.findElement(this.username).sendKeys(username);
	driver.findElement(this.password).sendKeys(password);
	driver.findElement(this.login).click();
}

public void clickRegister() {
	driver.findElement(this.register).click();
}

}