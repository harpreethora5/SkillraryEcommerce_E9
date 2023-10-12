package Scripts;

import org.testng.annotations.Test;
import POM.DemoskillraryPage;
import POM.DownloadinvoicePage;
import POM.SkillraryHomePage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass
{
   @Test
   public void tc2()
   {
	   SkillraryHomePage s = new SkillraryHomePage(driver);
	   s.gearsbutton();
	   s.skillraryelementdemoapp();
	   utilities.childbrowser(driver);
	   DemoskillraryPage ds = new DemoskillraryPage(driver);
	   ds.feedbackelement();
	   DownloadinvoicePage dp = new DownloadinvoicePage(driver);
	   dp.downloadinvoicewebelement();
   }
}
