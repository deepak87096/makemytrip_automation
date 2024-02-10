package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.Keys;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;


public class CabsPage extends BasePage{
	
	//WebDriver driver;
	WebDriverWait mywait;
	
	public CabsPage(WebDriver driver, WebDriverWait mywait) {
		
		super(driver);
		this.mywait = mywait;
	}
	
	String sourceCity1 = "//span[@class='sr_city blackText' and contains(text(), '";
	String sourceCity2 = "')]";
	
	String date1_firstmonth = "//div[@class='DayPicker-Month'][1]//div[@aria-disabled='false' and text()='";
	String date2_firstmonth = "']";
	
	String date1_secondmonth = "//div[@class='DayPicker-Month'][2]//div[@aria-disabled='false' and text()='";
	String date2_secondmonth = "']";
	
	String hour1 = "//span[@class='hrSlotItemChild' and text()='";
	String hour2 = "  Hr']";
	
	String minute1 = "//span[contains(@class,'minSlotItemChild') and text()='";
	String minute2 = "  min']";
	
	String meredian1 = "//span[contains(@class,'meridianSlotItemChild') and text()='";
	String meredian2 = "']";
	
	
	
	//Locators:
	//Locating Outstation One-Way Radio button
	@FindBy(xpath="//li[@data-cy='outstationOneWay']")
	WebElement radiobtn_onewayoutstation; //later make all these variable private
	
	//Locating from-input-box container
//	@FindBy(xpath="//div[@class='csw_inputBox searchCity increaseHeight']")
//	WebElement inputbox_source;
	
	//Locating from-input-box
//	@FindBy(xpath="//input[@placeholder='From']")
	@FindBy(id="fromCity")
	WebElement txt_sourcecity;
	
	//Locating from-input-box-suggestion
//	@FindBy(xpath="//span[@class='sr_city blackText' and contains(text(), 'Delhi')]")
//	WebElement option_sourcecity;
	
	//Locating destination-input-box
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement txt_destcity;
	
	//Locating destination-input-box suggestion
//	@FindBy(xpath="//span[@class='sr_city blackText' and starts-with(text(), 'Manali, Himachal Pradesh')]")
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	WebElement option_destcity;
	
	//Locating month from calendar
	@FindBy(xpath="//div[@class='DayPicker-Caption']/div")
	List<WebElement> date_monthandyear;
	
	//for date in calendar
//	@FindBy(xpath="//div[@class='DayPicker-Month'][1]//div[@aria-disabled='false' and text()='"+date+"']")
//	WebElement date;
	
	//Locating dates from month-//div[@class='DayPicker-Month']/div[@class='DayPicker-Body']
//	@FindBy(xpath="//div[@class='DayPicker-Body']")
//	@FindBy(xpath="//div[@class='DayPicker-Month'][1]//div[@aria-disabled='false']")
//	List<WebElement> dates_firstmonth;
	//div[@class='DayPicker-Month'][1]//div[@aria-disabled='false']
	
//	@FindBy(xpath="//div[@class='DayPicker-Month'][2]//div[@aria-disabled='false']")
//	List<WebElement> dates_secondmonth;
//	
	//Next month button in calendar
	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement btn_nextmonth;
	
	//Apply button locator
	@FindBy(xpath="//span[@class='applyBtnText']")
	WebElement btn_apply;
	
	//Search button locator
	@FindBy(xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn']")
	WebElement btn_search;
	
	//car price locator
	@FindBy(xpath="//p[@class='font28 latoBlack blackText ']")
	WebElement txt_lowestprice;
	
	
	//=========================================================
	//Action Methods:
	
	//For-Source city------>
	//Entering value in from textbox
	public void setSourceCity(String fromcity) {
		txt_sourcecity.sendKeys(fromcity);	
	}
	
	//Selecting option from suggestion
	public void selectSourceCityFromSuggestion(String fromcity) {
		driver.findElement(By.xpath(sourceCity1+fromcity+sourceCity2)).click();
	}

	//For Destination------------->
	//Entering value in from textbox
	public void setDestCity(String destcity) throws InterruptedException {
		txt_destcity.sendKeys(destcity);
	}
	
	//Selecting option from suggestion
	public void selectDestCityFromSuggestion() throws InterruptedException {
		Thread.sleep(3000);
		option_destcity.click();
		
		
	}
	
	//for selecting month and date
	public void selectPickUpDate(String pickUpDate, String monthandyear) {
		System.out.println(monthandyear);
		try {
		while(true) {
			if(date_monthandyear.get(0).getText().equals(monthandyear)) {
				js.executeScript("window.scrollBy(0, 100)", "");
				mywait.until(ExpectedConditions.elementToBeClickable(By.xpath(date1_firstmonth+pickUpDate+date2_firstmonth)));
				
				driver.findElement(By.xpath(date1_firstmonth+pickUpDate+date2_firstmonth)).click();
				break;
			}
			else if(date_monthandyear.get(1).getText().equals(monthandyear)) {
				js.executeScript("window.scrollBy(0, 100)", "");
				mywait.until(ExpectedConditions.elementToBeClickable(By.xpath(date1_secondmonth+pickUpDate+date2_secondmonth)));
				
				driver.findElement(By.xpath(date1_secondmonth+pickUpDate+date2_secondmonth)).click();
				break;
			}
			else {
				btn_nextmonth.click();
				System.out.println("next month clicked");
			}
		}
		}
		catch (Exception e) {
			System.out.println("Problem occured: "+e);
		}
	}
	
	
	//selecting pickup time
	public void selectPickUpTime(String hour, String minute, String meredian) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(hour1+hour+hour2)).click(); //selecting hour
		driver.findElement(By.xpath(minute1+minute+minute2)).click(); //selecting minute
		driver.findElement(By.xpath(meredian1+meredian+meredian2)).click(); //selecting am/pm
		
		btn_apply.click(); //clicking on apply button
	}
	
	//clicking on search button
	public void clickOnSearch() {
		btn_search.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
