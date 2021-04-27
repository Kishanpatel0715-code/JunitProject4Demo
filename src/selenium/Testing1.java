package selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("login");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("logout");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@Test
	public void test3() {
		System.out.println("Test3");
	}

	@Test
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test
	public void test5() {
		System.out.println("Test5");
	}
	
	@Test
	public void test6() {
		System.out.println("Test6");
	}
	
	@Test
	public void test7() {
		System.out.println("Test7");
	}
	
	
}
