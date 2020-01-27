package com.test.google.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.google.TestBase.GoogleBase;

public class googleSearchPage extends GoogleBase{
	
	WebDriver driver;
	
	By searchBox=By.name("q");
	By searchButton=By.xpath("//input[@type='submit']");
	By searchText=By.id("resultStats");
	
	public googleSearchPage(WebDriver driver) {
	
		this.driver=driver;
	
	}
	public void enterSearchText(String searchtxt) {
		
		driver.findElement(searchBox).sendKeys(searchtxt);
	}
	
	public void clickSearchButton() {
		
		driver.findElement(searchButton).click();
	}
	
	public String getTextValue() {
		
		return driver.findElement(searchText).getText();
	}
	public void searchTextOnGoogle(String searchtxt) {
		
		this.enterSearchText(searchtxt);
		this.clickSearchButton();
	}
}
