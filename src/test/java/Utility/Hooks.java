package Utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase {
	
@Before
	public void beforeScenario()
	{
		driverInitialization();
	}

@After
	public void afterScenario()
	{
	   // driverclose();
	}

}
