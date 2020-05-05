package actions;

import functions.CommonFunctions;
import org.junit.Assert;

import tests.SelectHotelTest;
import tests.pages.HotelPageFilter;


public class KeepSearch extends SelectHotelTest {
    public static CommonFunctions function;
    public static HotelPageFilter hotelPageFilter;
    
    

    public static void searchHotel() {
        hotelPageFilter = new HotelPageFilter(getDriver());
        
        Assert.assertEquals("https://www.trivago.com.br/",  getDriver().getCurrentUrl());
        hotelPageFilter.setSearchField("Natal");
        hotelPageFilter.enter();
        Assert.assertEquals("Natal", hotelPageFilter.getSearchField());      
        hotelPageFilter.searchButtonClick();                
    }
    
    


}
