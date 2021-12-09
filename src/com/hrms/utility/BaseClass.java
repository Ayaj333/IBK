package com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
// driver
	public static WebDriver driver; 
	
	// Open Application
		public static void openApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/index.php");
		Reporter.log("Application Opened");
				
	}
	
 
	// close Application
		public static void CloseApplication() {
			driver.close();
			Reporter.log("Application Closed");
			
			
		}
		
		
}
