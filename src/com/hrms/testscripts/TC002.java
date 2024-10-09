package com.hrms.testscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hrms.utility.BaseClass;

public class TC002 extends BaseClass
{
 @Test
 @Parameters({"browser"})
 void tc002(String browser) throws Exception    //This is your test method where you are defining a String browser parameter.
                                  //The browser parameter is the one that TestNG will populate with the value specified in the testng.xml file.
                                  //if the parameter in testng.xml is set as "chrome", the browser parameter in this method will receive "chrome" as its value when the test runs.
 {
	 BaseClass.openApplication( browser);
	 BaseClass.CloseApplication();
   	 
 }






}
