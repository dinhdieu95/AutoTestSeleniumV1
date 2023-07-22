import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class DynamicTableTest {
    @Test
    public void dynamicTable() {
        WebDriver wd;
        System.setProperty(CONFIG_DRIVER_CHROME,URL_SRC_CHROME);
        wd= new ChromeDriver();
        wd.get("https://demo.guru99.com/test/web-table-element.php");
        //Các phần tử cột
        List<WebElement> col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size());
        //Các phần tử hàng
        List <WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("No of rows are : " + rows.size());
        wd.close();
    }
    @Test
    public void maxFromTable(){
        WebDriver wd;
        System.setProperty(CONFIG_DRIVER_CHROME,URL_SRC_CHROME);
        wd= new ChromeDriver();
        wd.get("https://demo.guru99.com/test/web-table-element.php");
        String max;
        double m=0,r=0;

        //No. of Columns
        List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Total No of columns are : " +col.size());
        //No.of rows
        List  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Total No of rows are : " + rows.size());
        for (int i =1;i<rows.size();i++)
        {
            max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
            NumberFormat f =NumberFormat.getNumberInstance();
            Number num = null;
            try {
                num = f.parse(max);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            max = num.toString();
            m = Double.parseDouble(max);
            if(m>r)
            {
                r=m;
            }
        }
        System.out.println("Maximum current price is : "+ r);
    }
}
