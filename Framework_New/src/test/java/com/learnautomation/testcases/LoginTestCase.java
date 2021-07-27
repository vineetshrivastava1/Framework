package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestCase extends BaseClass{
    
	
	@Test(priority=1)
	public void loginApp() {

		logger=report.createTest("Login to Nopcommerce");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Start Application");
		loginpage.logininApp(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
		
		Helper.captureScreenshot(driver);
	
	}
	
	/*@Test(priority=2)
	public void loginApp1() {

		logger=report.createTest("Logout");
	
		logger.fail("Logout failed");
		
		Helper.captureScreenshot(driver);
	
	}*/
}
