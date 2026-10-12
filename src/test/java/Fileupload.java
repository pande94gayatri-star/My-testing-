import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Fileupload
{
    WebDriver driver;
    @Test
    public void fileuploadtest() {
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement Fileupload =driver.findElement(By.id("file-upload"));
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys("C:\\Users\\satyendra\\Desktop\\testimage.png");
driver.findElement(By.id("file-submit")).click();
        WebElement uploadedFile =
                driver.findElement(By.id("uploaded-files"));

        String fileName = uploadedFile.getText();

        System.out.println("Uploaded file: " + fileName);

        Assert.assertEquals(fileName, "testimage.png");

    }}
