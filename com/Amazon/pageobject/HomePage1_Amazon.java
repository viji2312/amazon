package com.Amazon.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1_Amazon extends BasePage_Amazon {

	public HomePage1_Amazon(WebDriver driver) {
		super(driver);// invoke parent class variable
	}
	
@FindBy(xpath="//a[normalize-space()='Home']")
WebElement home;


public void Home() {
	clickAction(home);
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
