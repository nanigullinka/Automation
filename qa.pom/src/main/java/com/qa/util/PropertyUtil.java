package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
      
	public static String getProperty(String propertyName)
	{
		Properties properties = new Properties();
		String path = System.getProperty("user.dir") + "/src/test/resources/configuration/config.properties";
		
		try
		{
			FileInputStream inputStream = new FileInputStream(path);
			properties.load(inputStream);
			
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File Not Found" +e);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return properties.getProperty(propertyName);
	}
}
