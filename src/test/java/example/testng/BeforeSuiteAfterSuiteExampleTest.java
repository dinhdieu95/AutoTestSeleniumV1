package example.testng;
import org.testng.annotations.*;
public class BeforeSuiteAfterSuiteExampleTest {
    @BeforeSuite(alwaysRun = true, dependsOnGroups = {"setup"})
    public void setupSuite() {
        System.out.println("Before Suite: Setting up suite resources");
    } // 1

    @BeforeTest(groups = "setup")
    public void setupGroup() {
        System.out.println("Test Group: Setup resources for the tests");
    }// 3

    @BeforeSuite(enabled = false, dependsOnMethods = {"setupSuite"})
    public void beforeSuite() {
        System.out.println("Before Suite: Running common setup tasks");
    }//2

    @Test(groups = {"group1"}, dependsOnMethods = "testCase3")
    public void testCase1() {
        System.out.println("Test Case 1");
    }

    @Test(groups = {"group2"},dependsOnGroups = "group1", testName = "Test thu test case 2")
    public void testCase2() {
        System.out.println("Test Case 2");

    }

    @Test(groups = {"group1", "group2"})
    public void testCase3() {
        System.out.println("Test Case 3");
    }

//    @BeforeSuite(dependsOnGroups = "group1")
//    public void skippedSuite() {
//        System.out.println("This suite won't run");
//    }
}
