package dataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginOrangeHRM  {
	
	@Test(dataProvider = "loginData")
	public void login(String uName, String pWard) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userName = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][@name='username']"));
		userName.sendKeys(uName);
		
		WebElement passward = driver.findElement(By.name("password"));
		passward.sendKeys(pWard);
		WebElement clickLoginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
		clickLoginButton.click();
 		
	}
	
	@DataProvider(name="loginData")
	public String[][] loginTestData() {
		
		return data;
	}
	
	String [][] data= {
			/*
			 * {"dummy","dummy"}, {"Admin","dummy"}, {"dummy","admin123"},
			 */
		{"Admin","admin123"}
	};
}
