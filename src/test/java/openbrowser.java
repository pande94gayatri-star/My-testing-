import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
    WebDriver driver;
    public void webtable1() {
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/tables");
    }
}
