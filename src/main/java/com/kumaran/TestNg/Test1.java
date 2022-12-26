package com.kumaran.TestNg;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test1 {
	ExtentReports extentReports;
	
	
	public void report(ITestResult result) {
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setReportName("web test");
		spark.config().setDocumentTitle("Test Auto");
	 extentReports= new  ExtentReports();
		extentReports.attachReporter(spark);
		extentReports.setSystemInfo("Tester", "Shamanth");
		
	}
	@Test
	public void loginPage() {
		System.out.println("Im the One to first");
		System.out.println("Im the One to 1");
		System.out.println("Im the One to 2");
		
	}
	@Test(dependsOnMethods = "dashBoardPage")
	public void moduleOne() {
		System.out.println("first in DB");
	}
	@Test(dependsOnMethods = "moduleOne")
	public void moduleSecond() {
		System.out.println("second in DB");
		System.out.println("second1 in DB");
		System.out.println("second2 in DB");
		
	}
	@BeforeTest
	public void testMsg() {
		System.out.println("project Arche, At bign");
	}
	@Test(dependsOnMethods = "moduleSecond")
	public void moduleThird() {
		System.out.println("third in DB");
	}
	@Test(dependsOnMethods = "moduleThird")
	public void logOutPage() {
		System.out.println("Last one");
	}
	@AfterTest
	public void testLastMsg() {
		System.out.println("project Arche, End");
	}
	@Test(dependsOnMethods = "loginPage")
	public void dashBoardPage() {
		System.out.println("Second Execution");
	}
	
	public void endreport() {
		extentReports.flush();
	}
}
