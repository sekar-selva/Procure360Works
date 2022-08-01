package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.ElementUtil;

public class SupplierBankDetailsPage {

	private WebDriver driver;
	private ElementUtil eleutil;
	
	//BANK DETAILS ---------Xpath's
		private By bankHeader = By.xpath("//li[contains(text(),'Bank')]");
		private By bankName = By.name("supplierbank.bankName");
		private By branchName = By.name("supplierbank.branch");
		private By currencyCode = By.name("supplierbank.currencyCode");
		private By cityName = By.name("supplierbank.city");
		private By bankCountry = By.id("bankCountryId");
		private By bankState = By.id("bankStateId");
		private By bankAccNo = By.name("supplierbank.accountNumber");
		private By swiftCode = By.name("supplierbank.swiftCode");
		private By bankRefIdentifier = By.name("supplierbank.bankRefNum");
		private By refNumber = By.name("supplierbank.refNum");
		private By corresBankCheckbox = By.name("supplierbank.correspondent");
		private By corresBankText = By.xpath("//span[contains(text(),'Correspondent')]");
		private By corresBankName = By.name("supplierbank.corresBankName");
		private By corresBranch = By.name("supplierbank.corresBranch");
		private By corresCurrencyCode = By.name("supplierbank.corresCurrencyCode");
		private By corresCity = By.name("supplierbank.corresCity");
		private By corresCountry = By.id("corresCountryId");
		private By corresState = By.id("coressStateId");
		private By corresAccNum = By.id("supplierbank.corresAccountNumber");
		private By corresSwiftCode = By.name("supplierbank.corresSwiftCode");
		private By corresRefIdentifier = By.name("supplierbank.corresBankRefNum");
		private By corresRefNum = By.name("supplierbank.corresRefNum");
		private By savebutton = By.xpath("//button[@type ='submit']");  //----------->>>> save button
		private By dataSavedSuccessMessgae = By.xpath("//ngb-alert[@role='alert']");  //----------------->>>>> common alert message
		private By nextOption = By.xpath("//ul[@class='pagination']/li[2]"); // --------->>>> next button
		private By previousOption = By.xpath("//ul[@class='pagination']/li[1]"); // -------->>> previous button
	
	
	public SupplierBankDetailsPage(WebDriver driver)
	{
		this.driver = driver;
		ElementUtil eleutil = new ElementUtil (driver);

	}
}
