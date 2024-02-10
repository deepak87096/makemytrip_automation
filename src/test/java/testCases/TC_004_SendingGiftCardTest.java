package testCases;

import org.testng.annotations.Test;

import pageObjects.SendingGiftCardPage;

public class TC_004_SendingGiftCardTest extends TC_003_GiftCardTest{
	
	SendingGiftCardPage sendgift;
	@Test(priority=4, groups = {"regression", "masters"})
	public void verifyClickingOnEmail() throws InterruptedException {
		sendgift = new SendingGiftCardPage(driver);
		
		loger.info("***** Starting TC_004_SendingGiftCardTest *****");
		
		sendgift.clickOnEmail();
		loger.info("Clicked on Email for giftcard");
	}
	
	@Test(priority=5, dependsOnMethods= {"verifyClickingOnEmail"}, groups = {"sanity", "masters"})
	public void verifyGiftCardDetails() throws InterruptedException {
		
		loger.info("Entering sender & receiver details for giftcard...");
		sendgift.setDetails();
	}
	
	@Test(priority=6, dependsOnMethods= {"verifyGiftCardDetails"}, groups = {"sanity", "masters"})
	public void verifyErrorMsg() {
		
		loger.info("Getting error message for invalid emails...");
		sendgift.getErrorMessage();
		
		loger.info("***** Finished TC_004_SendingGiftCardTest *****");
	}
	
	

}
