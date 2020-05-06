package tests.pages;

import org.openqa.selenium.WebDriver;
import functions.CommonFunctions;

public class HotelPageHomeFilter {

    private CommonFunctions function;

    public HotelPageHomeFilter(WebDriver driver) {
        function = new CommonFunctions(driver);
    }
      
    public void setSearchField(String hotelName)  {
        function.writeInXpath("//input[@id='querytext']", hotelName);
    }
    
    public void searchButtonClick() {
        function.buttonClick("//button[@class='btn btn--primary btn--regular search-button js-search-button']");
    }
    
    public String getSearchField() {
        return function.getXpath("//input[@id='querytext']");
    }   
}
