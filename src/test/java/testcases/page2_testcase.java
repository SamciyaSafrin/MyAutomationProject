package testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageobjects.page2;

public class page2_testcase extends Page1_testcase {
@Test(dependsOnMethods="testcases.Page1_testcase.Page1")
	public void Page2() throws IOException, InterruptedException{

		logger.info("Test case started");

		       // Initialize Login Page
		       page2 p2= new page2(driver);

		       //	p2.setOrder();
		  	 List<WebElement> products = driver.findElements(By.cssSelector("div.s-main-slot a.a-link-normal.s-no-outline"));
		     if (products.isEmpty()) {
		         System.out.println("❌ No products found! Try changing the search term.");
		         return;
		     }
		     products.get(0).click();
		     Thread.sleep(3000);
		       	p2.set_add_to_cart();

}
}