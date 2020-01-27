package com.GoogleSearch.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyGoogleLinks {
	
	public WebDriver driver;
	String url="https://www.google.com";
	
	@Test
	public void TotalLinks() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//Users//bpat12//Downloads//chromedriver");
		driver=new ChromeDriver();
		driver.get(url);
		System.out.println("Launching browser");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.RETURN);
		driver.findElement(By.id("resultStats"));
		
		List<WebElement> links=driver.findElements(By.xpath("//*[@id='rso']/div[3]/div/div[1]/div/div"));
		
		System.out.println("total links:"+links.size());
		
		//Get third link and navigate to 
		for(int i=0;i<links.size();i++)
        {
            if(!(links.get(i).getText().isEmpty()))
            {
            links.get(i).click();
            driver.navigate().back();
           
            }    
        }
	}
	@Test
	public void tearDown() {
		
		driver.quit();
	}
			
	
}
