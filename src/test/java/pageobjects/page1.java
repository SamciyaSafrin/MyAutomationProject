package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page1 {
		
		public WebDriver driver;
		
		public page1(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="twotabsearchtextbox") WebElement searchbox;
		
		public void search_cover(String val) {
			searchbox.sendKeys(val);
		}
		
		public void click_submit() {
			//searchbox.click();
			searchbox.submit();
		}
				
	
	
	}


