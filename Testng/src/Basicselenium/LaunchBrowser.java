package Basicselenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Anandclass.Xls_Reader;

public class LaunchBrowser {
	
	/*@Test
	public void login () {
		System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("jyoti");
		driver.findElement(By.name("lastName")).sendKeys("bankey");
		driver.findElement(By.name("phone")).sendKeys("1234567875");
		driver.findElement(By.name("userName")).sendKeys("jyotibankey2007@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Wagholi");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("email")).sendKeys("jyotibankey2007");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		driver.findElement(By.name("register")).click();
		
	}*/
	
	@Test(dataProvider="getdata")
	public void login (String firstname, String lastname, String phone, String email,
			String address, String city, String state, String usrname, String password, String confirmpassword) throws InterruptedException {
		System.setProperty("window.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("userName")).sendKeys(email);
		driver.findElement(By.name("address1")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("email")).sendKeys(usrname);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);
		driver.findElement(By.name("register")).click();*/
		
		//driver.findElement(By.linkText("sign-in")).click();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("login")).click();
		
		WebElement element= driver.findElement(By.name("passCount"));
		Select sel=new Select(element);
		sel.selectByIndex(2);
		/*Thread.sleep(3000);
		sel.selectByValue("2");
		Thread.sleep(3000);
		sel.selectByVisibleText("4");*/
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
		
		driver.close();

		
	}
	@DataProvider
	public String[][] getdata() throws IOException{
		Xls_Reader x=new Xls_Reader("D:\\210519\\Testng\\src\\testdata\\testdata.xls");
		int row=x.getrowcount("Data2");
		int clm= x.getColumncount("Data2");
		System.out.println(row +"   "  + clm);
		String[][] data=new String[row-1][clm];
		for(int r= 2; r<=row;r++) {
			for(int c=1; c<=clm;c++) {
				data[r-2][c-1]=x.getCellData("Data2", r, c);
			}
		}
		
		
		
		return data;
		
		
	}
	public static void main(String[] args) {
		 
	}
		
	
}