package TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeSuite
	public void LaunchBrowser() {
		
		
		driver.manage().window().maximize();
	
	}
	
	@AfterSuite
	public void ClosingBrowser() {
		
		driver.quit();
	}
	

}
