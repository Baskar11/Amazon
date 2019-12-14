package org.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.amazon.base.ProjectSpecificMethod;

public class MobileDetailsPage extends ProjectSpecificMethod{
	
	public MobileDetailsPage getDeliveryDate() {
		Set<String> windowHandles = driver.getWindowHandles();
		 List<String> lis = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(lis.get(1));
		 System.out.println("Delivery by: " +driver.findElementByXPath("//div[@id='ddmDeliveryMessage']/span").getText());
		 return this;
	}
	
	public SignInPage addToCart() {
		driver.findElementById("add-to-cart-button").click();
		 if(driver.findElementByXPath("//div[@id='huc-v2-confirm-text-container']/div/h1").getText().contentEquals("Added to cart")) {
			 System.out.println("Added to cart successfully");
		 }
		 return new SignInPage();
	}
	
	

}
