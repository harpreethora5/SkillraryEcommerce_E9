package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
   public WebDriver driver;
   public PropertyFile pdata = new PropertyFile();
   public WebDriverUtilities utilities = new WebDriverUtilities();
   
   @BeforeMethod
   public void openApp() throws IOException
   {
	   System.setProperty("webdriver.chrome.driver", "F:\\ec_workspace\\QCO-SOEJVD-E9\\src\\main\\resources\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get(pdata.getProperyData("url"));
   }
   
   public void closeApp(ITestResult res) throws IOException 
   {
	   int status = res.getStatus();
	   String name = res.getName();
	   
	   if(status==2)
	   {
		   Photo p = new Photo();
		   p.getphoto(driver, name);
	   }
	   
	   driver.quit();
   }
   
   
}
