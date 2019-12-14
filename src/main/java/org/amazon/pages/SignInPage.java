package org.amazon.pages;

import org.amazon.base.ProjectSpecificMethod;

public class SignInPage extends ProjectSpecificMethod{
	
	public SignInPage proceedToBuy() {
		driver.findElementByXPath("//span[@class='a-button-inner']/a[@id='hlb-ptc-btn-native']").click();
		 if(driver.getTitle().contentEquals("Amazon Sign In")) {
			 System.out.println("You are in Sign In page");
		 }
		 return this;
	}
	
	public SignInPage errorChecking() {
		driver.findElementById("continue").click();
		 System.out.println("Error displayed is: " +driver.findElementByXPath("//div[@id='auth-email-missing-alert']/div/div[@class='a-alert-content']").getText());
		 return this;
	}

}
