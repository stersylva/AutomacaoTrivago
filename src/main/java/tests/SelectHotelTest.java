package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import actions.KeepSearch;
import utils.DriverFactory;

public class SelectHotelTest extends DriverFactory {
    static WebDriver driver;
    @Before
    public void inicialize() {
        openPage();
    }
    @After
    public void finaliza() {
    	closePage();
    }

    @Test
    public void selectHotel() {
        KeepSearch.searchPleace();
        KeepSearch.searchBedroom();
       
    }    
}
