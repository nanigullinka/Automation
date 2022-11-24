package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class HomePage {
	
	public HomePage()
	{
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(linkText = "SIGN-ON")
	WebElement login;

	@FindBy(linkText = "REGISTER")
	WebElement register;
	
	@FindBy(linkText = "CONTACT")
	WebElement contacts;
	
	@FindBy(linkText = "Fligths")
	WebElement flights;
	
	@FindBy(linkText = "Hotels")
	WebElement hotels;
	
	@FindBy(linkText = "Car Rentals")
	WebElement carRentals;
	
	@FindBy(linkText = "vacations")
	WebElement vacations;
	
	@FindBy(linkText = "Destinations")
	WebElement destinations;
	
	public String verifyHomePageTitle()
	{
		return BaseClass.getDriver().getTitle();
	}
	public String verifyHomePageUrl()
	{
		return BaseClass.getDriver().getCurrentUrl();
	}
	public void loginOperation()
	{
		login.click();
	}
	public void registerOperation()
	{
		register.click();
	}
	public void contactOperation()
	{
		contacts.click();
	}
	public void flightsOperation()
	{
		flights.click();
	}
	public void hotelsOperation()
	{
		hotels.click();
	}
	public void carRentalOperation()
	{
		carRentals.click();
	}
	public void vacationsOperation()
	{
		vacations.click();
	}
	public void destinationsOperations()
	{
		destinations.click();
	}
}
