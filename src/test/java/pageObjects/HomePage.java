package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	//Locators:------------
	
	//locating Outstation One-Way
	@FindBy(xpath="//li[@data-cy='outstationOneWay']") //need to click on it
	WebElement radiobutton_oneway_loc;
	
	//locating Cabs in HomePage
	@FindBy(xpath="//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Cabs']")
	WebElement lnk_cabs_loc;
	
	//Action Methods:-------------
	
	//Clicking on Cabs menu in home page
	public void clickCabs() {
		lnk_cabs_loc.click(); 
	}
	
	//Clicking on Outstation One-Way
	public void selectOutstationOneWay() {
		radiobutton_oneway_loc.click();
	}
	
}
