import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actionsclass
{
    @Test
    public void action()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
       // WebElement image=driver.findElement(By.xpath("(//div[@class='figure']//img)[1]"));
       WebElement box= driver.findElement(By.id("hot-spot"));
        Actions action= new Actions(driver);
        action.contextClick(box).perform();
        Alert alert=driver.switchTo().alert();
               String text= alert.getText();
        System.out.println(text);
        Assert.assertEquals(text, "You selected a context menu");
        driver.quit();

    }


}
