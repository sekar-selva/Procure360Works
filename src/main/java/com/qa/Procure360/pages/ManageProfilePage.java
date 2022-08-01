package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.Procure360.util.ElementUtil;

public class ManageProfilePage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	
	private By pageHederText = By.xpath("//li[contains(text(),'Manage Profile')]");
	private By submissionStatus = By.xpath("//div[normalize-space()='Draft']");
	private By previewIcon = By.xpath("//img[@data-action-type='view']");
	private By editIcon = By.xpath("//img[@data-action-type='edit']");
	
	public ManageProfilePage(WebDriver driver)
	{
			this.driver = driver;
			eleutil = new ElementUtil(driver);
			
	}
	
	
	

}
