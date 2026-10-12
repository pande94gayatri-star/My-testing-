import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropdownpractise {

    @Test
    public void VerifyDropdown() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown?");
      WebElement dropdownfield= driver.findElement(By.id("dropdown"));

        Select select= new Select(dropdownfield);
        select.selectByVisibleText("Option 1");
        WebElement firstoption=select.getFirstSelectedOption();
       Assert.assertEquals(firstoption.getText(),"Option 1");
      select.selectByValue("2");
        WebElement secondoption = select.getFirstSelectedOption();

        System.out.println(secondoption.getText());
       Assert.assertEquals(secondoption.getText(), "Option 2");
       driver.quit();

    }
}