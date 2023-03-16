package com.thekiranacademy.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
//		driver.get("https://www.google.com/");
		driver.get("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
		
		
		

	}

}
