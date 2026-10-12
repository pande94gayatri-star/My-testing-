import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assignment2
{@Test
    public void findlocator()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        boolean text1=driver.findElement(By.id("username")).isDisplayed();
        System.out.println(text1);

        boolean text2= driver.findElement(By.name("password")).isEnabled();
        System.out.println("Password field is " + text2);

       System.out.println(driver.findElement(By.className("radius")).getText()) ;
        System.out.println(driver.findElement(By.className("radius")).getAttribute("type"));
        System.out.println(driver.findElement(By.linkText("Elemental Selenium")).getText());


        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/secure"));



    }
}
