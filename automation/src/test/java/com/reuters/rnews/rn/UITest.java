package com.reuters.rnews.rn;

import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.sql.Driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;


public class UITest  {
   
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Server.main(null);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testBottomMenuDisplays() {
		
		 assertTrue("Feed element not visible", Utility.bottomMenuElementExist("Feed") == true);
		 assertTrue("Market Data element not visible", Utility.bottomMenuElementExist("Market Data") == true);
		 assertTrue("Reuters Now element not visible", Utility.bottomMenuElementExist("Reuters Now") == true);
		 assertTrue("Sections element not visible", Utility.bottomMenuElementExist("Sections") == true);	  
	//Server.driver.findElementByName("Market Data").click();
	}
	
	
	@Test
	public void testTapOnReutersNowTab() {
		
		WebDriverWait wait = new WebDriverWait(Server.driver, 10);
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("Reuters Now")));
		element.click();
	    assertTrue("Reuters Now button not found or not clickable", element != null);

	}

	@Test
	public void testTapOnMarketDataTab() {
		
		WebDriverWait wait = new WebDriverWait(Server.driver, 10);
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("Market Data")));
		element.click();
	    assertTrue("Market Data button not found or not clickable", element != null);

	}
	
	@Test
	public void testTapOnSectionsTab() {
		
		WebDriverWait wait = new WebDriverWait(Server.driver, 10);
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("Sections")));
		element.click();
	    assertTrue("Market Data button not found or not clickable", element != null);

	}
	
	@Test
	public void testTapOnFeedsTab() {
		
		WebDriverWait wait = new WebDriverWait(Server.driver, 10);
		MobileElement element = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("Feed")));
		element.click();
	    assertTrue("Market Data button not found or not clickable", element != null);

	}
	
	

}
