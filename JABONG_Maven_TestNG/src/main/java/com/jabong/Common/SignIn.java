package com.jabong.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignIn {

	@FindBy(xpath="//*[@id='user-salutation']/a[4]")
	@CacheLookup
	private WebElement signIn;
	
	//*[@id='izSubFrame']/[@id='login-email']
	
	@FindBy(xpath="//*[@id='login-email']")
	@CacheLookup
	private WebElement email;
	
	@FindBy(xpath="//*[@id='login-pwd']")
	@CacheLookup
	private WebElement pass;
	
	@FindBy(xpath="//*[@id='btn-login']")
	@CacheLookup
	private WebElement signButton;
	
	//Constructor
	public SignIn(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void sign(String email1, String pass1){
		signIn.click();
		email.sendKeys(email1);
		pass.sendKeys(pass1);
		signButton.click();
	}
}
