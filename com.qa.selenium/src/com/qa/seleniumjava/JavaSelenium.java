package com.qa.seleniumjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\com.qa.selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int totalCount = list.size();
        System.out.println(list.size());
//        int visableCount=0;
//        for(WebElement webElement : list) {
//        	if(webElement.isDisplayed()) {
//        		visableCount++;
//        	}
//        	System.out.println("The visible links count is " +visableCount);
//        	System.out.println("The nonvisable count is " +(totalCount-visableCount));
//        	System.out.println(webElement.getText()); 
//        }
        
         int count = 0;
         for(int i=0;i<totalCount;i++) {
        	 if(list.get(i).isDisplayed()) {
        		 System.out.println(list.get(i).getText());
        		 
        	 }
         }
	}
	

}
