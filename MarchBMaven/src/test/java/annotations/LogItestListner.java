package annotations;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LogItestListner implements ITestListener {
	
	
		public void onTestStart(ITestResult result) {
			System.out.println("Test Method Started Successfully " + result.getName());
		}

	
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test Method Successfully excuted " + result.getName());
		}

		
		public void onTestFailure(ITestResult result) {
			System.out.println("ohh shit !! Test Method Failed " + result.getName());
		}

		
		public void onTestSkipped(ITestResult result) {
			System.out.println("Test Method Skipped " + result.getName());

		}

		
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub

		}

		
		public void onStart(ITestContext context) {
			System.out.println("-------Testing Started with context Successfully------- " + context.getName());

		}

	
		public void onFinish(ITestContext context) {
			System.out.println("--------------Testing Finished and Execution Ends-------- " + context.getName());


		}



	

}
