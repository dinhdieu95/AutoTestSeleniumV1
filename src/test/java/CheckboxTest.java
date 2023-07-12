import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.page.SearchBy;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Selenide.*;
import static selenium.common.Common.getSource;

public class CheckboxTest {
    @BeforeClass
    void openTestPage() {
        open(getSource() + "page_with_selects_without_jquery.html");
    }

    @Test
    void userCanSelectCheckbox() {
        $(By.name("rememberMe")).shouldNotBe(selected);
        $(By.name("rememberMe")).shouldNotBe(checked);

        $(By.name("rememberMe")).click();

        $(By.name("rememberMe")).shouldBe(selected);
        $(By.name("rememberMe")).shouldBe(checked);
//        assertThat($(By.name("rememberMe"))).hasToString("{By.name: rememberMe}");
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
    public void checkByName() {
        SearchBy element = new SearchBy(switchTo().window(0));
        element.setWithClassName("container");
        element.getClassName().click();
        element.getClassName().isSelected();

    }
    @Test
    public void SelectBoxById() {
        SearchBy element = new SearchBy(switchTo().window(0));
        element.setWithID("hero");
        element.getByID().click();
        element.setWithCss("#hero > option:nth-child(2)");
        element.getCss().click();
        element.getCss().isSelected();

    }
    @Test
    public void CheckBoxByName() {
        SearchBy element = new SearchBy(switchTo().window(0));
        element.setWithName("rememberMe");
        element.getName().click();
        element.getClassName().isSelected();

    }
}
