package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtilities {

    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new ChromeDriver();
        }

        System.out.println("That browser is not existed!");

        return null;
    }
}
