import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class CheckboxPractise
{@Test
    public void VerifyCheckbox()
    {

      WebDriver driver= new ChromeDriver();
      driver.get("https://the-internet.herokuapp.com/checkboxes?utm_source=chatgpt.com");
        WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        System.out.println(checkbox1.isSelected());
        System.out.println(checkbox2.isSelected());
        if(!checkbox1.isSelected())
        {
            checkbox1.click();
        }
        if (checkbox2.isSelected())
        {
            checkbox2.click();
        }
        System.out.println("Checkbox 1 is "+ checkbox1.isSelected());
        System.out.println("Checkbox 2 is "+ checkbox2.isSelected());

    }
}
