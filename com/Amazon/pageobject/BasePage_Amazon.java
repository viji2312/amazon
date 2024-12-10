package com.Amazon.pageobject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage_Amazon {
	
WebDriver driver;
public  BasePage_Amazon(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void waitForElementVisibility(WebElement e, int TimeInSeconds) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(TimeInSeconds));
	wait.until(ExpectedConditions.visibilityOf(e));
} 
public void clickAction(WebElement e) {
	waitForElementVisibility(e, 5);
	e.click();
}
public void enterText(WebElement e, String txt) {
	waitForElementVisibility(e, 5);
	e.sendKeys(txt);
}
public String getText(WebElement e) {
	waitForElementVisibility(e, 5);
	return e.getText();
}
public void alertAccept() {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
}
public void dismissAlert() {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().dismiss();
}
public void selectByVisibleText(WebElement e, String Txt) {
	
	waitForElementVisibility(e, 5);
	Select select = new Select(e);
	select.selectByVisibleText(Txt);
}
public void selectByIndex(WebElement e, int number) {
	
	waitForElementVisibility(e, 5);
	Select select = new Select(e);
	select.selectByIndex(number);
}
public void captureScreenshot() throws IOException {
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	
}

}










