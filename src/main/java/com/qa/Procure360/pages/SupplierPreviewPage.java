package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.ElementUtil;

public class SupplierPreviewPage {
	private WebDriver driver;
	private ElementUtil eleutil;
	
	//SUPPLIER PREVIEW
	
	private By collapseAllOption = By.xpath("//span[@class='collapse-all']");
	private By expandAllOption = By.xpath("//span[@class='expand-all']");
	private By printOption = By.xpath("//button[contains(text(),'Print')]");
	private By nextOption = By.xpath("//ul[@class='pagination']/li[2]"); // --------->>>> next button
	private By previousOption = By.xpath("//ul[@class='pagination']/li[1]"); // -------->>> previous button
	
	
	public SupplierPreviewPage()
	{
		this.driver = driver;
		ElementUtil eleutil = new ElementUtil(driver);
		
	}

}
