package factory;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    private static WebDriver driver;

    public static WebDriver getWebDriver(){
        if(driver == null)
            driver = new ChromeDriver();
        return driver;
    }

    public static void quitWebDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
