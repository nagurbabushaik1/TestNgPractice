package TestScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemoClass extends BaseTest {
	
	@Test 
	public void test1() {
		
	driver.get("https://www.opencart.com/");
		Assert.assertTrue(false);
		
	}
	
	

}
