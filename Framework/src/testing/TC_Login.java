package testing;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configuration.Config;
import libraries.ApplicationLibrary;
import libraries.Xls_Reader;
import pages.Flightfinder;
import pages.Homepage;

public class TC_Login {

	
	@Test(dataProvider="getdata")
	public void script() {
		ApplicationLibrary lib=new ApplicationLibrary();
		
		//Launch browser
		WebDriver driver=lib.LaunchBrowser();
		assertTrue(driver!=null);
		
		//Navigate to application
		String res=lib.navigate(driver, Config.urlapplicationurl);
		assertTrue(res.contains("Mercury Tours"));
		
		//login
		Homepage page=new Homepage(driver);
		page.login("mercury", "mercury");
		
		
		Flightfinder page2=new Flightfinder(driver);
		assertTrue(lib.isElementPresent(driver, page2.oneway));
	}
	@Test
	public void login (String firstname, String lastname, String phone, String email,
			String address, String city, String state, String usrname, String password, String confirmpassword) throws InterruptedException {
		
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
		
}
	@DataProvider
	public String[][] getdata() throws IOException{
		Xls_Reader x=new Xls_Reader("testdata.xls");
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
	}

