package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass{
//verify 
	public static void verify(String title) {
		
		if(driver.getTitle().equals(title)) {
			
			Reporter.log("Title Matched");
		}
		else {
			
			Reporter.log("Title NOt Matched");
			Reporter.log(driver.getTitle());
			
		}
	}
	
}
