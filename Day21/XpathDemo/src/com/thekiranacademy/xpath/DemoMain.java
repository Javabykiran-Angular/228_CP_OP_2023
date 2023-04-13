package com.thekiranacademy.xpath;

import com.thekiranacademy.config.DriverSetting;

public class DemoMain extends DriverSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoMain obj=new DemoMain();
		//obj.driverSetting("https://www.w3schools.com/");
		obj.driverSetting("http://register.rediff.com/register/register.php?FormName=user_details");
		
		obj.accessElement();

	}

}
