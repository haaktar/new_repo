import Utilities.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {

    WebDriver driver;

    @BeforeMethod
    public void setDriver() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.buffsci.org/index.html");

    }


    @Test
    public void mainPageMethod() {
        WebElement applyNowButton = driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[1]/div[2]/button/span"));
        applyNowButton.click();


    }
}
