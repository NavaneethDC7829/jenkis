package listenerss;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc exec started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc is skipped");
	}
}
