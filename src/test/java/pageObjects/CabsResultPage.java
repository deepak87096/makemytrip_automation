package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CabsResultPage extends BasePage {
	
	public CabsResultPage(WebDriver driver) {
		super(driver);
		
	}

	String cartype1 = "//label[text()='";
	String cartype2 = "']";

	//Locators:----------------->
	
	//car price locator
	@FindBy(xpath="//p[@class='font28 latoBlack blackText ']")
	WebElement txt_lowestprice;
	
	//Actions Methods:--------------->
	
	//clicking on SUV
	public void clickOnSUV(String cabtype) {
		driver.findElement(By.xpath(cartype1+cabtype+cartype2)).click();
	}
		
	//getting lowest price among searched cab
	public void getLowestPrice() {
		String lowestprice = txt_lowestprice.getText();
		System.out.println(lowestprice);
	}
}
