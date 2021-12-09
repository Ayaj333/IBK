package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;



public class LogoutPage extends BaseClass{
// objects
		static By btn_logout = By.linkText("Logout");
	
		//functions
 public static void logout() {
	 driver.findElement(btn_logout).click();
	Reporter.log("Logout Completed");
	 
 }

}
