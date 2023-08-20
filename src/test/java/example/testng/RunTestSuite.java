package example.testng;

import org.testng.TestNG;

import java.util.Collections;

public class RunTestSuite {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.setTestSuites(Collections.singletonList(System.getProperty("user.dir") + "/src/test/testng/xml/dataProvider.xml"));
        testNG.run();
    }
}
