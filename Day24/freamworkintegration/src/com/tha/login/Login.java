package com.tha.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;

	@BeforeClass
	public void driverSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
	}
	
	@Test(priority = 1)
	public void username() {
		
		WebElement username_element= driver.findElement(By.xpath("//input[@id='email']"));
		username_element.sendKeys("abc@gmail.com");
		
	}
	
	@Test(priority = 2)
	public void password() {
		WebElement password_element= driver.findElement(By.xpath("//input[@id='password']"));
		password_element.sendKeys("123");
		
		driver.findElement(By.xpath("//form[@id='form']//child::button")).click();
		
	}
	
	
	
	
	
}
