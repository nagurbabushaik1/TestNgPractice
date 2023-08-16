package TestScenarios;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test (dataProvider ="create")
	public void test1 (String username, String Password)
	{
		System.out.println(username+"-----"+Password);
	}
	
	@Test (dataProvider ="create2" )
	public void test2(String username,String password, String test)
	{
		System.out.println(username+"----"+password+"----"+test);
	}
	
	@DataProvider (name ="create2")
	public Object[][] dataset1()
	{
		
		Object[][] datasetup1 = {
				{"usename","password","test"},
				{"username1","password1","test1"},
				{"usename2","password2","test2"},
				{"username3","password3","test3"}	
				};
		
		return datasetup1;
	}
	
	@DataProvider (name = "create")
	public Object[][] dataset()
	{
		Object[][] datasetup = new Object[4][2];
		
		datasetup[0][0]="user1";
		datasetup[0][1]="Pass1";

		datasetup[1][0]="user2";
		datasetup[1][1]="Pass2";

		datasetup[2][0]="user3";
		datasetup[2][1]="Pass3";

		datasetup[3][0]="user4";
		datasetup[3][1]="Pass4";

		return datasetup;
	}
	

}
