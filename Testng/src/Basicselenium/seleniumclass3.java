package Basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumclass3 {

	@Test
	public void test() throws InterruptedException {
	System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("REGISTER")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("SUPP")).click();
	System.out.println(driver.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("width"));
	System.out.println(driver.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("height"));
	driver.close();
}
}