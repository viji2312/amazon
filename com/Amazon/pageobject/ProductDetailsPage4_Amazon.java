package com.Amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage4_Amazon extends BasePage_Amazon  {
	public ProductDetailsPage4_Amazon(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//h3[contains(text(),'Coffee Makers')] ")
	WebElement coffeemachine;
	public void machine() {
		clickAction(coffeemachine);
	}

}

   
//a[@title='Coffee Makers']//div[@class='a-section octopus-pc-category-card-v2-shield']


