package Anandclass;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class test1 {
@Test
	public void test1() {
		System.out.println("test1");
	}
@Test(priority=0)
public void test2() {
	System.out.println("test2");
	throw new SkipException("Testing");
}
@Test(dependsOnMethods= {"test1", "test4"})
public void test3() {
	System.out.println("test3");
	
	Assert.fail("Test fail");
}
@Test
public void test4() {
	System.out.println("test4");
	Assert.assertEquals("jyoti", "bankey");
}
@Test(priority=0)
public void test5() {
	System.out.println("test5");
}
}