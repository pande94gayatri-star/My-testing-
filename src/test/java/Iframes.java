import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframes {

    @Test
    public void testframes() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement frame = driver.findElement(By.id("mce_0_ifr"));

        driver.switchTo().frame(frame);

        WebElement body = driver.findElement(By.id("tinymce"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].innerHTML = 'Selenium Frames Practice';",
                body
        );

        String text = (String) js.executeScript(
                "return arguments[0].innerText;",
                body
        );

        System.out.println(text);

        Assert.assertEquals(text, "Selenium Frames Practice");

        driver.switchTo().defaultContent();

        driver.quit();
    }
}