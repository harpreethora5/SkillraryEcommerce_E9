package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://demoapp.skillrary.com/

public class DemoskillraryPage 
{
  // declaration
  @FindBy(xpath="//a[text()='COURSE']") private WebElement coursebtn;
  
  @FindBy(name="addresstype") private WebElement selectcategorybtn;
  
  @FindBy(xpath="//a[text()='FEEDBACK']") private WebElement feedbackbtn;
  
  
  // initialization
  public DemoskillraryPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  // Utilization
  public WebElement getCoursebtn()
  {
	  return coursebtn;
  }
  
  public WebElement getsearchcategory()
  {
	  return selectcategorybtn;
  }
  
  public void feedbackelement()
  {
	  feedbackbtn.click();
  }
}
