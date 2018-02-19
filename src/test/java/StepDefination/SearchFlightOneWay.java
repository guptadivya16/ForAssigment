package StepDefination;

import PageObject.SearchFlight;
import PageObject.SearchResult;
import Utility.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchFlightOneWay extends TestBase  {
	SearchFlight searchFlight = new SearchFlight();
	SearchResult searchResult = new SearchResult();
	
	 public SearchFlightOneWay()
	 {
		 super();
	 }
	 
	@Given("^Enter the cleartrip url$")
	public void enter_the_cleartrip_url() throws Throwable {
	System.out.println("We have launched the URL");
	//------------------------------------------------------------------------------

	}
	@When("^User Enter the Flight details \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_Enter_the_Flight_details(String fromValue, String toValue, String DepartOn, String AdultCount, String ChildrenCount, String InfantsCount) throws Throwable {
		  searchFlight.enterOnewayDetails(fromValue, toValue, DepartOn, AdultCount, ChildrenCount, InfantsCount);
	}
	@Then("^Search result should display$")
	public void search_result_should_display() throws Throwable {
		searchResult.resultCount();
	}
	//------------------------------------------------------------------------------------
	
	@When("^User Enter the Flight details for round Trip \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_Enter_the_Flight_details_for_round_Trip(String fromValue, String toValue, String DepartOn, String returnOn, String AdultCount, String ChildrenCount, String InfantsCount) throws Throwable {
		searchFlight.enterRoundTripDetails(fromValue, toValue, DepartOn, returnOn, AdultCount, ChildrenCount, InfantsCount);
	}

	@Then("^Search result should display for round trip$")
	public void search_result_should_display_for_round_trip() throws Throwable {
	   
	}
	

}
