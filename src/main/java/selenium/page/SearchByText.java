package selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.common.Common;

public class SearchByText {
    WebElement withText = Common.drv.findElement(By.xpath("//text() = \"\""));
}
