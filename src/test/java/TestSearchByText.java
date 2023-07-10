import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestSearchByText {
    //seleniun
    @Test
    public void check() {
        String url = System.getProperty("user.dir") + "/src/test/resources/" + "page_with_selects_without_jquery.html";
        open(url);
        $(byText("Page with selects")).shouldHave(text("Page with selects"));
        $(byText("Dropdown list")).shouldHave(text("Dropdown list"));
        $(byText("@livemail.ru")).shouldHave(text("@livemail.ru"));
    }

    //    selenium
    @Test
    public void checkSelenium() {
//        String url = System.getProperty("user.dir") + "/src/test/resources/" + "page_with_selects_without_jquery.html";
//        openFile(url);
        WebElement withText = switchTo().activeElement().findElement(By.xpath("//*[contains(text(), \"abcd\")]"));
        System.out.println(withText.isDisplayed());
    }

}


