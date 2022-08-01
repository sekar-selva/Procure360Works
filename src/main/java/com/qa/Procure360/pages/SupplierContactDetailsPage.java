package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.ElementUtil;

public class SupplierContactDetailsPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	
	//SUPPLIER CONTACT DETAILS  ----Xpath's
	private By contactDetailsText = By.xpath("//li[@class='breadcrumb-item active']");
	private By primaryContactchkbox = By.name("supContactDetails.primary");
	private By contactFirstName = By.name("supContactDetails.firstName");
	private By contactMiddleName = By.name("supContactDetails.middleName");
	private By contactLastName = By.name("supContactDetails.lastName");
	private By contactJobTitle = By.name("supContactDetails.jobTitle");
	private By contactRole = By.name("supContactDetails.keyRole");
	private By contactMobile = By.name("supContactDetails.mobile");
	private By contactphone = By.name("supContactDetails.phone");
	private By contactEmail = By.name("supContactDetails.email");
	private By savebutton = By.xpath("//button[@type ='submit']");  //----------->>>> save button
	private By dataSavedSuccessMessgae = By.xpath("//ngb-alert[@role='alert']");  //----------------->>>>> common alert message
	private By nextOption = By.xpath("//ul[@class='pagination']/li[2]"); // --------->>>> next button
	private By previousOption = By.xpath("//ul[@class='pagination']/li[1]"); // -------->>> previous button
	
	
	public SupplierContactDetailsPage(WebDriver driver)
	{
		this.driver = driver;
		ElementUtil eleutil = new ElementUtil (driver);

	}
}
