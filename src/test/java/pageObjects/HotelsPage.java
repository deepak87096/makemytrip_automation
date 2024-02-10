package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsPage extends BasePage {

	public HotelsPage(WebDriver driver) {
		super(driver);
	}
	
	//Locator:---------->
	
	@FindBy(xpath="//li[@class='menu_Hotels']")
	WebElement menu_hotels;
	
	@FindBy(xpath="//div[@class='hsw_inputBox roomGuests']")
	WebElement roomsandguest_dropdown;
	
	@FindBy(xpath="(//div[@class='gstSlctCont'])[2]")
	WebElement adults_dropdown;
	
	@FindBy(xpath="//li[@data-cy='GuestSelect$$_323']")
	List<WebElement> adults_ele;
	
	//Action Methods:----------->
	
	public void clickOnHotels() {
		js.executeScript("arguments[0].click();", menu_hotels);
	}
	
	//clicking on Rooms & Guest dropdown
	public void getAdultsNumber() {
		roomsandguest_dropdown.click();
		adults_dropdown.click();
		List<String> adults_no = new ArrayList<String>();
		for(WebElement ele : adults_ele) {
			adults_no.add(ele.getText());
		}
		
		System.out.println(adults_no);
	}
	
	

}
