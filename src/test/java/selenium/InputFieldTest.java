package selenium;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.SearchBy;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static common.Common.getSource;

public class InputFieldTest {
    @BeforeClass
    void openTestPage() {
        open(getSource() + "page_with_selects_without_jquery.html");
    }

    @Test
    public void checkInputField() {
        SearchBy element = new SearchBy(switchTo().window(0));
        element.setWithXpath("//input[@name= \"username\"]");
        WebElement username = element.getByXpath();
        username.sendKeys("TestUserName");
//        username.clear();
        username.sendKeys("TestUserNameAfterClear");

        element.setWithXpath("//input[@name= \"password\"]");
        element.getByXpath().sendKeys("TestPass");

        System.out.println(element.getByXpath().getText());
        element.setWithID("login");
        element.getByID().click();


    }
}


