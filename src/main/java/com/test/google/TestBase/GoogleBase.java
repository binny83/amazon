package com.test.google.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBase {

	public WebDriver driver;
	String url="https://www.google.com/";
	
	public void setup(){
		
		//for windows
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		
		//for MacOS
		System.setProperty("webdriver.chrome.driver","//Users//bpat12//Downloads//chromedriver");
		driver = new ChromeDriver();
		System.out.println("launch browser");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	public void tearDown() {
		
		driver.quit();
	}
	
}
