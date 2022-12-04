package SELENIUM.SELENIUM;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	
	static ExtentReports report;
	
	public static ExtentReports Reports()
	{
		report = new ExtentReports();
		String path = "C:\\Users\\chinn\\sep_2022\\SELENIUM\\reports\\index.html";
		ExtentSparkReporter rep = new ExtentSparkReporter(path);
		rep.config().setDocumentTitle("Testing");
		rep.config().setReportName("Arun");
		report.getStats();
		return report;

	}

}
