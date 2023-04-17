package com.tka.testng;

import org.testng.annotations.Test;

public class DemoTest1 {
	
	@Test(priority = 1)
	public void dTest() {
		System.out.println("one Test case Execute....");
	}
	
	@Test(priority = 1)
	public void aTest() {
		System.out.println("aTest()  case Execute....");
	}
	
	@Test(priority = 2)
	public void bTest() {
		System.out.println("bTest()  case Execute....");
	}
	
	

}
