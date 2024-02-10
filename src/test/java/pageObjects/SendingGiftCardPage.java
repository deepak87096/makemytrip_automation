package pageObjects;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SendingGiftCardPage extends BasePage {

	public SendingGiftCardPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators:--------------->
	//Locator of E-mail
	@FindBy(xpath="//span[text()='E-Mail']")
//	@FindBy(xpath="//p[@class='font16 lato-black append-bottom10 hrtl-center append-top5']")
	WebElement email_loc;
	
	
	@FindBy(xpath="//h2[@class='heading-text lato-black append-bottom20']")
	WebElement giftformtitle;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement receipient_name;
	
	@FindBy(xpath="//input[@name='mobileNo']")
	WebElement receipient_mobno;
	
	@FindBy(xpath="//input[@name='emailId']")
	WebElement receipient_email;
	
	@FindBy(xpath="//input[@name='senderName']")
	WebElement sender_name;
	
	@FindBy(xpath="//input[@name='senderMobileNo']")
	WebElement sender_mobno;
	
	@FindBy(xpath="//input[@name='senderEmailId']")
	WebElement sender_email;
	
	@FindBy(xpath="//button[@class='prime__btn font16 prime__btn__text']")
	WebElement btn_buynow;
	
	
	@FindBy(xpath="(//p[@class='red-text font11 append-top5'])[1]")
	WebElement receipient_email_error_msg;
	
	@FindBy(xpath="(//p[@class='red-text font11 append-top5'])[2]")
	WebElement sender_email_error_msg;
	
	//Action Methods:---------------->
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//clicking on E-Mail
	public void clickOnEmail() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", email_loc);
		js.executeScript("arguments[0].click();", email_loc);
		 
	}
	
	
	public void setDetails() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", giftformtitle); //scrolling
		Thread.sleep(1000);
		//setting receipient details
		receipient_name.sendKeys("Deepak");
		receipient_mobno.sendKeys("8978675645");
		receipient_email.sendKeys("abcgmail.com");
		
		//setting sender details
		sender_name.sendKeys("Shubham");
		sender_mobno.sendKeys("6767339900");
		sender_email.sendKeys("xyzgmail.com");
		
		//clicking on Buy Now
		btn_buynow.click();
	}
	
	public void getErrorMessage() {
		System.out.println(receipient_email_error_msg.getText());
		System.out.println(sender_email_error_msg.getText());
	}
	

	
	
	
	
	

}
