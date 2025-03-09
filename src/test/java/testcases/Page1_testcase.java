
package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.page1;

public class Page1_testcase extends Basic_testcase{

@Test

public void Page1() throws IOException, InterruptedException{

logger.info("Test case started");

       // Initialize Login Page
       page1 p1= new page1(driver);

       // Log and Perform Actions
       logger.info("Entering search...");
       p1.search_cover(val);
       
       p1.click_submit();

}
}