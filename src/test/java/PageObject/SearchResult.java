package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.TestBase;

public class SearchResult extends TestBase {
	
Actions actions =new Actions(driver);
	
	public SearchResult() 
	{           
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@class='resultUnit flightDetailsLink ']")
	public List<WebElement> resultSet;
	
	public void resultCount()
	{
		int count=resultSet.size();
		
		if(count==0)
		{
			System.out.println("No result found");
		}
		else
		{
			System.out.println(count +" = Result found");
		}
	}
}

