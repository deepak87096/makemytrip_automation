package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilityFiles.ExcelUtils;

public class HotelsPage extends BasePage {

	public HotelsPage(WebDriver driver) {
		super(driver);
	}
	
	
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
	public void getAdultsNumber() throws IOException {
		roomsandguest_dropdown.click();
		adults_dropdown.click();
		List<String> adults_no = new ArrayList<String>();
		int row = 1;
		for(WebElement ele : adults_ele) {
			adults_no.add(ele.getText());
			ExcelUtils.setCellData("Sheet1",row,3,ele.getText());
			row += 1;
		}
		
		
		
		System.out.println(adults_no);
	}
	
	

}
