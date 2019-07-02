package stepDefination;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	ChromeDriver driver;

	@Given("^Application is up and running$")
	public void application_is_up_and_running() throws Throwable {
		System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable {
	   System.out.println("enter valid credentials");
	}

	@Then("^I should be login successfully$")
	public void i_should_be_login_successfully() throws Throwable {
	  System.out.println("I should be logged in succesfully");
	  
	}
	@When("^I enter (.*?) and (.*?) on login page$")
	public void enter_credential(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
	@Then("^error message should display$")
	public void error_message() {
		driver.close();
	}


}
