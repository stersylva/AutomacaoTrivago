package utils;

import org.openqa.selenium.WebDriver;

public class DriverFactory extends BasePage {

    static WebDriver driver;

    public void openPage() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        BasePage();
        getDriver().get("https://www.trivago.com.br/");
        getDriver().manage().window().maximize();


    }

    public void closePage() {
        getDriver().close();
    }

}
