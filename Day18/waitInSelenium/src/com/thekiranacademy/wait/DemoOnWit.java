package com.thekiranacademy.wait;

import com.thekiranacademy.config.DriverSetting;

public class DemoOnWit extends DriverSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoOnWit obj=new DemoOnWit();
	//	obj.driverSetting("file:///D:/SeleniumSoftware1/Offline%20Website/index.html");
		
		obj.driverSetting("https://www.qa.jbktest.com/");
		obj.explicitWait();
		

	}

}
