package org.amazon.testcase;

import org.amazon.base.ProjectSpecificMethod;
import org.amazon.pages.HomePage;
import org.testng.annotations.Test;

public class TC_01 extends ProjectSpecificMethod{
	
	@Test
	public void checkError() {
		new HomePage()
		.searchMobile()
		.getPrice()
		.openDetails()
		.getDeliveryDate()
		.addToCart()
		.proceedToBuy()
		.errorChecking();
	}

}
