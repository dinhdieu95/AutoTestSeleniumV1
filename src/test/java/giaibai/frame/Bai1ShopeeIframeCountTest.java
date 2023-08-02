package giaibai.frame;

import giaibai.ITest;
import org.openqa.selenium.By;

public class Bai1ShopeeIframeCountTest extends ITest {
    @Override
    public void test() {
        super.getDriver().get("https://shopee.vn/");
        int iframeCount = super.getDriver().findElements(By.tagName("iframe")).size();
        System.out.println("Số lượng iframe trên trang Shopee: " + iframeCount);

    }
}
