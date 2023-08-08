package testng;

import org.testng.annotations.*;

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

        @Test
        public void testMethod() {
            System.out.println("Test Method in instance: " + instanceNumber);
        }
    }
}
