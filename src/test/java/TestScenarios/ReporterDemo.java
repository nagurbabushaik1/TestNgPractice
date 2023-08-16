package TestScenarios;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterDemo {

	@Test
	public void ReporterTest1() {
		
		Reporter.log("This is Report purpose");
		System.out.println("This is Test1");	
	}
	
	@Test
	public void ReporterTest2() {
		
		System.out.println("This is Test2");
	}
	
	@Test
	public void ReporterTest3() {
		
		System.out.println("This is Test3");
	}
	
	@Test
	public void ReporterTest4() {
		
		System.out.println("This is Test4");
	}
	
	
}
