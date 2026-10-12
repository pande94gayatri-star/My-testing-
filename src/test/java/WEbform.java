import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WEbform {
    @Test
    public void testwebform() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.findElement(By.id("my-text-id")).sendKeys("Selenium Practice");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
       WebElement Radiobutton= driver.findElement(By.id("my-radio-1"));
        Assert.assertTrue(Radiobutton.isSelected());
        WebElement Radiobutton2= driver.findElement(By.id("my-radio-2"));
        Assert.assertFalse(Radiobutton2.isSelected());
        Radiobutton2.click();
        driver.findElement(By.className("mt-3")).click();

    }
}