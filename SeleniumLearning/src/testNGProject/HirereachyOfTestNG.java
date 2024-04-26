package testNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HirereachyOfTestNG {
	@Test
	public void Test1() {

		System.out.println("This is Test1");
	}

	@Test
	public void Test2() {

		System.out.println("This is Test2");
	}

	@Test
	public void Test3() {

		System.out.println("This is Test3");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This afterSuite");
	}

}
