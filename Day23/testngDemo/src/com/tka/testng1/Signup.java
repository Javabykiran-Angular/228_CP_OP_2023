package com.tka.testng1;

import org.testng.annotations.Test;

public class Signup {
	
	
	@Test(priority = 1)
	public void usernameBlank() {
		System.out.println("u r in usernameBlank");
	}
	
	@Test(priority = 2)
	public void usernameNotBlank() {
		System.out.println("u r in usernameNotBlank");
	}
	

}
