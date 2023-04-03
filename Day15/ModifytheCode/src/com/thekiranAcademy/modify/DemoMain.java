package com.thekiranAcademy.modify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thekiranAcademy.config.Configuration;

public class DemoMain extends Configuration
{
	
	DemoMain(){
		System.out.println("No Argument Constructor");
	}
	
//	WebDriver driver;
	
//	public void driverSetting(String url){
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		
//		 driver=new ChromeDriver();
//	//	driver.get("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
//		driver.get(url);
//		
//	}
	
//	public void Login() {
//		WebElement email_element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//		 
////	 	email_element.sendKeys("abc@gmail.com");
//	 
//	 email_element.sendKeys("kiran@gmail.com");
//	 	
////	 	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
//	 	
//	 	WebElement sigin_element= driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
//	 	
//	 	sigin_element.click();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		DemoMain obj=new DemoMain();
//		obj.driverSetting("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
//		obj.Login();
		
//		Configuration configObj=new Configuration();
//		configObj.driverSetting("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
//		configObj.Login();
		
		DemoMain obj=new DemoMain();
		obj.driverSetting("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
		obj.Login();
		
		

	}

}
