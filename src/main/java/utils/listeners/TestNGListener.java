package utils.listeners;

import framework.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener extends BaseTest implements ITestListener {

	private final Logger logger = LogManager.getLogger();

	@Override
	public void onStart(ITestContext iTestContext) {
		logger.info("I am in onStart method " + iTestContext.getName());
	}

	@Override
	public void onFinish(ITestContext iTestContext) {
		logger.info("I am in onFinish method " + iTestContext.getName());

		if(null != driver) {
			driver.close();
			driver.quit();
		}
	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		logger.info("Test is starting: " + iTestResult.getName());
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		logger.info("Test PASSED: " + iTestResult.getName());
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		logger.info("Test has failed: " + iTestResult.getName());
	}

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		logger.info("Test skipped: " + iTestResult.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		logger.info("Test failed but it is in defined success ratio: " + iTestResult.getName());
	}
}
