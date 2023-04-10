package com.thekiranacademy.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetting {
	WebDriver driver;
	
	public void driverSetting(String Url) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(Url);
		
	}
	
	public void explicitWait() {
		
		driver.switchTo().frame("webform");
		
		WebDriverWait elementwait=new WebDriverWait(driver, 15);
		
		WebElement waitelement=elementwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/form/div/div[4]/div/div[2]/div[1]/div/input")));
		
		waitelement.sendKeys("sumit");
		
//		driver.findElement(By.xpath("/html/body/div/div/form/div/div[4]/div/div[2]/div[1]/div/input")).sendKeys("Sumit@jbk.com");
		
	}
	
	
	
	

}
