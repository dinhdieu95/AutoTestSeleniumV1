package pom.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TikiHomePage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@data-view-id='main_search_form_input']")
    // tìm kiếm phần tử bằng xpath và giá trị của xpath
    private WebElement searchInput;

    //    @FindBys(xpath = "//*[@data-view-id='main_search_form_button']")
    @FindBy(xpath = "//*[@data-view-id='main_search_form_button']")
    private WebElement searchButton;

    public TikiHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchProduct(String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
    }
}