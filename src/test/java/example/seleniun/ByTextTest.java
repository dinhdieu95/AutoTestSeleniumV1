package example.seleniun;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static common.Common.getSource;
public class ByTextTest {
    @BeforeTest
    void openTestPage() {
        open(getSource() +"page_with_selects_without_jquery.html");
    }

    @Test
    void userCanFindElementByText() {
        $(byText("Page with selects")).shouldHave(text("Page with selects"));
        $(byText("Dropdown list")).shouldHave(text("Dropdown list"));
        $(byText("@livemail.ru")).shouldHave(text("@livemail.ru"));
    }


    @Test
    void spacesInTextAreIgnored() {
        $(byText("L'a Baskerville")).shouldHave(text("L'a Baskerville"));
        $(withText("L'a Baskerville")).shouldHave(text("L'a Baskerville"));

    }

    @Test
    void nonBreakableSpacesInTextAreIgnored() {
        $("#hello-world").shouldHave(text("Hello world"));
        $(byText("Hello world")).shouldHave(attribute("id", "hello-world"));
        $(withText("Hello world")).shouldHave(text("Hello world"));
        $(".level2").$(withText("Hello ")).shouldHave(text("Hello world"));
        $(".level2").$(withText(" world")).shouldHave(text("Hello world"));
    }



    @Test
    void canFindElementContainingText() {
        $(withText("age with s")).shouldHave(text("Page with selects"));
        $(withText("Dropdown")).shouldHave(text("Dropdown list"));
        $(withText("@livemail.r")).shouldHave(text("@livemail.ru"));
    }


    @Test
    void canFindElementContainingTextInsideParentElement() {
        $("#multirowTable").findAll(withText("Cha")).shouldHave(size(2));
        $("#multirowTable tr").findAll(withText("ack")).shouldHave(size(1));
        $("#multirowTable tr", 1).find(withText("hac")).shouldHave(cssClass("second_row"));
    }

    @Test
    void canFindElementsByI18nText() {
        $(byText("Маргарита")).shouldHave(attribute("id", "radioButtons"));
        $(withText("Марг")).shouldHave(attribute("id", "radioButtons"));
        $(byText("Кот \"Бегемот\"")).click();
        $(withText("т \"Бегемот\"")).click();

    }

    @Test
    void quotesInText() {
        $(byText("Arnold \"Schwarzenegger\"")).shouldBe(visible);

        $("#hero").find(byText("Arnold \"Schwarzenegger\"")).shouldBe(visible);
        $("#apostrophes-and-quotes").find(By.linkText("Options with 'apostrophes' and \"quotes\"")).click();
    }



}
