package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestExecutionListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // Thực thi trước khi bắt đầu mỗi bài kiểm tra
        System.out.println("Starting test: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Thực thi sau khi bài kiểm tra thành công
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Thực thi sau khi bài kiểm tra thất bại
        System.out.println("Test failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Thực thi sau khi bài kiểm tra bị bỏ qua
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext context) {
        // Thực thi sau khi tất cả các bài kiểm tra hoàn thành
        System.out.println("All tests finished");
    }
}

