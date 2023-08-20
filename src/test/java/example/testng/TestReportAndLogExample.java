package example.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.EmailableReporter2;

public class TestReportAndLogExample extends EmailableReporter2 {
    @Test
    public void testMethod() {
        Reporter.log("This is a log message", true);
        Assert.assertTrue(true);
    }
}
