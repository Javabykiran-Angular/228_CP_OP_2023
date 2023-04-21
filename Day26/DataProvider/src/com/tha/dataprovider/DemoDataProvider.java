package com.tha.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	@Test(priority = 1,dataProvider = "testdata")
	public void loginTest(int id,String username,String pwd) {
		System.out.println("Id :: "+id+"\t Username :: "+username+"\t Password:: "+pwd);
	}
	
	@DataProvider(name = "testdata")
	public Object[][] testData(){
		return new Object[][] {
			{9,"Sumit","123"},
			{3,"Spruha","456"},
			{6,"Kiran","789"},
		};
		
	}

}
