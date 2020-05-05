package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
    static WebDriver driver;

    public void BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void BasePage() {
        this.driver = new FirefoxDriver();
    }
    public void navigateTo(String url) {
        driver.navigate().to(url);
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public void closePage() {
        getDriver().close();
    }
}
