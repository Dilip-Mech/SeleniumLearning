package testNGProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	public void assertionExample() {
		
		String name="Dilip";
		
		Assert.assertNotEquals(name, "dilip");
	}

}
