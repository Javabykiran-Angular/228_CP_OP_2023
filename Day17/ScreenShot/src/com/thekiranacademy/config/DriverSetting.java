package com.thekiranacademy.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DriverSetting {
	WebDriver driver;
	
	public void driverSetting(String Url) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Url);
		
	}
	
	public void takeScreenShot() {
		
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File target=new File("D:\\Selenium_228_Workspace\\ScreenShot\\login.png");
		
		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

}
