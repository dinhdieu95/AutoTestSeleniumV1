package example.testng;

import org.testng.annotations.Test;

public class TestParallel {
    @Test
    public void method1() {
        System.out.println("Inside method1()");
        //Assert.assertEquals(message, messageUtil.printMessage());
    }
    @Test
    public void method2() {
        System.out.println("Inside method2()");
        //Assert.assertEquals(message, messageUtil.printMessage());
    }
}
