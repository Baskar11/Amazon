package org.amazon.pages;

import java.io.File;
import java.io.IOException;

import org.amazon.base.ProjectSpecificMethod;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class SignInPage extends ProjectSpecificMethod{
	
	public SignInPage proceedToBuy() {
		driver.findElementByXPath("//span[@class='a-button-inner']/a[@id='hlb-ptc-btn-native']").click();
		 if(driver.getTitle().contentEquals("Amazon Sign In")) {
			 System.out.println("You are in Sign In page");
		 }
		 return this;
	}
	
	public SignInPage errorChecking() throws IOException {
		driver.findElementById("continue").click();
		 System.out.println("Error displayed is: " +driver.findElementByXPath("//div[@id='auth-email-missing-alert']/div/div[@class='a-alert-content']").getText());
		 File scr = driver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("D:/ProofOfConcept/Screenshots.JPG");
		 FileUtils.copyFile(scr,dest);
		 return this;
	}

}
