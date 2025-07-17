package week6.day4;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	
	public static void main(String[] args) {
		//Step 1: Set Physical Report Path
		ExtentHtmlReporter htmlExtent = new ExtentHtmlReporter("./reports/result.html");
		//htmlExtent.setAppendExisting(true);
		//Step 2: Create ExtentReports Object
		ExtentReports extent = new ExtentReports();
		//Step 3: Attach Reporter to ExtentReports
		extent.attachReporter(htmlExtent);
		//Step 4: Create a Test & Assign Details
		ExtentTest test = extent.createTest("CreateLead", "verifying the successful Lead Creation in CRM application");
		test.assignAuthor("Bhuvanesh");
		test.assignCategory("Regression");
		//Step 5: Add Test Logs (Pass/Fail)
		test.pass("Username entered successfully");
		test.pass("password entered succcessfully");
		test.fail("Login button is not clicked");
		//Step 6: Flush the Report (Mandatory)
		System.out.println("Report is generated successfully: check the reports folder");
		extent.flush();
			}

}
