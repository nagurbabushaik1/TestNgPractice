package TestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void nagur() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("HYR Tutorials",Keys.ENTER);
		String PageTitle =driver.getTitle();
		System.out.println(PageTitle);
		driver.quit();
		
	}
		@Test
		public void xlogin() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("admin123");
			driver.findElement (By.xpath("//button[text()=' Login ']")).click();
			//System.out.println(driver.getTitle());
			driver.quit();
			
		}
	
}
