package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
   public String getProperyData(String Key) throws IOException
   {
	   Properties p = new Properties();
	   FileInputStream fis = new FileInputStream(IpathConstant.propertyfilepath);
	   p.load(fis);
	   return p.getProperty(Key);
   }
}
