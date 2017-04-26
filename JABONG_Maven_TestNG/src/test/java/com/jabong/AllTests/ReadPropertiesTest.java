package com.jabong.AllTests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.jabong.Common.ReadProperties;

public class ReadPropertiesTest extends ReadProperties{

	String a;
	String b;
	String c;
	
	@Test
	public void reading() throws IOException{
		a = ReadProp("UserID");
		b = ReadProp("Password");
		System.out.println(a+"  "+b);
	}
	}

