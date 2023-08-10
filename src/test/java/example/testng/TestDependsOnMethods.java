package example.testng;

import org.testng.annotations.Test;

public class TestDependsOnMethods {

    @Test
    public void login() {
        System.out.println("Login Successful");
    }

    @Test(dependsOnMethods = "login")
    public void searchProduct() {
        System.out.println("Searching for a product");
    }

    @Test(dependsOnMethods = "searchProduct")
    public void addToCart() {
        System.out.println("Adding the product to the cart");
    }

    @Test(dependsOnMethods = "addToCart")
    public void checkout() {
        System.out.println("Proceeding to checkout");
    }
}

