package testNGProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int failedCount = 0;
	int limit = 4;
	@Override
	public boolean retry(ITestResult arg0) {

		if(failedCount<limit) {
			failedCount++;
			return true;
		}

		return false;
	}

}
