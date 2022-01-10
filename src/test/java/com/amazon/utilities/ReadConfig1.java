package com.amazon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig1 {
	
	Properties pro;
	
  public ReadConfig1()
  {
	  File src=new File("./Configuration/config.Properties");
	  try {
	  FileInputStream fis=new FileInputStream(src);
	  pro=new Properties();
	  pro.load(fis);
	  }
	  catch(Exception e)
	  {
		System.out.println("Exception Name :"+e.getMessage());  
	  }
	  
  }
  
  public String getApplicationURL()
  {
	 String url=pro.getProperty("baseURL");
	 return url;
  }
  
  public String getUseName() 
  {
	  String username=pro.getProperty("username");
	  return username;
  }
  
  public String getPassWord() 
  {
	  String password=pro.getProperty("password");
	  return password;
  }
  
  public String getChromePath() 
  {
	  String chromepath=pro.getProperty("chromepath");
	  return chromepath;
  }
  
  
  
  

}
