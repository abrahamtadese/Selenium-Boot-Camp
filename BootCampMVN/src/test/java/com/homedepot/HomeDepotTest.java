package com.homedepot;

import org.testng.annotations.Test;

import Utility.StartBrowser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class HomeDepotTest {
	
	WebDriver driver;
	

	
 @Parameters({ "browser", "url", "mail", "pass" ,"zip", "phone"})
  @Test
  public void homedepot(String browser, String url, String mail, String pass, String zip, String phone) throws InterruptedException {
	  
	 driver = StartBrowser.launchBrowser(browser, url);
	  HomeDepotRegister obj = PageFactory.initElements(driver, HomeDepotRegister.class);
	  obj.registering(mail, pass, zip, phone);
	  Thread.sleep(2000);
	  driver.quit();
  }



}
