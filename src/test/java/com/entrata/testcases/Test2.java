package com.entrata.testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.entrata.testbase.TestBase;

public class Test2 extends TestBase {
	

	public static WebDriverWait wait;

	@BeforeTest
	public void testSetup() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(
//				driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));

	}
	
	@Test
	public void testForinteractingwithInputBox() throws InterruptedException {
		
		//Handled cookies warning
		driver.findElement(By.xpath("//div[@role='dialog']/button")).click();
		
		WebElement headerElement = driver.findElement(By.xpath("//input[@id='FirstName']"));
		
		//Using it to scroll in the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", headerElement);
		String expectedValue = "Mishra";
		WebElement lastNameElement = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		//sending values in last name text box
		lastNameElement.sendKeys(expectedValue);
		String actualValue = (String) js.executeScript("return arguments[0].value;", lastNameElement);
		
		//matching value from last name text box and what we have sended
		assertEquals(actualValue,expectedValue,"input is not matching from what sended");
		
		
		Thread.sleep(5000);
	}
	
	@Test
	public void testForinteractingWithDropDown() throws InterruptedException {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement totalManagedUnitsDropDownElement = driver.findElement(By.xpath("//select[@id='Unit_Count__c']"));
		
		String expectedValue = "1 - 100";
		Select totalManagedUnitsDropDown = new Select(totalManagedUnitsDropDownElement);
		totalManagedUnitsDropDown.selectByContainsVisibleText(expectedValue);
		//sending values in last name text box
		String actualValue = (String) js.executeScript("return arguments[0].value;", totalManagedUnitsDropDownElement);
		
		//matching value from last name text box and what we have sended
		assertEquals(actualValue,expectedValue,"input is not matching from what sended");
		
		
		Thread.sleep(5000);
	}
	
	

}
