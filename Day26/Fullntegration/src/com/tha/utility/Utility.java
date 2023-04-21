package com.tha.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	
	WebDriver driver;
	
	public void driverSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	
	}
	
	public WebElement AccessWebElement(String myxpath) {
		return driver.findElement(By.xpath(myxpath));
	}
	
	public WebDriver getDriver(){
		return this.driver;
	}
	

}
