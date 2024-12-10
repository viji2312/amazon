package com.Amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeAndKitchen2_Amazon extends BasePage_Amazon {
	public HomeAndKitchen2_Amazon(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//img[@alt='kitchen & dining']")
	WebElement kitchen;
	
	
	public void kitchenCategory() {
		clickAction(kitchen);
	}
	
} 
	
		

	
	
	
	
