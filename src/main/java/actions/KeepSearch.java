package actions;

import functions.CommonFunctions;
import org.junit.Assert;
import tests.SelectHotelTest;
import tests.pages.HotelPageFilter;
import tests.pages.HotelPageHomeFilter;


public class KeepSearch extends SelectHotelTest {
    public static CommonFunctions function;
    public static HotelPageHomeFilter hotelPageHomeFilter;
    public static HotelPageFilter hotelPageFilter;
    
    

    public static void searchPleace() {
        hotelPageHomeFilter = new HotelPageHomeFilter(getDriver());
        Assert.assertEquals("https://www.trivago.com.br/",  getDriver().getCurrentUrl());
        hotelPageHomeFilter.setSearchField("Natal");
        Assert.assertEquals("Natal", hotelPageHomeFilter.getSearchField());
        hotelPageHomeFilter.searchButtonClick();               
    }
    
    public static void searchBedroom() {
    	hotelPageFilter = new HotelPageFilter(getDriver());
    	Assert.assertTrue("Preço/noite", hotelPageFilter.getTextPage());
    	hotelPageFilter.clickBedroom();
    	hotelPageFilter.selectBedroom();
    	hotelPageFilter.order();
    	Assert.assertEquals("3", hotelPageFilter.getSelectField());
    	hotelPageFilter.getHotelName();
    	hotelPageFilter.getQtdStars();    	
    	hotelPageFilter.getRoomValue();
    	hotelPageFilter.getSiteName();  	
    	hotelPageFilter.clickLocation();
    	hotelPageFilter.clickComfort();
    	hotelPageFilter.getroomAmenities();

    }
    
    
    


}
