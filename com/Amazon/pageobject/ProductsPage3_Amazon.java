package com.Amazon.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage3_Amazon extends BasePage_Amazon {
public ProductsPage3_Amazon(WebDriver driver) {
	super(driver);	
}
    @FindBy(xpath="//span[contains(text(),'Coffee, Tea & Espresso')]  ")
    WebElement coffee;
    
    public void beverages() {
    	clickAction(coffee);
    }
    
}
