package com.demoqa.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonTests {

	static WebDriver driver;
	static String mon = "3"; // 0 as JAN, 11 as DEC
	static String yyyy = "2017"; // 2017 as 2017
	static String dd = "12";
	// static String browser;

	public static void openBrowser() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();


	}

	public static void getURL(String url) {
		if (driver != null) {
		driver.get("https://google.com/");
		driver.get(url);
		}

	}

	public static void datePicker() {
		driver.findElement(By.id("ui-id-3")).click();
		driver.findElement(By.id("datepicker3")).click();

		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select monthselect = new Select(month);
		monthselect.selectByValue(mon);

		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yearselect = new Select(year);
		yearselect.selectByValue(yyyy);

		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//a[text()=" + dd + "]")).click();
		// Select dayselect = new Select(day);
		// dayselect.selectByValue(dd);
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void closeWindow() {
		driver.quit();
	}

}
