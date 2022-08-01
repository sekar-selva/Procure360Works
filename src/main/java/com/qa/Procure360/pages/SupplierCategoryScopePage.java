package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.ElementUtil;

public class SupplierCategoryScopePage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//CATEGORY & SCOPE -------Xpath's
	private By cateAndScopeheader = By.xpath("//li[contains(text(),' Category')]");
	private By parentCategory = By.name("parentCategory");
	private By subCategory = By.name("subCategory");
	private By childCategory = By.name("childCategory");
	private  By docCategory = By.name("docCategory");
	private By docDesc = By.name("docDesc");
	private By uploadDocs = By.name("file");
	private By testimonialView = By.xpath("//span[contains(text(),'View')]");
	private By editOption = By.xpath("//img[@data-action-type='edit']");
	private By removeOption = By.xpath("//i[@data-action-type='remove']");
	private By savebutton = By.xpath("//button[@type ='submit']");  //----------->>>> save button
	private By dataSavedSuccessMessgae = By.xpath("//ngb-alert[@role='alert']");  //----------------->>>>> common alert message
	private By nextOption = By.xpath("//ul[@class='pagination']/li[2]"); // --------->>>> next button
	private By previousOption = By.xpath("//ul[@class='pagination']/li[1]"); // -------->>> previous button
	
	public void CategoryScopePage()
	{
		this.driver = driver;
		ElementUtil eleutil = new ElementUtil (driver);
		
	}

}
