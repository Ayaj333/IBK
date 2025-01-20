package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.hrms.utility.BaseClass;

public class Benefits extends BaseClass{

	 static By btn_benefits = By.linkText("Benefits"); 
	 static By btn_empsumm  = By.xpath("//*[@id=\"benefits\"]/ul/li[1]/ul/li[2]/a/span");
	
	
	
       public static void benefits() throws Exception 
       {
    	   Actions ac = new Actions( driver);
    	   ac.moveToElement(driver.findElement(btn_benefits)).perform();
    	   System.out.println("Mouseover the benefits done");
    	   ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()="
    	   		+ "'Health savings plan']"))).perform();
    	   ac.moveToElement(driver.findElement(btn_empsumm)).perform();
    	   driver.findElement(btn_empsumm).click();
    	   System.out.println("emp button");
           Thread.sleep(5000);
    	   
    	   
    	   
    	   
    	   
       }
	
	
	
	
	
	
	
	
}
