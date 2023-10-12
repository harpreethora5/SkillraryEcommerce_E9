package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://demoapp.skillrary.com/feedback.php

public class DownloadinvoicePage 
{
   // declaration
	
	@FindBy(xpath = "//input[@name='downloadInvoice']") private WebElement downloadinvoice;
	
	// initialization
	
	public DownloadinvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	
	public void downloadinvoicewebelement()
	{
		downloadinvoice.click();
	}
}
