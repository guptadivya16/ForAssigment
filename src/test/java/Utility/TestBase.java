package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver driver;	
	public static Actions builder;
	public static WebDriverWait wait;
	
	public TestBase()
	{
		System.out.println("we are in testbase constructor");
	}
	public static void driverInitialization()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		System.out.println("we driverInitialization");
		
		driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.MILLISECONDS);
	}	
	public static void driverclose()
	{
		driver.close();
	}
	
	public static void selectvalueFromDropDown(WebElement loc, String Value)
	{
		Select selectoptions = new Select(loc);
		selectoptions.selectByValue(Value);
	}	

	//currently not working
	public static void clickON(WebElement locator, int timeout) {
		 
		WebElement element = null;		 
	    wait = new WebDriverWait(driver, timeout); 
		element = wait.until(ExpectedConditions.visibilityOfElementLocated((By) locator));
		element.click();
		 
	}
	
}
