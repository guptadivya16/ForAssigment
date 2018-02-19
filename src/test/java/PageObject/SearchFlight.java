package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Utility.TestBase;

public class SearchFlight extends TestBase {
	
	Actions actions =new Actions(driver);
	
	public SearchFlight() 
	{           
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@title='Any worldwide city or airport'][@id='FromTag']")
	public WebElement fromInputBox;
	
	@FindBy(xpath="//input[@title='Any worldwide city or airport'][@id='ToTag']")
	public WebElement toInputBox;
	
	@FindBy(xpath="//input[@id='DepartDate']")
	public WebElement departOnDateInputBox;
	
	@FindBy(xpath="//input[@id='ReturnDate']")
	public WebElement ReturnDateInputBox;
	
	@FindBy(xpath="//input[@id='SearchBtn']")
	public WebElement SearchButton;
	
	@FindBy(xpath="//input[@id='OneWay']")
	public WebElement oneWayRadioButton;
	
	@FindBy(xpath="//input[@id='RoundTrip']")
	public WebElement roungTripRadioButton;
	
	@FindBy(xpath="//input[@id='MultiCity']")
	public WebElement multiCityRadioButton;
	
	@FindBy(xpath="//select[@id='Adults']")
	public WebElement adultsDropdown;
	
	@FindBy(xpath="//select[@id='Childrens']")
	public WebElement childrensDropDown;
	
	@FindBy(xpath="//select[@id='Infants']")
	public WebElement infantsDropdown;
	
	
	public void enterOnewayDetails(String fromValue, String toValue, String DepartOn, String AdultCount, String ChildrenCount, String InfantsCount) throws InterruptedException
	{
		oneWayRadioButton.click();
		fromInputBox.clear();
		fromInputBox.sendKeys(fromValue);
		
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Reporter.log("we have entered from details");
		toInputBox.clear();
		toInputBox.sendKeys(toValue);
		
		Reporter.log("we have entered To details");	
		departOnDateInputBox.clear();
		departOnDateInputBox.sendKeys(DepartOn);	
		actions.sendKeys(Keys.ENTER).build().perform();
		
		selectvalueFromDropDown(adultsDropdown, AdultCount);
		selectvalueFromDropDown(childrensDropDown, ChildrenCount);
		selectvalueFromDropDown(infantsDropdown, InfantsCount);
		
		//clickON(SearchButton, 500);
		SearchButton.click();
		Thread.sleep(20000);
		
		
		//actions.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void enterRoundTripDetails(String fromValue, String toValue, String DepartOn,String retunOn, String AdultCount, String ChildrenCount, String InfantsCount) throws InterruptedException
	{
		roungTripRadioButton.click();
		fromInputBox.clear();
		fromInputBox.sendKeys(fromValue);
		System.out.println("We are in enter details method");
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		Reporter.log("we have entered from details");
		toInputBox.clear();
		toInputBox.sendKeys(toValue);
		Reporter.log("we have entered from details");	
		
		departOnDateInputBox.clear();
		departOnDateInputBox.sendKeys(DepartOn);	
		//actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		
		ReturnDateInputBox.clear();
		ReturnDateInputBox.sendKeys(retunOn);	
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		selectvalueFromDropDown(adultsDropdown, AdultCount);
		selectvalueFromDropDown(childrensDropDown, ChildrenCount);
		selectvalueFromDropDown(infantsDropdown, InfantsCount);
		Thread.sleep(5000);
		SearchButton.click();
		
		//actions.sendKeys(Keys.ENTER).build().perform();
	}
	

}
