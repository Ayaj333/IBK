package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HrmsLogin
{
 
	public WebDriver driver;
	
	// Constructor
	
	public HrmsLogin(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
		
	public static By  txt_UserName =By.xpath("//input[@name='txtUserName']");
	public static By txt_Password = By.xpath("//input[@name='txtPassword']");
	public static By btn_Login = By.xpath("//input[@name='Submit']");
	
	
	//functions
	
	public  void setuserName(String name) 
	{
	  driver.findElement(txt_UserName).sendKeys(name);
	 	
	}
	
	
	public void setPassword(String pass)
	{
		
	   driver.findElement(txt_Password).sendKeys(pass);	
	}
	
	
	public void Login() {
		
		driver.findElement(btn_Login).click();
	}
	
	
	
	
	
	
	
	
	
	
}
