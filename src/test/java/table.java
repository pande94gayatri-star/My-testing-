import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class table {
    WebDriver driver;
    @Test
    public void webtable1() {
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/tables");

        List<WebElement> rows =
                driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));

        System.out.println("Number of rows: " + rows.size());

        for (WebElement row : rows) {
            System.out.println(row.getText());
        }
    }
    @Test
        public void webtable2()
        {
            driver = new ChromeDriver();

            driver.get("https://the-internet.herokuapp.com/tables");
            List<WebElement> rows= driver.findElements(By.xpath("//table[@id='table2']//tbody/tr"));
            System.out.println("Number of rows: " + rows.size());

            for (WebElement row : rows) {
                String rowtext = row.getText();
                if (rowtext.contains("Doe"))
                {
                    WebElement edit = row.findElement(By.linkText("edit"));
                    edit.click();
                }
                List<WebElement> cells = row.findElements(By.tagName("td"));
                System.out.println(cells.get(2).getText());

            }

                {

                }

        }
    }

