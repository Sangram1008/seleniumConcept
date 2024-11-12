package TestNgConcept.listnersMethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class extentreportsManager implements ITestListener {


    // UI of the Report
    public ExtentSparkReporter sparkReporter;

    // Common Info on the Report
    public ExtentReports extent;

    // Create test case entries in the report and update status of the test Method
    public ExtentTest test;

    public void onStart(ITestContext context) {

        // Specific Path of the report
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html");

        // Title Report
        sparkReporter.config().setDocumentTitle("Automation Report");

        // Report Name
        sparkReporter.config().setReportName("Function Test");

        // Report Theme
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();

        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Computer Name", "localHost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("TesterName", "San");
        extent.setSystemInfo("OS", "Window");
        extent.setSystemInfo("BrowserName", "Chrome");
    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test Case is Passed : " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test Case is Failed : " + result.getName());
        test.log(Status.FAIL, "Test Case Failed cause is : " + result.getThrowable());
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Case is Skiped : " + result.getName());
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
