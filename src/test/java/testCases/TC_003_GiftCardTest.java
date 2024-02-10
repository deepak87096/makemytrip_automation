package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.GiftCardsPage;

public class TC_003_GiftCardTest extends TC_002_CabsResultTest{
	
	@Test(priority=3, groups = {"sanity", "regression", "masters"})
	public void verifyGiftCard () {
		
		try {
		
		GiftCardsPage giftcard = new GiftCardsPage(driver);
		
		
		//clicking on 'GiftCards' option from More dropdown in menu
		giftcard.selectGiftCardsOption();
		loger.info("Selected GiftCards from dropdown...");
		
		//selecting 'Wedding GiftCard' from Group of giftcards
		giftcard.selectGiftCard();
		loger.info("Selected wedding giftcard from group of giftcards...");
		}
		catch (Exception e) {
			loger.error("Test Failed!");
			Assert.fail();
		}
		
		loger.info("***** Finished TC_003_GiftCardTest *****");
	}

}
