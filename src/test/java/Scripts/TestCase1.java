package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import POM.DemoskillraryPage;
import POM.SkillraryHomePage;
import POM.TestingPage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass
{
   @Test
   public void tc1() throws IOException, InterruptedException
   {   
	   SkillraryHomePage s = new SkillraryHomePage(driver);
	   s.gearsbutton();
	   s.skillraryelementdemoapp();
	   utilities.childbrowser(driver);
	   DemoskillraryPage ds = new DemoskillraryPage(driver);
	   Thread.sleep(3000);
	   utilities.dropdown(ds.getsearchcategory(), pdata.getProperyData("coursedd"));
	   TestingPage t = new TestingPage(driver); 
	   utilities.scrolling(driver, t.getfb()); 
	   t.fbIcon();
		 
   }
}
