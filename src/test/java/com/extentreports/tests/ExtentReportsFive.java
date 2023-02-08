package com.extentreports.tests;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;


public class ExtentReportsFive {

	@Test
	public void extentTest() {
		ExtentReports extent = new ExtentReports();
		// Html file will be generated
		ExtentSparkReporter spark = new ExtentSparkReporter("Index.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		spark.config().setReportName("Extent Reports Demo");
		extent.attachReporter(spark);
		// create a test node in the report
		ExtentTest test = extent.createTest("login Test");
		// create a test step node in the report
		test.pass("login test started successfully");
		test.info("Url is loaded");
		test.info("value entered");
		test.pass("login test completed successfully");
		ExtentTest test1 = extent.createTest("Homepage Test");
		// create a test step node in the report
		test1.pass("Homepage test started successfully");
		test1.info("Url is loaded");
		test1.info("value entered");
		test1.fail("Homepage test completed successfully");
		
		
		//Unless you call this method your report will not be written with logs
		extent.flush();

	}
}
