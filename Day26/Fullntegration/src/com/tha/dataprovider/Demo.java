package com.tha.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tha.utility.Utility;

public class Demo extends Utility {
	
	@BeforeClass
	public void ConfigSetting() {
		driverSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
				
	}
	
   @Test(priority = 1,dataProvider = "logintestdata")
   public void login(String username,String pwd) {
//	   System.out.println("username "+username+" password "+pwd);
	   WebElement email_Element=AccessWebElement("//input[@id='email']");
	   email_Element.sendKeys(username);
	   
	   WebElement pwd_element=AccessWebElement("//input[@id='password']");
		
		pwd_element.sendKeys(pwd);
		
		WebElement login_element=AccessWebElement("//button[starts-with(text(),\"Sign In\")]");
		
		login_element.click();
		
		
		try {
			WebDriver driver=getDriver();
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File target=new File("D:\\SeleniumSoftware1\\ScreenShot\\login_"+username+".png");
//			File target=new File("C:\\Selenium_Workspace\\screenshot\\login\\login.svg");
			
			Thread.sleep(2000);

			FileHandler.copy(source, target);
			

			WebElement emailError_element=AccessWebElement("//div[@id='email_error']");
					
			
			String actualResult_emailError= emailError_element.getText();
			System.out.println(actualResult_emailError);
			String expectedResult_emailError="Please enter email as kiran@gmail.com";
			
			WebElement passwordError_Element=AccessWebElement("//div[@id='password_error']");
					
			String actualResult_password= passwordError_Element.getText();
			String expectedResult_password="Please enter password 123456";
			
			SoftAssert softassert=new SoftAssert();
			
			softassert.assertEquals(actualResult_emailError, expectedResult_emailError);
			
//			System.out.println("---------After Assert Execution---------");
			
			
			softassert.assertEquals(actualResult_password, expectedResult_password);
			
			softassert.assertAll();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   
   }
   
  
   @DataProvider(name = "logintestdata")
	public Object[][] LoginDataProvider(){
		
		Object[][] testObjArray=ReadExcelSheet("D:\\SeleniumSoftware1\\excelFiles\\logindata.xlsx");
		return testObjArray;
		
	}
   
   public Object [][] ReadExcelSheet(String path) {
		String[][] tabArray = null;
		int ci,cj;
		
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet objSheet=workbook.getSheetAt(0);
			
			int rowcount=objSheet.getLastRowNum();
			System.out.println(rowcount);
			
			   tabArray=new String[rowcount][2];
			ci=0;
			for(int i=1;i<=rowcount;i++,ci++) {
				cj=0;
				XSSFRow row=objSheet.getRow(i);
				
				for(int j=0;j<2;j++,cj++) {
					System.out.println("---> "+row.getCell(j));
					tabArray[ci][cj]=row.getCell(j).getStringCellValue();
					System.out.println("Table data --->"+tabArray[ci][cj]);
				}
				System.out.println("=============");
			}
			workbook.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tabArray;
		
	}
   

}
