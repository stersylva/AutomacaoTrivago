package functions;

import static utils.BasePage.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

public class CommonFunctions {
    private WebDriver driver;

    public CommonFunctions(WebDriver driver) {
        this.driver = driver;
    }

    public String getXpath(String xpathField) {
    	WebDriverWait wait = new WebDriverWait(getDriver(), 60);
    	WebElement validateField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathField)));
    	return validateField.getAttribute("value");
    }

    public void writeInXpath(String xpath, String desc) {
        driver.findElement(By.xpath(xpath)).sendKeys(desc);
    }

    public void buttonClick(String xpathButton) {
    	WebDriverWait wait = new WebDriverWait(getDriver(), 60);
    	WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathButton)));
    	button.click();
    }
    public void enter(String xpath) {
    	driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
    }

}
