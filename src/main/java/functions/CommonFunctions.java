package functions;

import static utils.BasePage.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BasePage;


public class CommonFunctions {
    private WebDriver driver;
    private WebDriverWait wait;
    private BasePage basePage;
    
    public CommonFunctions(WebDriver driver) {
    	this.basePage = new BasePage();
        this.driver = driver;
        this.wait = this.basePage.getWait();

    }

    public String getXpath(String xpathField) {
    	WebDriverWait wait = new WebDriverWait(getDriver(), 5000);
    	WebElement validateField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathField)));
    	return validateField.getAttribute("value");
    }

    public void writeInXpath(String xpath, String desc) {
    	wait = new WebDriverWait(driver, 5000);
    	WebElement writeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    	writeField.sendKeys(desc);
    	writeField.sendKeys(Keys.ENTER);
    }

    public void buttonClick(String xpathButton) {
    	wait = new WebDriverWait(driver, 5000);
    	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathButton)));
    	button.click();
    }

    public void orderDistance(String xpath, String desc) {
    	wait = new WebDriverWait(driver, 5000);
    	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    	element.sendKeys(Keys.ENTER);
        Select combo = new Select(element);
        combo.selectByVisibleText(desc);
    }    
    
    public String getHotelName(String xpath) {
    	wait = new WebDriverWait(driver, 5000);
    	String name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();
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
    	wait = new WebDriverWait(driver, 5000);
    	String value = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();
    	System.out.println("Valor:" + value);
    	return value;
    }
    
    public String getSiteName(String xpath) {
    	wait = new WebDriverWait(driver, 5000);
    	String siteName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();
    	System.out.println("Site de oferta: " + siteName);
    	return siteName;

    }
    
    public String getroomAmenities(String xpath) {
    	wait = new WebDriverWait(driver, 5000);
    	String roomAmenities = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();
    	System.out.println("Conformidades do Quarto: " + roomAmenities);
    	return roomAmenities;
    	
    }


}
