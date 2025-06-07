package com.entrata.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.entrata.testbase.TestBase;

public class Test1 extends TestBase {

	public static WebDriverWait wait;

	@BeforeTest
	public void testSetup() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	// Test for the correctness of the page using its title verification
	@Test
	public void test1() {
		// driver.get(url);
		String expectedTitle = "Property Management Software | Entrata®";

		// Used ExplictWait to wait until the page is fully loaded;
		wait.until(
				driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
		String actualTitle = driver.getTitle();
		System.out.println("Rohit");
		assertEquals(actualTitle, expectedTitle, "Home page title is not matching");
	}
	
	// navigate to sign in page from home page and verify the page conatins Sign In in its title
	@Test
	public void testPageNavigation() {
		driver.findElement(By.linkText("Sign in")).click();
		wait.until(
				driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
		String actualTitle = driver.getTitle();
		System.out.println("Rohit");
		assertTrue(actualTitle.contains("Sign In"), "Home page title is not matching");

	}
	
}
