package TestScenarios;

import org.testng.annotations.Test;

public class DemoClassTest {
	
	@Test(dataProvider = "data",dataProviderClass = DemoClass.class)
	public void test(String username, String Password)
	{
		System.out.println(username+"----"+Password);
		
	}
	
	@Test(dataProvider = "data",dataProviderClass = DemoClass.class)
	public void test1(String username,String password,String test)
	{
		System.out.println(username+"-----"+password+"-----"+test);
	}

}
