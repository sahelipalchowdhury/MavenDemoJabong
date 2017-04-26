package com.jabong.AllTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadTest {

	WebDriver driver;

	@Test
	public void uploadTest() throws IOException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Saheli\\Pictures\\2016-08\\1471229722703.jpg");;
//		Runtime.getRuntime()
//				.exec("C:\\Users\\Saheli\\Documents\\myJava\\workspace\\JABONG_Maven_TestNG\\FileUpload.exe");
		driver.findElement(By.id("file-submit")).click();
	}

}
