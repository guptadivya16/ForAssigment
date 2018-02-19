package CucumberTestrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Feature/SearchFlightsOne-Way.feature"
		,glue={"src/test/java/StepDefination/SearchFlightOneWay.java"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
