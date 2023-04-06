package com.thekiranacademy.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
	
	
	public void accessFile() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\Selenium_228_Workspace\\ConfigFiles\\myfile.properties");
		
			Properties props=new Properties();
				props.load(fis);
				
				System.out.println("UserName Data => "+props.getProperty("username"));
				System.out.println("Password Data => "+props.getProperty("password"));
				
				driverSetting(props.getProperty("url"));
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
