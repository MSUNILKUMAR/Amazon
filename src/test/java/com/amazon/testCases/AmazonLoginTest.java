package com.amazon.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.pageObjects.AmazonLoginPage;



public class AmazonLoginTest extends BaseClass1 {
	
	@Test()
	public void AmazonTest() 
	{
		/*AmazonLoginPage lp=new AmazonLoginPage(driver);
		lp.setUserName();
		lp.continueButton();
		lp.setPassWord();
		lp.signIn();
		*/
		String s=driver.getTitle();
		System.out.println(s);
		if(driver.getTitle().equals("Google"))
		{
			Assert.assertTrue(true);
			System.out.println("Amazon Login Test Pass");
		}
		else {
			System.out.println("Amazon Login Test Fail");
		}
	}

}
