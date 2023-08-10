package example.testng;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestReportAndLogExample {
    @Test
    public void testMethod() {
        Reporter.log("This is a log message", true);
        Assert.assertTrue(true);
    }
}
