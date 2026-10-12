import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoading {

    @Test
    public void pageload() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Click Start
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until Hello World is visible
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@id='finish']/h4")
                )
        );

        // Get the text
        String actualText = driver.findElement(
                By.xpath("//div[@id='finish']/h4")
        ).getText();

        // Verify
        Assert.assertEquals(actualText, "Hello World!");

        driver.quit();
    }
}
