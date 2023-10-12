package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.skillrary.com/

public class SkillraryHomePage 
{
  // Declarartion
	
  // address of gears webelement
  @FindBy(xpath = "//a[text()=' GEARS ']") private WebElement gearbtn;
  
  // address of skillrary demo app
  @FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]") private WebElement skillrarydemoapp;
  
  // address of search text field
  @FindBy(xpath="//input[@name='q']") private WebElement textfield;
  
  // address of search icon
  @FindBy(xpath="//input[@value='go']") private WebElement searchicon;
  
  //address of cookies
  
  
  
  // initialization
  
  public SkillraryHomePage(WebDriver driver)  // Constructor
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void gearsbutton()
  {
	  gearbtn.click();
  }
  
  public void skillraryelementdemoapp()
  {
	  skillrarydemoapp.click();
  }
  
  public void searchtextfield(String data)
  {
	  textfield.sendKeys(data);
  }
  
  public void searchiconelement()
  {
	  searchicon.click();
  }
  
  

}
