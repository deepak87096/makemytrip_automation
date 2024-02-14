package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CabsResultPage;

public class TC_002_CabsResultTest extends TC_001_SearchCabsTest {
	
	@Test(priority=2, groups = {"regression", "masters"})
	public void verifyCabsResult() {
		
		loger.info("***** Starting TC_002_CabsResultPage *****");
		
		try {
		String cabtype = p.getProperty("cabtype");
		
		CabsResultPage cabsresult = new CabsResultPage(driver);
		
		
		//clicking on SUV checkbox for filtering Cabs
		loger.info("Filtering SUV cabs...");
		cabsresult.clickOnSUV(cabtype);
				
		//getting lowest price of SUV
		loger.info("Getting lowest price of SUV cabs...");
		cabsresult.getLowestPrice();
		}
		catch (Exception e) {
			loger.error("Test Failed!");
			Assert.fail();
		}
		
		loger.info("***** Finished TC_002_CabsResultPage *****");
	}

}
