package actions;

import functions.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.SelectHotelTest;
import tests.pages.HotelPageFilter;
import tests.pages.HotelPageHomeFilter;


public class KeepSearch extends SelectHotelTest {
    public static CommonFunctions function;
    public static HotelPageHomeFilter hotelPageHomeFilter;
    public static HotelPageFilter hotelPageFilter;
    
    

    public static void searchPleace() throws InterruptedException {
        hotelPageHomeFilter = new HotelPageHomeFilter(getDriver());
        
        Assert.assertEquals("https://www.trivago.com.br/",  getDriver().getCurrentUrl());
        
        hotelPageHomeFilter.setSearchField("Natal");
        Assert.assertEquals("Natal", hotelPageHomeFilter.getSearchField());
        Thread.sleep(5000);
        hotelPageHomeFilter.searchButtonClick();               
    }
    
    public static void searchBedroom() throws InterruptedException {
    	hotelPageFilter = new HotelPageFilter(getDriver());
    	
    	Assert.assertTrue("Preço/noite", hotelPageFilter.getTextPage());
    	Thread.sleep(5000);
    	hotelPageFilter.clickBedroom();
    	hotelPageFilter.selectBedroom();
    	hotelPageFilter.order();
    	Assert.assertEquals("3", hotelPageFilter.getSelectField());
    	Thread.sleep(19000);
    	hotelPageFilter.getHotelName();

    	Thread.sleep(9000);
    	hotelPageFilter.getQtdStars();
    	
    	Thread.sleep(9000);
    	hotelPageFilter.getRoomValue();

//    	String valor = getDriver().findElement(By.xpath("//section[@id='js_item_list_section']//li[2]//article//section/div[2]/article/div/div[2]/div/div/div/strong")).getText();
//    	System.out.println("Valor:" + valor);
    	
    	/*
    	 * localização
    	 */
    	Thread.sleep(9000);
    	hotelPageFilter.clickLocation();
    	Thread.sleep(9000);
    	hotelPageFilter.clickComfort();
    	Thread.sleep(9000);
    	String roomAmenities = getDriver().findElement(By.xpath("//section[@class='expaned']//div[2]")).getText();
    	System.out.println("Quarto" + roomAmenities);
    }
    
    
    


}
