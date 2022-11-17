package com.qa.seleniumjava;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotsIn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\com.qa.selenium\\drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com/");
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File sc = new File("C:\\Users\\hp\\Desktop\\screenshots\\img.png");
	  Files.copy(src, sc);
	 
	}

}
