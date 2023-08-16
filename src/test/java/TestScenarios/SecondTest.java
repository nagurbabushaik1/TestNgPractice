package TestScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
	@Test
	public void OpeningWebPage() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("github login",Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Sign in to GitHub']")).click();
		driver.findElement(By.id("login_field")).sendKeys("jamalsa786@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Nagur@786");
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		String lable = driver.findElement(By.xpath("//div[@class='js-flash-alert']")).getText();
		System.out.println(lable);
		driver.getTitle();
		Thread.sleep(3000);
		driver.quit();

	}

}
