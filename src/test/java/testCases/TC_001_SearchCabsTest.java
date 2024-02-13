package testCases;


import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.CabsPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_SearchCabsTest extends BaseClass {
	
	@Test(priority=1, groups= {"regression", "masters"})
	public void verifySearchCabs() throws InterruptedException {
		
		loger.info("***** Starting TC_001_SearchCabsTest *****");
		
		try {
			
		String sourceCity = "Delhi";
		String destCity = "Manali";
		String pickupdate = "28";
		String monthandyear = "February 2024";
		String hour = "06";
		String minute = "30";
		String meredian = "AM";
		
	
		HomePage homepage = new HomePage(driver);
		CabsPage cabspage = new CabsPage(driver, mywait);
		
		
		//clicking on Cabs in homepage
		homepage.clickCabs();
		loger.info("Clicked on Cabs from menu");
		
		//selecting Outstation One-Way 
		homepage.selectOutstationOneWay();
		loger.info("Selected Outstation One-Way");
		
		//Entering 'Delhi' in from
		loger.info("Entering source city...");
		cabspage.setSourceCity(sourceCity);
		
		//Selecting 'Delhi' from suggestion
		cabspage.selectSourceCityFromSuggestion(sourceCity);
		loger.info("Selected source city from suggestion list");
		
		//Entering destination city name in input box
		loger.info("Entering destination city...");
		cabspage.setDestCity(destCity);
				
		//Selecting from suggestion
		cabspage.selectDestCityFromSuggestion();
		loger.info("Selected destination city from suggestion list...");
		
		//validate month and year from calendar
		cabspage.selectPickUpDate(pickupdate, monthandyear);
		loger.info("Selected pick-up date, month and year...");
		
		//Select pick-up time
		cabspage.selectPickUpTime(hour, minute, meredian);
		loger.info("Selected pick-up time");
		
		//clicking on search button for searching cabs
		cabspage.clickOnSearch();
		loger.info("Clicked on Buy Now");
		}
		catch (Exception e) {
			loger.info("Test Failed!");
			Assert.fail();
		}
		
		loger.info("***** Finished TC_001_SearchCabsTest *****");
		
		
		
		
	}
	

}
