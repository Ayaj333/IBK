package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmplyPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001 {
	
	
	@Test
	public static void tc001() throws Exception {
		
		BaseClass.openApplication();
		VerifyPage.verify("Orange");
		LoginPage.Login("nareshit", "nareshit");
		VerifyPage.verify("HRMS");
		AddEmplyPage.AddEmply("Suresh", "Sir");
		LogoutPage.logout();
		BaseClass.CloseApplication();
		
	}

}
