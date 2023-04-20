package com.tha.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
		
		WebElement ActualResult_emailError=driver.findElement(By.xpath("//div[@id='email_error']"));
			
		String actualResult_email=ActualResult_emailError.getText();
		System.out.println("--- "+actualResult_email);
		
		//String expectedResult="Required Email kiran@gmail.com";
		String expectedResult="please enter email as kiran@gmail.com";	
	
		
		
		//it is by default hard assert 
		//Assert.assertEquals(actualResult_email, expectedResult);
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualResult_email, expectedResult);
		
		WebElement password_element_error=driver.findElement(By.xpath("//div[@id='password_error']"));
		
		String actual_password=password_element_error.getText();
		
		String expected_password="Please enter the password";
		
		softAssert.assertEquals(actual_password, expected_password);
		
		System.out.println("----After Assert.assertEquals Method----");
		
		softAssert.assertAll();
		
	}
	
	@Test(priority = 3)
	public void validUser() {
		
		WebElement username_element=driver.findElement(By.xpath("//input[@id='email']"));
		
		username_element.clear();
		
		username_element.sendKeys("kiran@gmail.com");
		
		WebElement password_element=driver.findElement(By.xpath("//input[@id='password']"));
		
		password_element.clear();
		
		password_element.sendKeys("123456");
		
		driver.findElement(By.xpath("//form[@id='form']//child::button")).click();
		
		String actual_url=driver.getCurrentUrl();
		System.out.println(actual_url);
		
		String expected_url="file:///D:/SeleniumSoftware/Offline%20Website/pages/examples/dashboard.html";
		
		Assert.assertEquals(actual_url, expected_url,"Checking dashboard Url");
		
		
		
	}
	
	
	
	
	
}
