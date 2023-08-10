package example.selenium;

import org.testng.annotations.Test;

public class TestRunAnontation {

    @Test
    public void test(){
        System.out.println("Hello world test");
        khNonStatic("Dieu" , 28);
    }
    public void khNonStatic(String ten, int tuoi){
        System.out.println("Ham static: " + "Ten: " + ten + " và tuoi " + tuoi);
    }
}
