package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// this is new cahnge
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		 this.driver = ldriver;
	}
	
	@FindBy (xpath ="//a[normalize-space()='Log in']") WebElement loginlink;
	@FindBy (name= "Email") WebElement email;
	@FindBy (name= "Password") WebElement Pass;
	@FindBy (xpath ="//button[normalize-space()='Log in']") WebElement loginbutton;
	
	public void logininApp(String EmailApplication, String PasswordApplication) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		loginlink.click();
		email.sendKeys(EmailApplication);
		Pass.sendKeys(PasswordApplication);
		loginbutton.click();
	}
}
