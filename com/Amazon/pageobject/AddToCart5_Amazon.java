package com.Amazon.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart5_Amazon extends BasePage_Amazon {

	public AddToCart5_Amazon(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//span[@class='a-dropdown-label' and normalize-space()='Quantity:']")
	WebElement quantity;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart;
	
	public void totalQuantity() {
		clickAction(quantity);
	}
	/*public void select() {
		selectByIndex(quantity, 2);
	}*/
	public void addTo() {
		clickAction(addtocart);
	}
	
}

//input[@id='add-to-cart-button'] 