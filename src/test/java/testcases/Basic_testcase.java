
package testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;

public class Basic_testcase {
ReadConfig readconfig=new ReadConfig();

public String baseurl=readconfig.getApplicationURL();
public String val = readconfig.getval();

public static WebDriver driver;

public static Logger logger;

@Parameters("browser")
@BeforeClass
public void setup(String br) throws InterruptedException
{
logger = Logger.getLogger("Banking");
PropertyConfigurator.configure("log4j.properties");

if(br.equals("chrome"))
{
logger.info("chrome is starting");
System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
driver=new ChromeDriver();
}

else if(br.equals("firefox"))
{
System.setProperty("webdriver.firefox.driver",readconfig.getFirefoxPath());
       driver = new FirefoxDriver();
}

else if(br.equals("edge"))
{
System.setProperty("webdriver.edge.driver",readconfig.getedgepath());
       driver = new EdgeDriver();
}

Thread.sleep(30);
driver.get(baseurl);
driver.manage().window().maximize();
logger.info("url is opening");

}


 @AfterClass
 public void tearDown()
 {
 driver.quit();
 }
}