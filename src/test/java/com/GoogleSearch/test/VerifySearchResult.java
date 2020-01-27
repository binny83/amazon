//Binny Patel

package com.GoogleSearch.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.google.TestBase.GoogleBase;
import com.test.google.automation.googleSearchPage;

public class VerifySearchResult extends GoogleBase{
	
	googleSearchPage objPage;
	
	@BeforeClass
	public void OpenApplication() 
	{
		setup();
		
	}
	
	@Test
	public void verifySearchText() {
		
	
		objPage = new googleSearchPage(driver);
		
		objPage.searchTextOnGoogle("shoes");
		
		Assert.assertTrue(objPage.getTextValue().toLowerCase().contains("About 7,220,000,000 results (0.80 seconds)"));
		
	} 
	
	@AfterTest
	public void  endTest() {
		
		tearDown();
	}

}
