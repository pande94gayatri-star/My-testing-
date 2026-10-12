import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {

    WebDriver driver;
    @Test
    public void testalerts() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(alert.getText());
        Assert.assertEquals(text, "I am a JS Alert");
        alert.accept();

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();
    }
    @Test
public void testalert3()
        {

            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

            Alert alert3 = driver.switchTo().alert();
            String text3 = alert3.getText();
            System.out.println(text3);
            alert3.sendKeys("Gayatri");
            alert3.accept();
            Assert.assertEquals(text3, "I am a JS prompt");

            driver.close();

    }
    @Test
    public void doubleclick()
    {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement button = driver.findElement(By.id("doubleClickBtn"));

        // Create Actions object
        Actions action = new Actions(driver);

        // Perform double click
        action.doubleClick(button).perform();

        // Locate result message using text
        WebElement message = driver.findElement(
                By.xpath("//p[text()='You have done a double click']")
        );

        // Get text
        String text = message.getText();

        System.out.println(text);

        // Verify result
        Assert.assertEquals(text, "You have done a double click");
     driver.close();




    }
    @Test
    public void draganddrop()
    {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
       WebElement columnA= driver.findElement(By.id("column-a"));
        WebElement columnB=   driver.findElement(By.id("column-b"));
        Actions action= new Actions(driver);
        action.dragAndDrop(columnA,columnB).perform();
       String Text1= columnA.getText();
        String Text2= columnB.getText();
        Assert.assertEquals(Text1, "B");
        Assert.assertEquals(Text2, "A");
        driver.quit();
}
    @Test
    public void draganddrop1()
    {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement columnA= driver.findElement(By.id("column-a"));
        WebElement columnB=   driver.findElement(By.id("column-b"));
        Actions action= new Actions(driver);
        action.clickAndHold(columnA).perform();
        action.release(columnB).perform();
        String Text1= columnA.getText();
        String Text2= columnB.getText();
        Assert.assertEquals(Text1, "B");
        Assert.assertEquals(Text2, "A");
        driver.quit();
    }


}