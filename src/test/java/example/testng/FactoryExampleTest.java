package example.testng;

import common.data.DataProviderClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryExampleTest {
    @Factory
    public Object[] factoryMethod() {
        Object[] instances = new Object[3];
        for (int i = 0; i < 3; i++) {
            instances[i] = new TestClass(i);
        }
        return instances;
    }

    public static class TestClass {

        private int instanceNumber;

        public TestClass(int instanceNumber) {
            this.instanceNumber = instanceNumber;
        }

        @Test(dataProvider = "loginData", dataProviderClass = DataProviderClass.class, timeOut = 5000)
        public void testMethod(String userName, String pass, String pass2) {
            System.out.println("Test Method in instance: " + instanceNumber);
            System.out.println("User: " + userName);
            System.out.println("Password: " + pass);
        }
    }
}
