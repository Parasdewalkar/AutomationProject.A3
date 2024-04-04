package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		 String methodName = result.getMethod().getMethodName();
		System.out.println(methodName +"----Test Execution Started----");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		 String methodName = result.getMethod().getMethodName();
		System.out.println(methodName +"---- Test Pass----");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		 String methodName = result.getMethod().getMethodName();
		 
//		 capture screenshot
		 SeleniumUtility s = new SeleniumUtility();
		 JavaUtility j = new JavaUtility();
		 
		 String screenshotName = methodName+"-"+j.getDate();
//		 s.captureScreenShot(BaseClass.sDriver,screenshotName);
		System.out.println(methodName +"----Test Failure----");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		 String methodName = result.getMethod().getMethodName();
		System.out.println(methodName +"----Test Skipped----");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
		System.out.println("----Test Start----");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
		System.out.println("----Test Finish----");
	}

	
}
