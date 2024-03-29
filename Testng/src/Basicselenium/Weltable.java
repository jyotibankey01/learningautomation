package Basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Weltable {
	public void login () throws InterruptedException {
		System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("login")).click();
		
		WebElement element= driver.findElement(By.name("passCount"));
		Select sel=new Select(element);
		sel.selectByIndex(2);
	
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		sel=new Select(driver.findElement(By.name("fromPort")));
		sel.selectByIndex(3);
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		String expected=driver.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif'][@size='2']")).getText();
		String acual="Select your departure and return flight from the selections below. Your total price will be higher than quoted if you elect to fly on a different airline for both legs of your travel.";
		if(acual.equalsIgnoreCase(expected))
			System.out.println("successfull");
		else {
			System.out.println("fail");
		}
		List<WebElement> rows= driver.findElements(By.xpath("//table[@bgcolor='ffffff'][1]/tbody/tr"));
		for(WebElement r :rows) {
			List<WebElement> col=r.findElements(By.tagName("td"));
			for(WebElement c :col) {
				System.out.println(c.getText());
			}
		}
		driver.findElement(By.cssSelector("input[name='reserveFlights']")).click();
		driver.findElement(By.cssSelector("input[name='ticketLess']")).click();
		System.out.println("77777777777777777777777777777777777777777777777");
		System.out.println(driver.findElement(By.cssSelector("input[name='ticketLess']")).isSelected());
		driver.close();

		
	}
}
