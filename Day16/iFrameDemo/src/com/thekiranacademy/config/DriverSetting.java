package com.thekiranacademy.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetting {
	WebDriver driver;
	
	public void driverSetting(String Url) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Url);
		
	}
	
	public void iframeAccess() {
//		driver.switchTo().frame(1);
		
//		driver.switchTo().frame("webform");
		WebElement iframeElement= driver.findElement(By.xpath("/html/body/div[3]/iframe"));
		driver.switchTo().frame(iframeElement);			
		
		driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
		driver.switchTo().defaultContent();
	}

}
