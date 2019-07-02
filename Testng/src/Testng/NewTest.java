package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeMethod//execute before each menthd
  public void test1() {
	  //Test ng is a framework which user to catarasize 
	  System.out.println("Execute BeforeMethod");
  }
  @Test
  public void test4() {
	  //Test ng is a framework which user to catarasize 
	  System.out.println("This will execute before the method");
  }
  @AfterMethod//execute after each method
  public void test5() {
	  //Test ng is a framework which user to catarasize 
	  System.out.println("This will execute after the method");
  }
  @Test
  public void test2() {
	  System.out.println("Execute test2");
  }
  @Test
  public void test3() {
	  System.out.println("Execute test3");
  }
  @BeforeClass
  
  public void beforeClass() {
  
  System.out.println("This will execute before the Class");
  
  }
  
  @AfterClass
  
  public void afterClass() {
  
  System.out.println("This will execute after the Class");
  
  }
  
  @BeforeTest
  
  public void beforeTest() {
  
  System.out.println("This will execute before the Test");
  
  }
  
  @AfterTest
  
  public void afterTest() {
  
  System.out.println("This will execute after the Test");
  
  }
  
  @BeforeSuite
  
  public void beforeSuite() {
  
  System.out.println("This will execute before the Test Suite");
  
  }
  
  @AfterSuite
  
  public void afterSuite() {
  
  System.out.println("This will execute after the Test Suite");
  
  }
  
}
