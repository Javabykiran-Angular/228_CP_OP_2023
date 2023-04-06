package com.thekiranacademy.screenshot;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.thekiranacademy.config.DriverSetting;

public class DemoMain extends DriverSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoMain obj=new DemoMain();
		obj.driverSetting("https://www.facebook.com/");
		obj.takeScreenShot();
		
		
		

	}

}
