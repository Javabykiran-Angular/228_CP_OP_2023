package com.thekiranacademy.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
		
		 String strurl= driver.getCurrentUrl();
		 System.out.println("Get current Url :: "+strurl);
		
		String strpageSource= driver.getPageSource();
		System.out.println("Page Source "+strpageSource);
		
		System.out.println("Web page Title "+driver.getTitle());

	}

}
