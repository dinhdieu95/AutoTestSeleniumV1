package seleniun;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static selenium.common.Common.getSource;

public class ConditionsTest {
    @BeforeTest
    void openTestPageWithJQuery() {
        open(getSource() + "page_with_selects_without_jquery.html");
    }

    @Test
    void andShouldCheckConditions() {
        $("#multirowTable").should(and("visible && table", be(visible), have(cssClass("table")))); // both true
        $("#multirowTable").shouldNot(and("visible && list", be(visible), have(cssClass("list")))); // first true
        $("#multirowTable").shouldNot(and("hidden && table", be(hidden), have(cssClass("table")))); // second true
        $("#multirowTable").shouldNot(and("hidden && list", be(hidden), have(cssClass("list")))); // both false
    }

    @Test
    void orShouldCheckConditions() {
        $("#multirowTable").should(or("visible || table", be(visible), have(cssClass("table")))); // both true
        $("#multirowTable").should(or("visible || list", be(visible), have(cssClass("table1")))); // first true
        $("#multirowTable").should(or("hidden || table", be(hidden), have(cssClass("table")))); // second true
        $("#multirowTable").shouldNot(or("hidden || list", be(hidden), have(cssClass("list")))); // both false
    }


    @Test
    void notShouldCheckConditions() {
        $("#multirowTable").should(be(visible));
        $("#multirowTable").should(not(be(hidden)));
    }

    @Test
    void matchWithCustomPredicateShouldCheckCondition() {
        $("#multirowTable").should(match("border=1", el -> el.getAttribute("border").equals("1")));
    }

}
