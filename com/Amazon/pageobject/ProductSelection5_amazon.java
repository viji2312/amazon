package com.Amazon.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSelection5_amazon extends BasePage_Amazon {

	public ProductSelection5_amazon(WebDriver driver) {
		super(driver);
		
	}
@FindBy(xpath="//span[normalize-space()='GOLREAN Commercial Coffee Maker 100 Cup Coffee Urn Hot Beverage Dispenser 4 Gallon 16L Large Coffee Maker Dual Layers 304 Stainless Steel 1300W Fast Brew Percolator For Business, Catering, Church']")
WebElement coffeemaker;

public void golrean() {
	clickAction(coffeemaker);
}
public void screenshot() {
	try {
		captureScreenshot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}

//span[normalize-space()='GOLREAN Commercial Coffee Maker 100 Cup Coffee Urn Hot Beverage Dispenser 4 Gallon 16L Large Coffee Maker Dual Layers 304 Stainless Steel 1300W Fast Brew Percolator For Business, Catering, Church']