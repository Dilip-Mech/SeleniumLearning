package testNGProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {
	/*
	 * @Test public void assertTest() {
	 * 
	 * System.out.println("Before Assertion");
	 * 
	 * Assert.assertEquals(false, true);
	 * 
	 * System.out.println("After Assertion");
	 * 
	 * }
	 */


	@Test public void verifyTest() {
		
		System.out.println("Before SoftAssertion");
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.fail();
		
		System.out.println("After SoftAssertion");

	}

}
