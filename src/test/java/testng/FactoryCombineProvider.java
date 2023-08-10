package testng;

import org.testng.annotations.*;
import selenium.common.DataProviderClass;

public class FactoryCombineProvider {
    String userName;
    String pass;

    @Factory(dataProvider = "loginData", dataProviderClass = DataProviderClass.class)
    public FactoryCombineProvider(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
    }


    @Test
    public void testMethodOne() {
        int opValue = 1;
        System.out.println("Test method two output: " + opValue);
        System.out.println("Test method one output: " + userName +"\t"+ pass);
    }

    @Test
    public void testMethodTwo() {
        int opValue = 2;
        System.out.println("Test method two output: " + opValue);
        System.out.println("Test method one output: " + userName +"\t"+ pass);
    }
}
