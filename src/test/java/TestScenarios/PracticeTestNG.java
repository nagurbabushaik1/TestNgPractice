package TestScenarios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {

	@BeforeTest
	public void Login() 
	{
		System.out.println("Login To Application");	
	}

	@AfterTest
	public void Logout()
	{
		System.out.println("Logout from Application");
	}

	@BeforeMethod
	public void ConnectDB() 
	{
		System.out.println("Connected to DB");
	}

	@AfterMethod
	public void DisConnectFromDB()
	{
		System.out.println("DisConnected from DB");
	}

	@Test(priority = 1)
	public void atest1()
	{
		System.out.println("test1");
	}

	@Test(priority=2)
	public void atest2()
	{
		System.out.println("test2");
	}

	@Test(priority=3)
	public void atest3() 
	{
		System.out.println("test3");
	}
}
