package functions;

import static utils.BasePage.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


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
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	WebElement writeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    	writeField.sendKeys(desc);
    	writeField.sendKeys(Keys.ENTER);
    }

    public void buttonClick(String xpathButton) {
    	WebDriverWait wait = new WebDriverWait(driver, 60);
    	WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathButton)));
    	button.click();
    }
//    public void enter(String xpathField) {
//    	WebDriverWait wait = new WebDriverWait(getDriver(), 60); 
//    	driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
//    }

    public void orderDistance(String xpath, String desc) {
    	
    	WebElement element = driver.findElement(By.xpath(xpath));
    	element.sendKeys(Keys.ENTER);
        Select combo = new Select(element);
        combo.selectByVisibleText(desc);
    }
    
    public String getXpathSelect(String xpathSelect) {
    	WebDriverWait wait = new WebDriverWait(getDriver(), 60);
    	WebElement validateField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathSelect)));
    	return validateField.getAttribute("meta");
    }
    
    
    public String getHotelName(String xpath) {
		String name = getDriver().findElement(By.xpath(xpath)).getText();
		System.out.println("Nome do Hotel: " + name );
    	return name;
	}
    
    public String getQtdStars(String xpath) {
    	String qtdStars = "0";
    	try {
    		qtdStars = getDriver().findElement(By.xpath(xpath)).getAttribute("content");
		} catch (Exception e) {
		}
    	
    	if (qtdStars != "0") {
    		System.out.println(qtdStars + " estrelas.");
    	} else {
    		System.out.println("Esse hotel nao tem estrelas!");
    	}
    	
    	return qtdStars;
    }
    
    public String getRoomValue(String xpath) {
    	String value = getDriver().findElement(By.xpath(xpath)).getText();
    	System.out.println("Valor:" + value);
    	return value;
    }


}
