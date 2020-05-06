package tests.pages;

import org.openqa.selenium.WebDriver;
import functions.CommonFunctions;

public class HotelPageFilter {

    private CommonFunctions function;

    public HotelPageFilter(WebDriver driver) {
        function = new CommonFunctions(driver);
    }
	 
	 public boolean getTextPage() {
		 function.getXpath("//section[@class='refinement-row js-refinement-row refinement-row--no-sticky refinement-row--toolbar']");
		 return true;
	}
	 
	 public void clickBedroom() {
		 function.buttonClick("/html/body/div[4]/div[2]/div[4]/div[1]/form/button[1]/span");
	 }
	 
	 public void selectBedroom() {
		 function.buttonClick("//div[@id='js-fullscreen-hero']//li[1]");
	 }
	 
	 public void order() {
		 function.orderDistance("//select[@id='mf-select-sortby']", "Somente distância");
	 }

	public String getSelectField() {
		return function.getXpath("//*[@id='mf-select-sortby']");
	}
	
	public void clickLocation() {
		function.buttonClick("//li[2]//article/div[1]/div[2]/div/div/div[2]");	
	}
	
	public void clickComfort() {
		function.buttonClick("//div[2]/div/section/div/article/div/div/div/button");
	}
	
	public String getHotelName() {
		return function.getHotelName("//section[@id='js_item_list_section']//li[2]//article//div//h3//span");
	}
		
	public String getQtdStars() {
		return function.getQtdStars("//section[@id='js_item_list_section']//li[2]//article//div//div[@class='quick-info']//div//meta");
	}

	public String getRoomValue() {
		return function.getRoomValue("//section[@id='js_item_list_section']//li[2]//article//section/div[2]/article/div/div[2]/div/div/div/strong");
	}
	
	public String getSiteName() {
		return function.getSiteName("//li[2]//article/div[1]/div[2]/section/div[2]/article/div/div[2]/div/div/span");
	}
	
	public String getroomAmenities() {
		return function.getroomAmenities("//section[@class='expaned']//div[2]");
	}
}
