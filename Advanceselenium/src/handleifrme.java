import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handleifrme {
	@Test
	public void hover() throws InterruptedException {
	System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.paytm.com/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	Thread.sleep(10000);
	List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
	 System.out.println("The total number of iframes are " + iframeElements.size());
	// driver.switchTo().frame(0);
	
	 driver.switchTo().frame( driver.findElement(By.tagName("iframe")));
	driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='X']")).click();
	driver.quit();
			}
}
