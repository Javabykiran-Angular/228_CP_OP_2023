package com.tha.demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	//for use of project level work
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("=================beforeSuite===============");
	}
	
	//it is based on module 
	@BeforeTest
	public void beforeTest() {
		System.out.println("--------------beforeTest--------------");
	}
	
	//
	@BeforeClass
	public void beforeClass() {
		System.out.println("++++++++++++++++ beforeClass+++++++++++++++++ ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("****************** beforeMethod *****************");
	}	
	
	
	@Test(priority = 1)
	public void aTest() {
		System.out.println(" -------aTest Execute-----");
	}
	
	@Test(priority = 2)
	public void bTest() {
		System.out.println(" -------bTest Execute-----");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("***************** afterMethod***************** ");
	}
	
	@AfterClass
	public void afetrClass() {
		System.out.println("++++++++++++++ afetrClass ++++++++++++++++++++");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("----------------- afterTest------------");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("==================== afterSuite===============");
	}
	
	

}
