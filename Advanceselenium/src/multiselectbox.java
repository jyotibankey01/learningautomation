import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class multiselectbox {
	@Test
	public void test() throws InterruptedException {
	System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	Select sel=new Select(driver.findElement(By.id("selenium_commands")));
	sel.selectByIndex(0);
	Thread.sleep(300);
	//sel.deselectByIndex(0);
	//sel.selectByValue("");
	sel.selectByVisibleText("Navigation Commands");
	sel.deselectAll();
}
}
