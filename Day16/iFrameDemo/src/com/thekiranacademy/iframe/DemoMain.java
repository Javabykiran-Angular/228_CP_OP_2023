package com.thekiranacademy.iframe;

import com.thekiranacademy.config.DriverSetting;

public class DemoMain extends DriverSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoMain obj=new DemoMain();		
		obj.driverSetting("https://www.qa.jbktest.com/");
		
		try {
			Thread.sleep(5000);
			obj.iframeAccess();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
