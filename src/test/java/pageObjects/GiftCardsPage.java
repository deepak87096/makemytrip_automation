package pageObjects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilityFiles.ExcelUtils;

public class GiftCardsPage extends BasePage{

	public GiftCardsPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	//Locator of 'More' in menu
	@FindBy(xpath="//li[@class='menu_More moreItem']")
	WebElement dropdown_moremenu;
	
	//Locator of 'GiftCards' in dropdown
	@FindBy(xpath="//a[text()='Giftcards']")
	WebElement option_giftcards;
	
	
	@FindBy(xpath="//h3[@class='lato-black black-text' and text()='Wedding Gift Card']")
	WebElement txt_giftcard;
	
	
	Actions act = new Actions(driver);
	
	//clicking on More dropdown
	public void selectGiftCardsOption() {
		act.moveToElement(dropdown_moremenu).moveToElement(option_giftcards).click().build().perform();
	}
	
	//selecting giftcard
	public void selectGiftCard() throws IOException {
		for(int i=0;i<8;i++) {
			act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		}
		ExcelUtils.setCellData("Sheet1",1,1,txt_giftcard.getText());
		txt_giftcard.click();
	}
}
