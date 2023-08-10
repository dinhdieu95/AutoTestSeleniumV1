package example.testng;
import org.testng.annotations.*;
public class BeforeSuiteAfterSuiteExample {
    @BeforeSuite(alwaysRun = true, dependsOnGroups = {"setup"})
    public void setupSuite() {
        System.out.println("Before Suite: Setting up suite resources");
    }

    @Test(groups = "setup")
    public void setupGroup() {
        System.out.println("Test Group: Setup resources for the tests");
    }

    @BeforeSuite(alwaysRun = true, dependsOnMethods = {"setupSuite"})
    public void beforeSuite() {
        System.out.println("Before Suite: Running common setup tasks");
    }

    @Test(groups = {"group1"})
    public void testCase1() {
        System.out.println("Test Case 1");
    }

    @Test(groups = {"group2"})
    public void testCase2() {
        System.out.println("Test Case 2");
    }

    @Test(groups = {"group1", "group2"})
    public void testCase3() {
        System.out.println("Test Case 3");
    }

    @BeforeSuite(enabled = false)
    public void skippedSuite() {
        System.out.println("This suite won't run");
    }
}
