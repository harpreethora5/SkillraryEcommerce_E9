package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://demoapp.skillrary.com/product.php?product=java

public class AddToCartPage 
{
   // Declaration
	@FindBy(xpath="//i[@class='fa fa-plus']") private WebElement plusicon;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-flat']") private WebElement addtocart;
	
	// Initialization
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getplusicon()
	{
		return plusicon;
	}
	
	public void addtocarbtn()
	{
		addtocart.click();
	}
}


//div[text()='Sep']/ancestor::div[@class='sc-jzJRlG dPBSOp']//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw']

//div[text()='Sep']/ancestor::div[@class='sc-jzJRlG dPBSOp']//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 fgdqFw'] 