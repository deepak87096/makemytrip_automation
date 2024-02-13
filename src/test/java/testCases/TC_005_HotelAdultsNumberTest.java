package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HotelsPage;



public class TC_005_HotelAdultsNumberTest extends TC_004_SendingGiftCardTest{
	
	HotelsPage hotelpage;
	
	@Test(priority=7, groups = {"regression", "masters"})
	public void verifyClickOnHotels() {
		hotelpage = new HotelsPage(driver);
		
		loger.info("***** Starting TC_005_HotelAdultsNumberTest *****");
		
		hotelpage.clickOnHotels();
		loger.info("Clicked on Hotels from menu");
	}
	
	@Test(priority=8, dependsOnMethods= {"verifyClickOnHotels"}, groups = {"regression", "masters"})
	public void verifyNoForAdults() throws IOException {
		
		loger.info("Getting numbers for adult person...");
		hotelpage.getAdultsNumber();
		
		loger.info("***** Finished TC_005_HotelAdultsNumberTest *****");
	}
	
}
	