package com.hrms.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.pages.HrmsLogin;
import com.hrms.pages.LoginPage;
import com.hrms.pages.PageFact;

public class TC003_Hrms 
{
    WebDriver driver;
	@BeforeClass
	
	void setup() 
	{
		driver = new ChromeDriver();
  	   	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
	}
	
	@Test
	
	public void TC003()
	{
	   // HrmsLogin Hlgn = new HrmsLogin(driver);
	    PageFact Hlgn = new PageFact(driver);		
	    Hlgn.setuserName();
	    //Hlgn.setPassword("admin");
	    //Hlgn.Login();
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
