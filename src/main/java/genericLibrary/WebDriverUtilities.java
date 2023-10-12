package genericLibrary;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities 
{
  // 1. Handle dropdown
  public void dropdown(WebElement ele, String text)
  {
	  Select s = new Select(ele);
	  s.selectByVisibleText(text);
  }
  
  // 2. Handle mousehover
  public void mousehover(WebDriver driver, WebElement ele)
  {
	  Actions a = new Actions(driver);
	  a.moveToElement(ele).perform();
  }
  
  // 3. Handle rightclick
  public void rightclick(WebDriver driver, WebElement ele)
  {
	  Actions a = new Actions(driver);
	  a.contextClick(ele).perform();
  }
  
  // 4. Handle doubleclick
  public void doubleclick(WebDriver driver, WebElement ele)
  {
	  Actions a = new Actions(driver);
	  a.doubleClick(ele).perform();
  }
  
  // 5. Handle Drag & Drop
  public void draganddrop(WebDriver driver, WebElement ele1, WebElement ele2)
  {
	  Actions a = new Actions(driver);
	  a.dragAndDrop(ele1, ele2).perform();
  }
  
  // 6. Handle Frame
  public void frames(WebDriver driver, String value)
  {
	  driver.switchTo().frame(value);
  }
  
  // 7. Handle default content
  public void frames(WebDriver driver)
  {
	  driver.switchTo().defaultContent();
  }
  
  // 8. Handle Scrolling
  public void scrolling(WebDriver driver, int x, int y)
  {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scollBy(" + x + "," + y + ")");
  }
  
  // 9. Handle Scrolling
  public void scrolling(WebDriver driver, WebElement ele)
  {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView();",ele);
  }
  
  // 10. Handle Popups
  public void popup(WebDriver driver)
  {
	  driver.switchTo().alert().accept();
  }
  
  // 11. Handling Child browser
  public void childbrowser(WebDriver driver)
  {
	  Set<String> child = driver.getWindowHandles();
	  for(String b : child)
	  {
		  driver.switchTo().window(b);
	  }
  }
  
  // 12. Handle Implicit Wait
  public void implicitwait(WebDriver driver, int time)
  {
	  driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
  }
  
  // 13. Handle Explicit Wait
  public void explicitwait(WebDriver driver, WebElement ele, int time)
  {
	  WebDriverWait wait = new WebDriverWait(driver, time);
	  wait.until(ExpectedConditions.elementToBeClickable(ele));
  }
  
  
}
