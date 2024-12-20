package listenerss;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testscreenshot implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc is skipped");
	}
	

}
