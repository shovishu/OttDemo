package utils;

import com.aventstack.extentreports.observer.ExtentObserver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.*;
import org.testng.*;

public class ExtentTestNGListener implements ITestListener {

    private static ExtentReports extent;
    private static ExtentTest test;

    public void onStart(ITestContext context) {
        ExtentReports htmlReporter = new ExtentReports();
        extent = new ExtentReports();
        extent.attachReporter((ExtentObserver) htmlReporter);
    }

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Test passed");
    }

    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
    }

    public void onTestSkipped(ITestResult result) {
        test.skip("Test skipped");
    }

    public void onFinish(ITestContext context) {
        extent.flush(); // write everything to the file
    }
}
