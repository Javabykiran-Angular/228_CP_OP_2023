package com.thekiranacademy.tabledata;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOnTableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
		
		 WebElement email_element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 
//		 	email_element.sendKeys("abc@gmail.com");
		 
		 email_element.sendKeys("kiran@gmail.com");
		 	
//		 	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		 	
		 	WebElement sigin_element= driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		 	
		 	sigin_element.click();
		 	
		 	driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		 	
//		 	List<WebElement> row_list = driver.findElements(By.tagName("tr"));
//		 	System.out.println("Row size "+row_list.size());
		 	
		 	// it has some problem it not fetch element by element data
		 	
//		 	for(int i=2;i<row_list.size();i++) {
//		 		
////		 		List<WebElement> col_list= driver.findElements(By.tagName("td"));
//		 		
//		 		
//		 		
////		 		System.out.println("Col size "+col_list.size());
//		 		
//		 		for(int j=0;j<8;j++) {
//		 			
//WebElement tdData=driver.findElement(
//		By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
//		 			System.out.println(tdData.getText());
////		 			System.out.println(col_list.get(j).getText());
//		 			
//		 		}
//		 		
//		 		
//		 	}
		 	
		 	//Follow this approach
		 	
			List<WebElement> row_list = driver.findElements(By.tagName("tr"));
		 	System.out.println("Row size "+row_list.size());
		 	
		 	for(int i=1;i<row_list.size();i++) {
//			List<WebElement> list_col= 	
//							   driver.findElements(By.tagName("td"));		
			List<WebElement> list_col= row_list.get(i).findElements(By.tagName("td"));
//					System.out.println(list_col.size());
						
					for(int j=0;j<8;j++) {
						System.out.print(list_col.get(j).getText()+"\t");
						
						
						
				}
				System.out.println("====================");
				
				}	 	
		

	}

}
