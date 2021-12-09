package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class AddEmplyPage extends BaseClass{
//object
	//static By Enter_Frame = By.name("rightMenu");
	static By btn_Add = By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]");
	static By txt_FirstName = By.name("txtEmpFirstName");
	static By txt_LastName = By.name("txtEmpLastName");
	static By btn_Choose = By.name("photofile");
	static By btn_Save = By.xpath("//*[@id='btnEdit']");
	
	//functions
	
	public static void AddEmply(String Fn , String Ln) throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_Add).click();
		driver.findElement(txt_FirstName).sendKeys(Fn);
		driver.findElement(txt_LastName).sendKeys(Ln);
		driver.findElement(btn_Choose).sendKeys("D:\\mayur pic.jpeg");
		driver.findElement(btn_Save).click();;
		driver.switchTo().defaultContent();
		Reporter.log("New Employee Added");
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
}
