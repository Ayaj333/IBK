 package com.hrms.utility;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

public class BaseClass {
// driver
	public static WebDriver driver; 
	
	// Open Application
	    @Parameters({"browser"}) // for Cross browser Testing
		public static void openApplication(String br) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		 switch(br) {
		 case "chrome": driver= new ChromeDriver(); break;
		 case "Firefox": driver = new FirefoxDriver(); break;
		 case "Invalid" : System.out.println("Invalid Entry"); return;
		 }
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(5000);
		System.out.println("Applicatin Opened");
		Reporter.log("Application Opened");
				
	}
	
 
	// close Application
		public static void CloseApplication() {
			driver.close();
			System.out.println("Application Closed");
			Reporter.log("Application Closed");
			
			
		}
		
		
}
