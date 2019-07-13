package com.expedia;

import org.testng.annotations.Test;

import Utility.StartBrowser;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class ExpidiaTest {
	
	WebDriver driver;
	

	
  @Test
  public void expedia() throws InterruptedException {
	  driver = StartBrowser.launchBrowser("chrome", "https://www.expedia.com/");
	  ExpediaFlight obj = PageFactory.initElements(driver, ExpediaFlight.class);
	  obj.traveling("  Washi", "  Bahamas");
	  obj.personalinformation("James", "W", "Eric", "2025689562", "male", 7, "12", "2007");
	  obj.cardinformation("James Eric", "4523698512565698", 9, "2021", "256");
	  obj.billingAddressInfo("234 kaldis St", "rockville", "MD", "20853", "jameseric@gmail.com", "james123", "james123");
	 
  }
 

 

}
