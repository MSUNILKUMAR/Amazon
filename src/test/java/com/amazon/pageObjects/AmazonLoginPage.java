package com.amazon.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	
	WebDriver Idriver;
	public AmazonLoginPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="ap_email")
	WebElement uname;
	
	@FindBy(id="ap_password")
	WebElement pwd;
	
	@FindBy(id="continue")
	WebElement ContinueButton;
	
	@FindBy(id="signInSubmit")
	WebElement signIn;
	
	
	public void setUserName() 
	{
		uname.sendKeys();
	}
	
	public void setPassWord() 
	{
		pwd.sendKeys();
	}
	
	public void continueButton() 
	{
		ContinueButton.click();
	}
	
	public void signIn()
	{
		signIn.click();
	}	
	

}
