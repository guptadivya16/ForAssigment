package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LaunchURL {
	WebDriver driver;
	
@Before
public void setup()
{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
	driver.manage().window().maximize();
}

	
@Given("^Enter the url$")
public void enter_the_url() throws Throwable {
	
	driver.get("http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=index.html");
   
}

@When("^Website get open$")
public void website_get_open() throws Throwable {
   
    
}

@Then("^verify the url$")
public void verify_the_url() throws Throwable {
   
   String expectedUrl = driver.getCurrentUrl();
   Assert.assertEquals(expectedUrl, "http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=index.html");
}

}
