package com.jabong.Common;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {

	static Properties prop;
	static File file;
	static FileReader fr;

	@Test
	public static String ReadProp(String data) throws IOException {

		prop = new Properties();
		file = new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\test.properties");
		fr = new FileReader(file);
		
		prop.load(fr);
		return prop.getProperty(data);
}
}
