package com.Amazon.testcases;

//import java.io.IOException;
import java.time.Duration;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//import Utilities.ReadData;

public class BaseTest_Amazon {
	WebDriver driver;
	@BeforeClass
	public void before() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	@AfterClass
	public void after() {
		driver.quit();
		
	}
}
