package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmplyPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001 {
	
	
	@Test
	public void tc001() throws Exception {
		
		BaseClass.openApplication("chrome");
		VerifyPage.verify("Orange");
		LoginPage.Login("admin", "admin");
		VerifyPage.verify("HRMS");
		AddEmplyPage.AddEmply("Suresh", "Sir");
		LogoutPage.logout();
		BaseClass.CloseApplication();
		
	}

}
