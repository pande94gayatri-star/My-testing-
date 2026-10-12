import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest

{
    @Test
    public void testgoogle()
    {
        WebDriver Driver= new ChromeDriver();
        Driver.get("https://www.google.com");
       String title=Driver.getTitle();
               System.out.println(title);
        System.out.println(Driver.getCurrentUrl());
        Assert.assertEquals(title,"Google");
       boolean result= Driver.findElement(By.id("ti6dpd")).isDisplayed();
       System.out.println(result);
       Driver.findElement(By.id("ti6dpd")).sendKeys("Selenium WebDriver");
       String enteredtext=Driver.findElement(By.id("ti6dpd")).getAttribute("value");
       Assert.assertEquals(enteredtext,"Selenium WebDriver");



        Driver.close();



    }

}
