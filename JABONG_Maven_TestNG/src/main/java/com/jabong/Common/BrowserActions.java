package com.jabong.Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class BrowserActions {

	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.jabong.com/");
	}
	
	public void closeBrowser(){
		driver.close();
	}
	
	public void quitBrowser(){
		driver.quit();
	}

}
