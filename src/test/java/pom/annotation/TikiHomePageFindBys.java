package pom.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TikiHomePageFindBys {
    private WebDriver driver;

    @FindBys({
            @FindBy(xpath = "//*[@data-view-id='main_search_form_input']"),
            @FindBy(xpath = "//*[@data-view-id='main_search_form_button']")
    })
    private List<WebElement> searchInput;

    public TikiHomePageFindBys(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchForProduct(String keyword) {
        if (!searchInput.isEmpty()) {
            searchInput.get(0).sendKeys(keyword);
            searchInput.get(0).click();
        } else {
            System.out.println("Search input not found.");
        }
    }
}
