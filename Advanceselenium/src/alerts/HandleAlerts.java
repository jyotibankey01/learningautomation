package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAlerts {
@Test
		public void hover() throws InterruptedException {
			System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
			driver.manage().window().maximize();
			
			/*JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement ele=driver.findElement(By.xpath("//button[text()='Prompt Pop up']"));
			js.executeScript("argument[0].scrollIntoView()", ele);
			ele.click();
			*/
			JavascriptExecutor js = (JavascriptExecutor)driver;  
			js.executeScript("scrollBy(0, 4500)");  
}

}