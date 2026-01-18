package advance_report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/ad_rep2.html");
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
	public void openMyWeb() {

//		Config

//		Report Generation
		ExtentTest test = report.createTest("openMyWeb");

		WebDriver driver = new ChromeDriver();
		driver.get("https://automationwithpiyush.vercel.app/");
		driver.quit();
		
		test.log(Status.PASS, "This is passed...");
		test.log(Status.FAIL, "This test case is failed!!!");
		test.log(Status.SKIP, "This is skipped...");

//		Report Backup

	}
	
	@Test
	public void loginToFB() {

//		Config

//		Report Generation
		ExtentTest test = report.createTest("loginToFB");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		driver.quit();
		test.log(Status.PASS, "This is passed...");
		test.log(Status.FAIL, "This test case is failed!!!");
		test.log(Status.SKIP, "This is skipped...");

//		Report Backup

	}
	
	@Test
	public void loginToZom() {

//		Config

//		Report Generation
		ExtentTest test = report.createTest("loginToZom");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.quit();	
		test.log(Status.PASS, "This is passed...");
		test.log(Status.FAIL, "This test case is failed!!!");
		test.log(Status.SKIP, "This is skipped...");

//		Report Backup

	}

	@AfterSuite
	public void repBackup() {
		report.flush();
	}

}
