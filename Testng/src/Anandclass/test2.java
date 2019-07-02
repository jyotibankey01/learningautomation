package Anandclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {

	@Test
	public void test1(){
		System.out.println("test1");
	}
	@Test
	public void test2(){
		System.out.println("test2");
	}
	
	@BeforeMethod
	public void precondition() {
		System.out.println("beforemethod");
	}
	
	@AfterMethod
	public void postcondition() {
		System.out.println("aftermenthod");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
}
