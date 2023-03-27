package com.thekiranacademy.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
		
		driver.manage().window().maximize();
		
		 WebElement email_element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 
//		 	email_element.sendKeys("abc@gmail.com");
		 
		 email_element.sendKeys("kiran@gmail.com");
		 	
//		 	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		 	
		 	WebElement sigin_element= driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		 	
		 	sigin_element.click();
		
		

	}

}
