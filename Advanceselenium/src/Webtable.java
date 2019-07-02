import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtable {
	@Test
	public void test() throws InterruptedException {
	System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-table");
	driver.manage().window().maximize();
	driver.findElement(By.tagName("table"));
	int rows=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr")).size();
	int col=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr[2]/td")).size();
	System.out.println(rows);
	System.out.println(col);
	for(int r=2; r<=4;r++) {
		for(int c=1; c<=6;c++) {
		System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td["+c+"]")).getText());	
		}
	}
}
}