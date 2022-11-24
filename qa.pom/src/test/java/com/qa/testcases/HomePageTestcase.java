package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;
import com.qa.util.PropertyUtil;

public class HomePageTestcase {
	
	BaseClass baseClass = new BaseClass();
	HomePage homePage;
	
	@BeforeTest
	public void setUp()
	{
		baseClass.setupBrowser();  //launching browser
		BaseClass.getDriver().get(PropertyUtil.getProperty("test.website.url"));
		BaseClass.getDriver().manage().window().maximize();
	}
	@Test
	public void homepageTitleTest() throws InterruptedException
	{
		homePage = new HomePage();
		String actualTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(actualTitle, "Welcome: Mercury Tours", "Homepagvalidationfailure");
		Thread.sleep(5000);
	}
	@AfterTest
	public void close()
	{
		baseClass.tearDown();
	}

}
