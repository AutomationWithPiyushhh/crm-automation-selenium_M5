package listener_utility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class List_Imp implements ISuiteListener, ITestListener {

	ExtentReports report;
	ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
		System.out.println("report config");
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/ad_rep3.html");
		spark.config().setDocumentTitle("Social Media Reports");
		spark.config().setReportName("Login");
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(spark);

		report.setSystemInfo("browser", "edge");
		report.setSystemInfo("OS", "mac");
		report.setSystemInfo("version", "12");
		report.setSystemInfo("ATE", "dinga");
	}

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test = report.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "This test case is passed...");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "This test case is failed...");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "This test case is skipped...");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("report backup");
		report.flush();
	}

}

