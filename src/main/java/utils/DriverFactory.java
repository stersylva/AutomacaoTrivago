package utils;

public class DriverFactory extends BasePage {



    public void openPage() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        BasePage();
        getDriver().get("https://www.trivago.com.br/");
        getDriver().manage().window().maximize();

    }

    public void closePage() {
        getDriver().quit();
    }

}
