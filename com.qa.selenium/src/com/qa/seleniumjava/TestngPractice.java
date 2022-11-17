package com.qa.seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngPractice {
	WebDriver driver;
	@BeforeSuite
	public void luchBrowser()
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\com.qa.selenium\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://www.mercurytravels.co.in/");
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@class='nav navbar-nav navbar-right margin-right-logo']")).click();
	}
 
}
