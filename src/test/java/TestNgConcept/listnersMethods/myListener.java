package TestNgConcept.listnersMethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListener implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("Test Execution is on Started....");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("test Started....");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("test Skipped....");
    }


    public void onTestFailure(ITestResult result) {
        System.out.println("test Failed....");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test Case Execution completed");
    }
}
