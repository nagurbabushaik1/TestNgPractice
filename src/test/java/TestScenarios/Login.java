package TestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Login {
	
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test 
	public void test(String browser) {
		
		if (browser.equals("Chrome")) {
			
			driver = new ChromeDriver();}
		
		
		else if (browser.equals("Firefox")) {
			
			driver = new FirefoxDriver();}
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.quit();
		
		
	}

}
