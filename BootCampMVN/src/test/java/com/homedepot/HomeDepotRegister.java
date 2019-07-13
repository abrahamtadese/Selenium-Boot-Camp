package com.homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeDepotRegister {
	
	WebDriver driver;
	
	public HomeDepotRegister(WebDriver driver) {
		
		this.driver=driver;
	
	}
	
	
	@FindBy(how=How.XPATH, using="//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][contains(text(),'My Account')]")
	WebElement myaccount;
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Register')]") 
	WebElement register;
	@FindBy(how=How.XPATH, using="//div[@class='createAccountModalForm']//input[@id='email_id']")
	WebElement email;
	@FindBy(how=How.XPATH, using="//input[@id='registrationPassword']")
	WebElement password;
	@FindBy(how=How.XPATH, using="//input[@id='zipcode']")
	WebElement zipcode;
	@FindBy(how=How.XPATH, using="//input[@id='phoneNumber']")
	WebElement phonenumber;
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Create Account')]")
	WebElement account;
	
	
	public void registering(String mail, String pass, String zip, String phone) {
		
		try {
			myaccount.click();
			Thread.sleep(2000);
			register.click();
			Thread.sleep(2000);
			email.sendKeys(mail);
			password.sendKeys(pass);
			zipcode.sendKeys(zip);
			phonenumber.sendKeys(phone);
			Thread.sleep(2000);
			account.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
}
