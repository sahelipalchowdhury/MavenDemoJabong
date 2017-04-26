package com.jabong.Women;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JabongWomenHome {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='mainTopNav']/li[@class='nav-women']") //*[@id='mainTopNav']/li[1]/a
	private WebElement womenLink;
	
	@FindBy(linkText="ETHNIC WEAR")//*[@id='mainTopNav']//a[text()='ETHNIC WEAR']
	private WebElement womenEthnic;
	
	public JabongWomenHome(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickWomen(){ // Mouse Hover Women
		womenLink.click();
	}
	
	public void clickEthnic(){
		Actions action = new Actions(driver);
		action.moveToElement(womenLink).build().perform();
		womenEthnic.click();
		
	}
	

}
