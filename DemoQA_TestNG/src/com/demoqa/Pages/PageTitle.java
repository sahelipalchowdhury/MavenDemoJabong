package com.demoqa.Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PageTitle {
 
	@BeforeTest
	public void beforeTest(){
		CommonTests.openBrowser();
	}
	
	@Test
	@Parameters({"url1"})
	public void verifyWebPage(String url) {
		System.out.println(url);
		CommonTests.getURL(url);
		System.out.println("TITLE OF THE WEBPAGE:" + CommonTests.driver.getTitle());
		
		if(url.contains("date")){
			CommonTests.datePicker();
		}
	
	}

	
	@AfterTest
	public void afterTest() {
		CommonTests.closeBrowser();
	
	}
	  
	@BeforeMethod
	public void beforeMethod() {
	
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
