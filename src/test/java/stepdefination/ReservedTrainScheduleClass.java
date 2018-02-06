package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReservedTrainScheduleClass {
	WebDriver driver;
	/*
	public ReservedTrainScheduleClass()
	{
		this.driver=Hook.setup();
	}*/
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}

	
	@Given("^Enter the Indian rail url$")
	public void enter_the_Indian_rail_url() throws Throwable {
		
		driver.get("http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=index.html");
			   
	}

	@When("^Click on Reserved Train Schedule link$")
	public void click_on_Reserved_Train_Schedule_link() throws Throwable {
		WebElement Services = driver.findElement(By.xpath("//a[@href='#collapse1']"));		
		Services.click();
		Reporter.log("User clicked  on service link");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[@id='collapse1']//a[contains(text(),'Reserved Train Schedule')]")).click();
		Reporter.log("User clicked on Reserve train schedule link");
		Thread.sleep(7000);	
	}

	@Then("^verify Reserved Train Schedule page$")
	public void verify_Reserved_Train_Schedule_page() throws Throwable {
		 String expectedUrl = driver.getCurrentUrl();
		   Assert.assertEquals(expectedUrl, "http://www.indianrail.gov.in/enquiry/SCHEDULE/TrainSchedule.html?locale=en");
	}

}