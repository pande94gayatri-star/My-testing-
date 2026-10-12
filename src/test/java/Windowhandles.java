import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import java.util.Set;




public class Windowhandles {

    WebDriver driver;

    @Test
    public void testwindow() {

         driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println (driver.getWindowHandles());
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {

            if (!window.equals(parentWindow))
                driver.switchTo().window(window);
        }
      WebElement text= driver.findElement(By.tagName("h3"));
      System.out.println(text.getText());
      driver.close();
        driver.switchTo().window(parentWindow);


    }
    @Test
    public void windowhandles()
    {
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
      String  Parentwindowhandle =driver.getWindowHandle();
        System.out.println(Parentwindowhandle);
        WebElement Link=driver.findElement(By.linkText("Click Here"));
        Link.click();
        Set<String> allwindowhandles= driver.getWindowHandles();
        System.out.println(allwindowhandles);
        for (String window: allwindowhandles)
            if (!window.equals(Parentwindowhandle)) {
                driver.switchTo().window(window);
            }


    }
}
