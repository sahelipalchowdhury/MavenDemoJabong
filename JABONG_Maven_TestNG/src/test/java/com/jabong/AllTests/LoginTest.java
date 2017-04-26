package com.jabong.AllTests;

import java.io.IOException;

import org.testng.annotations.Test;
import com.jabong.Common.*;

public class LoginTest extends BrowserActions{
	
	@Test
	public void login() throws NullPointerException, IOException{
		SignIn si = new SignIn(driver);
		String email = ReadProperties.ReadProp("UserID");
		String pwd = ReadProperties.ReadProp("Password");
		
		si.sign(email, pwd);
	}



}

//String [][] excelData = ReadExcel.getData(".//DataDriven.xlsx", "Jabong");
//
//for(int i=1;i<excelData.length;i++){
//	si.sign(excelData[i][0], excelData[i][1]);
//}
//si.sign("seleniumtwenty17@gmail.com","selenium2017"); //HardCode to be removed with DDF or Properties

//driver.findElement(By.xpath("//*[@id='user-salutation']/a[4]")).click();
//driver.findElement(By.xpath("//*[@id='login-email']")).sendKeys("");
//driver.findElement(By.xpath("//*[@id='login-pwd']")).sendKeys("");
//driver.findElement(By.xpath("//*[@id='btn-login']")).click();