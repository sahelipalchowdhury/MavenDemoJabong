package com.jabong.AllTests;

import org.testng.annotations.Test;

import com.jabong.Common.*;
import com.jabong.Women.*;

public class WomenTest extends BrowserActions{
	
	@Test
	public void navigateEthnic(){
		SignIn si = new SignIn(driver);
		JabongWomenHome jwh = new JabongWomenHome(driver); 
		si.sign("seleniumtwenty17@gmail.com","selenium2017"); //HardCode to be removed with DDF or Properties
		jwh.clickEthnic();
		
	}

}
