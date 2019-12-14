package org.amazon.testcase;

import java.io.IOException;

import org.amazon.base.ProjectSpecificMethod;
import org.amazon.pages.HomePage;
import org.testng.annotations.Test;

public class TC_01 extends ProjectSpecificMethod{
	
	@Test
	public void checkError() throws IOException {
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
