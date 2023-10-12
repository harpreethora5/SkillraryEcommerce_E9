package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://demoapp.skillrary.com/category.php?category=testing

public class TestingPage 
{
  // Declaration
  // Address of facebook webelement
  @FindBy(xpath="(//i[@class='fa fa-facebook'])[2]") private WebElement facebkbtn;
  
  // Initilization
  public TestingPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public WebElement getfb()
  {
	  return facebkbtn; 
  }
  
  public void fbIcon()
  {
	  facebkbtn.click();
  }
 
}
