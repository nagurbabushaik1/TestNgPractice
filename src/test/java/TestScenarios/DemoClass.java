package TestScenarios;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class DemoClass {


	@DataProvider (name = "data")
	public Object[][] dataset(Method m)

	{
		Object[][] datasetup = null;

		if (m.getName().equals("test"))
		{
			datasetup = new Object[][] {
				{"username","password"},
				{"username1","password1"},
				{"username2","password2"},
				{"username3","password3"}	
			};
		}
		else if(m.getName().equals("test1"))
		{
			datasetup = new Object[][] {
				{"username","password","test"},
				{"username1","password1","test1"},
				{"username2","password2","test2"},
				{"username3","password3","test3"}	
			};
		}
		return datasetup;
	}
}