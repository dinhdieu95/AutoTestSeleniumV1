package testng;

import org.testng.annotations.Test;
import common.DataProviderClass;

public class DataProviderTest {
    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testDataProviderMethod(String data) {
        System.out.println("Data is: " + data);
    }
    @Test(dataProvider="newUserData", dataProviderClass=DataProviderClass.class)
    public void testcase1_create_new_user(String username, String password, String confirmpassword) {
        System.out.println(username + "\t" + password + "\t" + confirmpassword);
    }
    @Test(dataProvider="loginData", dataProviderClass=DataProviderClass.class)
    public void testcase2_login_to_tracker(String username, String password) {
        System.out.println(username + "\b" + password);
    }
    @Test(enabled=true, dataProvider="categories", dataProviderClass=DataProviderClass.class)
    public void testcase1_create_category(String category) {
        System.out.println(category);
    }

}
