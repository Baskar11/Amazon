package Amazon.ProofOfConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHome {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30", Keys.ENTER);
		 System.out.println("Price of the first result is: " +driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText());
		 driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> lis = new ArrayList<String>(windowHandles);
		 driver.switchTo().window(lis.get(1));
		 System.out.println("Delivery by: " +driver.findElementByXPath("//div[@id='ddmDeliveryMessage']/span").getText());
		 driver.findElementById("add-to-cart-button").click();
		 if(driver.findElementByXPath("//div[@id='huc-v2-confirm-text-container']/div/h1").getText().contentEquals("Added to cart")) {
			 System.out.println("Added to cart successfully");
		 }
		 driver.findElementByXPath("//span[@class='a-button-inner']/a[@id='hlb-ptc-btn-native']").click();
		 if(driver.getTitle().contentEquals("Amazon Sign In")) {
			 System.out.println("You are in Sign In page");
		 }
		 driver.findElementById("continue").click();
		 System.out.println("Error displayed is: " +driver.findElementByXPath("//div[@id='auth-email-missing-alert']/div/div[@class='a-alert-content']").getText());
		 

	}

}
