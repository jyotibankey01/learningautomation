package alerts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class multiwindow {
	@Test
	public void hover() throws InterruptedException {
	System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//once we starat implicit wait, it will applicable to all till are instance is alive
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	Actions action=new Actions(driver);
	WebElement web=driver.findElement(By.xpath("//span[text()='Men']"));
	action.moveToElement(web).build().perform();
	//Explicit wait
	WebDriverWait wait=new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Shirts']"))));
driver.findElement(By.xpath("//a[text()='Shirts']")).click();

Thread.sleep(300);
String handle=driver.getWindowHandle();
System.out.println(handle);
driver.findElement(By.xpath("//img[@class='_3togXc'][1]")).click();
Set<String> handle2=driver.getWindowHandles();
for(String w :handle2) {
	if(!handle.equals(w))
	driver.switchTo().window(w);
}

//driver.switchTo().defaultContent();


driver.findElement(By.xpath("//input[@class='_20PCkk']")).sendKeys("452018");
JavascriptExecutor js = (JavascriptExecutor)driver;  
js.executeScript("scrollBy(0, 45)"); 
driver.findElement(By.xpath("//a[text()='S']")).click();
driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
driver.findElement(By.xpath("//a[@class='_3ko_Ud']")).click();
driver.close();
	
}
}
