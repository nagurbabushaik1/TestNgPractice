package TestScenarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners extends BaseTest implements ITestListener{

	public void onTestStart(ITestResult result) {
	    
		Reporter.log("This is Report purpose"+result.getName());
	  }
	
	 public void onTestSuccess(ITestResult result) {
		 Reporter.log("This is Report purpose"+result.getName());
		  }
	
	public void onTestFailure(ITestResult result) {
		 
		 	System.out.println("Test Failed");
		 	byte[] ScreenShotFile =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			File destFile = new File("./ScreenShots/img1.jpg");
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(destFile);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.write(ScreenShotFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	 }

}
