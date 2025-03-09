package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class page3 {
	
	public WebDriver driver;
	
	public page3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(how = How.CSS, using = "a[href*='proceedToCheckout']") WebElement check_out;
	 
	 public void click_check_out() {
		 check_out.click();
	 }

}
