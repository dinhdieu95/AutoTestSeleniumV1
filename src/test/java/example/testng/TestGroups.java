package example.testng;

import org.testng.annotations.Test;

public class TestGroups {

    @Test(groups = "smoke")
    public void testLogin() {
        System.out.println("Test: Login");
    }

    @Test(groups = "regression")
    public void testSearchProduct() {
        System.out.println("Test: Search Product");
    }

    @Test(groups = "regression")
    public void testAddToCart() {
        System.out.println("Test: Add to Cart");
    }

    @Test(groups = "smoke", dependsOnGroups = "regression")
    public void testCheckout() {
        System.out.println("Test: Checkout");
    }
//các phương thức trong nhóm "regression" sẽ được chạy trước phương thức trong nhóm "smoke".
}
