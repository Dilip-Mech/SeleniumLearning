package testNGProject;

import org.testng.annotations.Test;

public class InvocationCountMultipleTimes {
	
	@Test(invocationCount = 5)
	public void invocationCount() {
		
		System.out.println("I am a Invocation Count");
		
	}

}
