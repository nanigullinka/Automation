package com.qa.seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class TesingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\com.qa.selenium\\drivers\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement> drop = driver.findElements(By.tagName("select"));
		System.out.println("Toal dropdown list is: " +drop.size());
//		WebElement dropdown = driver.findElement(By.id("themes"));
//		dropdown.findElement(By.tagName("option"));
//		Select sc = new Select(dropdown);
//		sc.selectByIndex(10);
//		sc.selectByValue(null);
//		sc.selectByVisibleText(null);
		
		driver.findElement(By.id("themes")).sendKeys("Shopping");
		
		
		
	}
	
	

}
