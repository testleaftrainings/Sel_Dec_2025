package week8.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		//setup the report path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		//set the history
		reporter.setAppendExisting(true);
		
		//instantiate the ExtentReports
		ExtentReports extent=new ExtentReports();
		
		//attach the file to the reporter
		extent.attachReporter(reporter);
		
		//create testcase and assign the details
		ExtentTest test=extent.createTest("createLead","Lead is created with mandotary  details");
		test.assignAuthor("Saranya");
		test.assignCategory("smoke");
		
		test.pass("lead is created successfuly",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/homepage.png").build());
		test.fail("lead is not created");
		//mandatory step
		extent.flush();
		System.out.println("completed");
	}

}
