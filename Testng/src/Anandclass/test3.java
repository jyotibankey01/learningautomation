package Anandclass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test3 {
	@Test
	public void test3() {
		System.out.println("test3");
	}

	@Test
	public void test4() {
		System.out.println("test4");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}

}