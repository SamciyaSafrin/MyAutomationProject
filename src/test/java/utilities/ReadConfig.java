
package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties pro;
public ReadConfig()
{
File src=new File("./ConfigurationFiles/config.properties");

try {
FileInputStream fis=new FileInputStream(src);
    pro =new Properties();
    pro.load(fis);
}catch (Exception e) {
System.out.println("Exception is" + e.getMessage());
}}

public String getChromePath()
{
String chromepath=pro.getProperty("chromepath");
return chromepath;
}

public String getFirefoxPath()
{
String firefoxpath=pro.getProperty("firefoxpath");
return firefoxpath;
}

public String getedgepath()
{
String edgepath=pro.getProperty("edgepath");
return edgepath;
}

public String getApplicationURL()
{
String baseurl=pro.getProperty("complete_url");
return baseurl;

}

public String getval()
{
String val=pro.getProperty("val");
return val;
}

}