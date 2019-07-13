package com.expedia;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaFlight {
	
	WebDriver driver;
	
	public ExpediaFlight(WebDriver driver) {
		
		this.driver=driver;
		
	}
		
		@FindBy(how=How.XPATH, using="//span[contains(text(),'Flights')]")
		WebElement flight;
		@FindBy(how=How.XPATH, using="//input[@id='flight-origin-hp-flight']")
		WebElement daparture;
		@FindBy(how=How.XPATH, using="//a[@id='aria-option-3']")
		WebElement iad;
		@FindBy(how=How.XPATH, using="//input[@id='flight-destination-hp-flight']")
		WebElement arrival;
		@FindBy(how=How.XPATH, using="//a[@id='aria-option-0']//div[1]")
		WebElement nassau;
		@FindBy(how=How.XPATH, using="//input[@id='flight-departing-hp-flight']") 
		WebElement departing;
		@FindBy(how=How.XPATH, using="//div[3]//table[1]//tbody[1]//tr[2]//td[4]//button[1]")
		WebElement datedeparting;
		@FindBy(how=How.XPATH, using="//input[@id='flight-returning-hp-flight']")
		WebElement returning;
		@FindBy(how=How.XPATH, using="//button[@class='datepicker-cal-date'][contains(text(),'21')]")
		WebElement datereturning;
		@FindBy(how=How.XPATH, using="//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
		WebElement search;
		
		@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[2]/div[8]/section[1]/div[1]/div[11]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")
		WebElement selectflight1;
		@FindBy(how=How.XPATH, using="//div[@id='basic-economy-tray-content-1']//button[@class='btn-secondary btn-action t-select-btn']")
		WebElement thisfare1;
		
	
		@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[2]/div[8]/section[1]/div[1]/div[11]/ul[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")
		WebElement selectflight2;
		@FindBy(how=How.XPATH, using="//*[@id=\"basic-economy-tray-content-1\"]/div/div/div[1]/button")
		WebElement thisfare2;
		
		
		@FindBy(how=How.XPATH, using="//*[@id=\"forcedChoiceNoThanks\"]")
		WebElement nothanks;
		
		@FindBy(how =How.XPATH, using="//*[@id=\"bookButton\"][@class=\"btn-primary btn-action bookButton\"]")
		WebElement continueButton;
		
		@FindBy(how=How.XPATH, using="//button[@id='modalCloseButton']//span[@class='icon icon-close'])")
		WebElement popup;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"firstname[0]\"]")
		WebElement firstname;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"middlename[0]\"]")
		WebElement middlename;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"lastname[0]\"]")
		WebElement lastname;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"phone-number[0]\"]")
		WebElement phonenumber;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"gender_male[0]\"]")
		WebElement malegender;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"gender_female[0]\"]")
		WebElement femalegender;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"date_of_birth_month0\"]")
		WebElement bmonth;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"date_of_birth_day[0]\"]")
		WebElement bday;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"date_of_birth_year[0]\"]")
		WebElement byear;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"no_insurance\"]")
		WebElement flightprotection;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/label[1]/input")
		WebElement cardholder;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"creditCardInput\"]")
		WebElement creditcard;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[1]/select")
		WebElement cardmonth;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[2]/select")
		WebElement cardyear;
		
		@FindBy(how=How.XPATH, using="//input[@id='new_cc_security_code']")
		WebElement securitycode;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[1]/input")
		WebElement billingaddress;
	
		@FindBy(how=How.XPATH, using="//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[3]/input")
		WebElement thecity;
		
		
		@FindBy(how=How.XPATH, using="//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[4]/select")
		WebElement thestate;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[5]/input")
		WebElement thezipcode;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"email\"]/div[1]/fieldset/label/input")
		WebElement mail;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"account-creation\"]/fieldset/label[1]/input")
		WebElement createpassword;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"account-creation\"]/fieldset/label[2]/input")
		WebElement confirmpassword;
		
		@FindBy(how=How.XPATH, using="//*[@id=\"complete-booking\"]")
		WebElement completebooking;
		
	
		
		
		public void traveling(String name1, String name2) {
			
			flight.click();
			daparture.sendKeys(name1);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			iad.click();
			arrival.sendKeys(name2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			nassau.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			departing.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			datedeparting.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			returning.click();
			datereturning.click();
			search.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
				WebDriverWait wait = new WebDriverWait(driver,(40));
				wait.until(ExpectedConditions.elementToBeClickable(selectflight1));
				
				selectflight1.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				thisfare1.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebDriver wd = this.driver;
				String tab1=wd.getWindowHandle();
				ArrayList<String> availablewindows = new ArrayList<String>(wd.getWindowHandles());
				if(!availablewindows.isEmpty()) {
					
					wd.switchTo().window(tab1);
				
				}else {
					wd.switchTo().window(tab1);
				}
				
				
				WebDriverWait wait2 = new WebDriverWait(driver,(30));
				wait2.until(ExpectedConditions.elementToBeClickable(selectflight2));
				selectflight2.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//thisfare2.click();
				
				try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
				
				try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
				
				nothanks.click();
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e1) {
					
					e1.printStackTrace();
				}
				
//				JavascriptExecutor ball = (JavascriptExecutor)driver;
//				ball.executeScript("scrollBy(0, 3700)");
				WebDriver wd1 = this.driver;
				String tab2=wd1.getWindowHandle();
				ArrayList<String> availablewindow = new ArrayList<String>(wd.getWindowHandles());
				if(!availablewindow.isEmpty()) {
					
					wd1.switchTo().window(availablewindow.get(2));
				
				}else {
					wd1.switchTo().window(tab2);
				}	
			JavascriptExecutor scroll2 =(JavascriptExecutor) driver;
			scroll2.executeScript("arguments[0].scrollIntoView(true);", continueButton);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			continueButton.click();
			
			}
			
			public void personalinformation (String fname, String mname, String lname, String phoneno, String gender, int month, String day, String year ) {

				 
			//	 popup.click();
				 
			        firstname.sendKeys(fname);

			        try {

			            Thread.sleep(3000);

			        } catch (InterruptedException e) {

			            e.printStackTrace();

			        }



			        middlename.sendKeys(mname);

			        try {

			            Thread.sleep(3000);

			        } catch (InterruptedException e) {

			            e.printStackTrace();

			        }



			        lastname.sendKeys(lname);

			        try {

			            Thread.sleep(3000);

			        } catch (InterruptedException e) {

			            e.printStackTrace();

			        }



			        phonenumber.sendKeys(phoneno);

			        try {

			            Thread.sleep(3000);

			        } catch (InterruptedException e) {

			            e.printStackTrace();

			        }
		
			
			
			if (gender.equalsIgnoreCase("male")) {

	            malegender.click();

	            try {

	                Thread.sleep(3000);

	            } catch (InterruptedException e) {

	                e.printStackTrace();

	            }

	        } else if (gender.equalsIgnoreCase("female")) {

	            femalegender.click();

	            try {

	                Thread.sleep(3000);

	            } catch (InterruptedException e) {

	                e.printStackTrace();

	            }

	        } else {

	            System.out.println("Unknown Gender Entered");

	        }



	        JavascriptExecutor temp = (JavascriptExecutor) driver;

	        temp.executeScript("arguments[0].scrollIntoView(true);", bmonth);

	        try {

	            Thread.sleep(3000);

	        } catch (InterruptedException e) {

	            e.printStackTrace();

	        }



	        bmonth.click();

	        Select mnt = new Select(bmonth);

	        mnt.selectByIndex(month);



	        try {

	            Thread.sleep(3000);

	        } catch (InterruptedException e) {

	            e.printStackTrace();

	        }

	        bday.click();

	        Select da = new Select(bday);

	        da.selectByValue(day);

	        try {

	            Thread.sleep(3000);

	        } catch (InterruptedException e) {

	            e.printStackTrace();

	        }



	        byear.click();

	        Select yr = new Select(byear);

	        yr.selectByVisibleText(year);

	        try {

	            Thread.sleep(3000);

	        } catch (InterruptedException e) {

	            e.printStackTrace();

	        }


	        flightprotection.click();
	       

	        try {

	            Thread.sleep(3000);

	        } catch (InterruptedException e) {

	            e.printStackTrace();

	        }
			
	        JavascriptExecutor temp1 = (JavascriptExecutor) driver;

	        temp1.executeScript("arguments[0].scrollIntoView(true);", flightprotection);
			
			}
		
		
		
	public void cardinformation ( String cardName, String cardNumber, int string, String cryear, String cvvNumber) {

    cardholder.sendKeys(cardName);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }



    creditcard.sendKeys(cardNumber);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }

    JavascriptExecutor temp2 = (JavascriptExecutor) driver;

    temp2.executeScript("arguments[0].scrollIntoView(true);", creditcard);



    cardmonth.click();

    Select crdmn = new Select(cardmonth);

    crdmn.selectByIndex(string);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }

    cardyear.click();

    Select cryr = new Select(cardyear);

    cryr.selectByVisibleText(cryear);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }



    securitycode.sendKeys(cvvNumber);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }





    JavascriptExecutor temp3 = (JavascriptExecutor) driver;

    temp3.executeScript("arguments[0].scrollIntoView(true);", securitycode);

}
		
			
	
public void billingAddressInfo(String address1, String city, String state, String zipcode, String email, String pass, String confpass ){



    billingaddress.sendKeys(address1);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }

  

    thecity.sendKeys(city);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }

    thestate.click();

    Select stat = new Select(thestate);

    stat.selectByVisibleText(state);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }



    JavascriptExecutor temp4 = (JavascriptExecutor)driver;

    temp4.executeScript("arguments[0].scrollIntoView(true);", thestate);





    thezipcode.sendKeys(zipcode);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }



    mail.sendKeys(email);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }



    createpassword.sendKeys(pass);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }



    confirmpassword.sendKeys(confpass);

    try {

        Thread.sleep(3000);

    } catch (InterruptedException e) {

        e.printStackTrace();

    }



    JavascriptExecutor temp5 = (JavascriptExecutor)driver;

    temp5.executeScript("arguments[0].scrollIntoView(true);",confirmpassword);



    completebooking.click();



}

}

