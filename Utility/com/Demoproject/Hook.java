/*package com.Demoproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	static WebDriver driver;
	
	@Before
    public static WebDriver setup(){
        System.out.println("This will run before the Scenario");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		return driver;
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        driver.close();
    }

}
*/