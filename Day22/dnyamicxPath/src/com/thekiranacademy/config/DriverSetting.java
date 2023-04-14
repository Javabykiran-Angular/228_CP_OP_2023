package com.thekiranacademy.config;

import java.io.File;
import java.io.FileInputStream;
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
	
	public void accessElement() {
		
//			driver.findElement(By.xpath("/html/body/div[3]/a[4]")).click();
//		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Sumit Raokhande");
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("sumit@gmail.com");
		
		driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]")).sendKeys("sumit@123");

		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwd')]")).sendKeys("sumit@123");
		
		driver.findElement(By.xpath(" //a[starts-with(text(),'Home')]")).click();
		
		
		
	}
	
	public void attAccessElement() {
//		driver.findElement(By.xpath("(//div[@id='HEADBAND0']//following::li)[2]//a")).click();
		
		driver.findElement(By.xpath("(//div[@id='HEADBAND0']//child::li)[3]//a")).click();
		
		
	}
	
	
	
	
	
	
	

}
