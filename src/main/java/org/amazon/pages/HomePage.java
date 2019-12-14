package org.amazon.pages;

import org.amazon.base.ProjectSpecificMethod;
import org.openqa.selenium.Keys;

public class HomePage extends ProjectSpecificMethod {
	
	public HomePage searchMobile() {
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30", Keys.ENTER);
		return this;
	}
	
	public HomePage getPrice() {
		System.out.println("Price of the first result is: " +driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText());
		return this;
	}
	
	public MobileDetailsPage openDetails() {
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		return new MobileDetailsPage();
	}
	
		 
}