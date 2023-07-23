package seleniun;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static selenium.common.Common.getSource;

final class CheckboxTest {
    @BeforeTest
    void openTestPageWithJQuery() {
        open(getSource() + "page_with_selects_without_jquery.html");
    }

    @Test
    void userCanSelectCheckbox() {
        $(By.name("rememberMe")).shouldNotBe(selected);
        $(By.name("rememberMe")).shouldNotBe(checked);

        $(By.name("rememberMe")).click();

        $(By.name("rememberMe")).shouldBe(selected);
        $(By.name("rememberMe")).shouldBe(checked);
    }

    @Test
    void userCanCheckCheckbox() {
        $(By.name("rememberMe")).setSelected(true);
        $(By.name("rememberMe")).shouldBe(selected);
        $(By.name("rememberMe")).shouldBe(checked);

        $(By.name("rememberMe")).setSelected(true);
        $(By.name("rememberMe")).shouldBe(selected);
        $(By.name("rememberMe")).shouldBe(checked);
    }

    @Test
    void userCanUnCheckCheckbox() {
        $(By.name("rememberMe")).setSelected(true);
        $(By.name("rememberMe")).shouldBe(selected);

        $(By.name("rememberMe")).setSelected(false);
        $(By.name("rememberMe")).shouldNotBe(selected);

        $(By.name("rememberMe")).setSelected(false);
        $(By.name("rememberMe")).shouldNotBe(selected);
    }

}