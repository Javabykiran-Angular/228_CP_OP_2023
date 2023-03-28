package com.thekiranacademy.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
		
//		driver.manage().window().maximize();
		
		 WebElement email_element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 
//		 	email_element.sendKeys("abc@gmail.com");
		 
		 email_element.sendKeys("kiran@gmail.com");
		 	
//		 	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		 	
		 	WebElement sigin_element= driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		 	
		 	sigin_element.click();
		 	//dashboard text 
		 	WebElement dashboard_element= driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
		 	
		 	
		 	System.out.println("=> "+dashboard_element.getText());
		 	//user click
		 	driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		 	//add user 
		 	driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		 	//username
		 	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sumit");
		 	
		 	//Mobile
		 	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9960556397");
		 	//Email
		 	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sumit@gmail.com");
		 	//course 
		 	driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Selenium");
		 	//Gender
		 	driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
			
			WebElement dropdown_element= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
			
			Select selectDropDown=new Select(dropdown_element);
			
//			selectDropDown.selectByIndex(2);
			
//			selectDropDown.selectByValue("HP");
			
			selectDropDown.selectByVisibleText("Punjab");
			
			//Password
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
			
			//Friend mobile
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("7972547618");
			//Submit
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			
			Alert alert=driver.switchTo().alert();
			alert.accept();
			driver.switchTo().defaultContent();
			

	}

}
