package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.page3;

public class page3_testcase extends page2_testcase {
@Test(dependsOnMethods="testcases.page2_testcase.Page2")
	public void Page3() throws IOException, InterruptedException{

		logger.info("Test case started");

		       // Initialize Login Page
		       page3 p3= new page3(driver);
			  Thread.sleep(3000);
		     p3.click_check_out();
}
}