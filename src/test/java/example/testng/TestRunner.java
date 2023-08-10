package example.testng;
import org.testng.TestNG;
public class TestRunner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
//        testNG.setTestClasses(new Class[]{YourTestClass.class});
        testNG.addListener(new TestExecutionListener());
        testNG.run();
    }
}
