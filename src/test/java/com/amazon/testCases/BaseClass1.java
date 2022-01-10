package com.amazon.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.amazon.utilities.ReadConfig1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
		ReadConfig1 rc=new ReadConfig1();
		
	  public String baseURL=rc.getApplicationURL();
	  public String username=rc. getUseName();
	  public String password=rc. getPassWord();
	  public String chromepath=rc.getChromePath();
	  
	  public static WebDriver driver;
	  //public static Logger Logger;
	  
	  @BeforeMethod()
	  public void setUp() 
	  {
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		  driver=new ChromeDriver();
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4);
		  driver.get("https://www.google.com/");
		 
	  }
	 @AfterMethod()
	 public void tearDown()
	 {
	    driver.quit();	 
	 }
	    
	    
	
}
