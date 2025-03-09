package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page2 {
	public WebDriver driver;
	
	public page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[2]/div/div/div[5]/div[1]/div[4]/div/div[1]/div/div/div/form/div/div/div/div/div[4]/div/div[36]/div[1]/span/span/span/input") WebElement add_to_cart;
	
	public void setOrder(){
	 List<WebElement> products = driver.findElements(By.cssSelector("div.s-main-slot a.a-link-normal.s-no-outline"));
     if (products.isEmpty()) {
         System.out.println("❌ No products found! Try changing the search term.");
         return;
     }
     products.get(0).click(); }
	
	public void set_add_to_cart() {
		add_to_cart.click();
	}


}
