package example.testng;

import org.awaitility.core.ThrowingRunnable;
import org.openqa.selenium.InvalidArgumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import common.data.DataProviderClass;

public class DataProviderTest {
//    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
//    public void testDataProviderMethod(String data) {
//        System.out.println("Data is: " + data);
//    }
//    @Test(dataProvider="newUserData", dataProviderClass=DataProviderClass.class)
//    public void testcase1_create_new_user(String username, String password, String confirmpassword) {
//        System.out.println(username + "\t" + password + "\t" + confirmpassword);
//    }
//    @Test(dataProvider="loginData", dataProviderClass=DataProviderClass.class)
//    public void testcase2_login_to_tracker(String username, String password) {
//        System.out.println(username + "\b" + password);
//
//        System.out.println("độ lệch = 0.1 ");
//        Assert.assertEquals(2.3, 2.4, 0.1);
//
////        Assert.assertEquals("2.3", "2.3", "2 số bị lệch");
//    }
    @Test(enabled=true, dataProvider="categories", dataProviderClass=DataProviderClass.class)
    public void testcase1_create_category(String category) {
        System.out.println(category);
        System.out.println("độ lệch = 0");
        Reporter.log("Test report");
        Assert.assertSame(category,"Bnt");
//        Object b = new ThrowingRunnable() {
//            @Override
//            public void run() throws Throwable {
//                System.out.println("test assert throws");
//            }
//        };
//
//        Assert.assertEquals("2.3", "2.4", "Kiểm tra độ lệch 2.3 và 2.4 ");
//        Assert.assertThrows(NullPointerException.class,
//                (Assert.ThrowingRunnable) b);
    }

}
