package tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import functions.CommonFunctions;

public class HotelPageFilter {

    private CommonFunctions function;

    public HotelPageFilter(WebDriver driver) {
        function = new CommonFunctions(driver);
    }
      
    public void setSearchField(String hotelName)  {
        function.writeInXpath("//input[@id='querytext']", hotelName);
    }
    public String getSearchField() {
        return function.getXpath("//input[@id='querytext']");
    }
    public void enter() {
    	function.enter("//input[@id='querytext']");
    }
    
    public void searchButtonClick() {
        function.buttonClick("//button[@class='btn btn--primary btn--regular search-button js-search-button']");
    }
    
    
    
}
