package testNGProject;

import org.testng.annotations.Test;

public class SkipTestCases {
	
	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("Star The Gear");
	}
	@Test(priority = 5,enabled = false)
	public void musicTurnedOn() {
		System.out.println("The Music is Turned On");
	}
	
	@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("put First The Gear");
	}
	
	@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("put Second The Gear");
	}
	
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("put Third The Gear");
	}
	
	@Test(priority = 4)
	public void putFourthGear() {
		System.out.println("put Fourth The Gear");
	}

}
