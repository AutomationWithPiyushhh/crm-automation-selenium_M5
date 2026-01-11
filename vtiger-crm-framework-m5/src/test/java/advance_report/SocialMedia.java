package advance_report;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SocialMedia {
	ExtentReports report;

	@BeforeSuite
	public void repConfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/ad_rep1.html");
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

	@Test
	public void loginToInsta() {
//		Config

//		Report Generation
		ExtentTest test = report.createTest("loginToInsta");
		test.log(Status.PASS, "This is passed...");
		test.log(Status.FAIL, "This test case is failed!!!");
		test.log(Status.INFO, "This is just information");

//		Report Backup

	}

	@Test
	public void loginToFB() {
//		Config

//		Report Generation
		ExtentTest test = report.createTest("loginToFB");
		test.log(Status.PASS, "This is passed...");
		test.log(Status.INFO, "This is just information");

//		Report Backup

	}

	@Test
	public void loginToTwitter() {
//		Config

//		Report Generation
		ExtentTest test = report.createTest("loginToTwitter");
		test.log(Status.INFO, "This is just information");

//		Report Backup

	}

	@AfterSuite
	public void repBackup() {
		report.flush();
	}

}
