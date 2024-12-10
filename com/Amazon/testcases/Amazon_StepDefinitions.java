package com.Amazon.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Amazon.pageobject.HomeAndKitchen2_Amazon;
import com.Amazon.pageobject.HomePage1_Amazon;
import com.Amazon.pageobject.ProductDetailsPage4_Amazon;
import com.Amazon.pageobject.ProductSelection5_amazon;
import com.Amazon.pageobject.ProductsPage3_Amazon;


public class Amazon_StepDefinitions {
	WebDriver driver;
	JavascriptExecutor js;
	@BeforeTest 
	public void Before() {
		driver=new ChromeDriver(); 
		driver.get("https://www.amazon.ca/deals?ref_=nav_cs_gb&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	}
	@Test
	public void ShopClothes() throws IOException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		new HomePage1_Amazon(driver).Home();
		new HomePage1_Amazon(driver).screenshot();
		new HomeAndKitchen2_Amazon(driver).kitchenCategory();
		new ProductsPage3_Amazon(driver).beverages();
		new ProductDetailsPage4_Amazon(driver).machine();
		new ProductSelection5_amazon(driver).golrean();
		new ProductSelection5_amazon(driver).screenshot();
	}
	
	@AfterTest
	public void After() {
		driver.quit();
		
}
}
