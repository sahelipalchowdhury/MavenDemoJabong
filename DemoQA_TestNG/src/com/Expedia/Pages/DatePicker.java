package com.Expedia.Pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {

	WebDriver driver;
	String bookingDate = "07/15/2017";
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
	}

	@Test
	public void clickJuly() throws NoSuchElementException {
		// Click on Flights
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		// Click on One Way
		driver.findElement(By.xpath("//*[@id='flight-type-one-way-label-hp-flight']")).click();
		// Click on Date Box (Departing)
		driver.findElement(By.xpath("//*[@id='flight-departing-single-hp-flight']")).click();

		// caption[contains(text(),'Apr 2017')]

		Date dateInput = new Date(bookingDate);
		SimpleDateFormat sdf = new SimpleDateFormat("MMM/DD/YYYY");
		String formattedDate = sdf.format(dateInput);
		System.out.println(formattedDate);
		String [] dateSplit = formattedDate.split("/");
		String desiredDate = dateSplit[0]+" "+dateSplit[2];
		
		System.out.println(desiredDate);
		
		driver.findElement(By.xpath("//caption[contains(text(),'Apr 2017')]")).isDisplayed();
		//button[@class='datepicker-cal-date' and @data-year='2017' and @data-month='6' and @data-day='13']
		//button[@class='datepicker-cal-date start' and @data-year='2017' and @data-month='5']
		
		
		
		
		
//		for(int i=0;i<dateSplit.length;i++){
//			System.out.println(dateSplit[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// *[@id="flight-returning-wrapper-hp-flight"]/div/div/div[2]/table/caption
		// *[@id="flight-returning-wrapper-hp-flight"]/div/div/div[3]/table/caption

		/*
		 * //WebElement july = driver.findElement(By.
		 * xpath("//caption[@class='datepicker-cal-month-header' and text()='Jul 2017']"
		 * )); //WebElement june = driver.findElement(By.
		 * xpath("//caption[@class='datepicker-cal-month-header' and text()='Jun 2017']"
		 * )); WebElement may = driver.findElement(By.
		 * xpath("//caption[@class='datepicker-cal-month-header' and text()='May 2017']"
		 * )); WebElement apr = driver.findElement(By.
		 * xpath("//caption[@class='datepicker-cal-month-header' and text()='Apr 2017']"
		 * ));
		 * 
		 * 
		 * WebElement firstMonth = driver.findElement(By.xpath(
		 * "//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/caption"
		 * ));
		 * 
		 * //System.out.println("JULY"+july); //System.out.println("JUNE"+june);
		 * System.out.println("MAY"+may); System.out.println("APR"+apr);
		 * System.out.println("flight departing"+flightDeparting);
		 * System.out.println("FIRST MONTH"+firstMonth);
		 */

	}

}
