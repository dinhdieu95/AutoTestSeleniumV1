package selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.page.SearchBy;
import selenium.page.SearchByText;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.attributeMatching;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static selenium.common.Common.getSource;

public class AttributeTest {
    @BeforeClass
    void openTestPage() {
        open(getSource() + "page_with_selects_without_jquery.html");
    }


    @Test
    void canVerifyAttributeExistence() {
        $("#domain-container").shouldHave(attribute("class"));
        $("#domain-container").shouldNotHave(attribute("foo"));
    }

    @Test
    void userCanFindElementByAttribute() {
        $(byAttribute("name", "domain")).getTagName().equals("select");
        ($(byAttribute("value", "мыло.ру")).getText())
                .equals("@мыло.ру");
        ($(byAttribute("id", "radioButtons")).getTagName())
                .equals("div");
        ($$(byAttribute("type", "radio"))).size();

    }

    @Test
    void canVerifyAttributeMatching() {
        $("#multirowTable").shouldHave(attributeMatching("class", ".*multirow_table.*"));
        $("#domain-container").shouldHave(attributeMatching("class", "contain.*"));
        $("#domain-container").shouldNotHave(attributeMatching("class", ".*another.*"));
        $("#domain-container").shouldNotHave(attributeMatching("foo", ".*contain.*"));
    }

    @Test
    public void checkObject(){
        SearchBy css = new SearchBy(switchTo().window(0));
        css.setWithCss("#hero");
        css.getCss().getAttribute("class");
    }
}
