package com.entrata.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static String url;
	
	
	@BeforeSuite
	public void browserSetup() {
		url = "https://www.entrata.com/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
		driver = null;
	}

}
