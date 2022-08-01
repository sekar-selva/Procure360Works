package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.Constants;
import com.qa.Procure360.util.ElementUtil;

public class SupplierAddressDetailsPage {
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By supplierAddDetailstitle = By.xpath("//li[contains(text(),'Supplier Address Details')]");
	private By regAddresstext = By.xpath("//h1[normalize-space()='Registered Address']");
	private By mainOfficeCheckBox = By.name("supplierDetails.isMainOffice");
	private By siteName = By.name("siteName");
	private By addressLine1 = By.name("supplierDetails.address1");
	private By addressLine2 = By.name("supplierDetails.address2");
	private By poBox = By.name("supplierDetails.poBox");
	private By addressLine3 = By.name("supplierDetails.address3");
	private By country = By.name("ctryId");
	private By state = By.name("state");
	private By city = By.name("supplierDetails.city");
	private By phoneNumber = By.name("supplierDetails.phone");
	private By faxNumber = By.name("supplierDetails.fax");
	private By offEmail = By.name("supplierDetails.email");
	private By taxDetailsHeader = By.xpath("//h1[normalize-space()='Tax Details']");
	private By taxType1 = By.name("supplierDetails.taxId1");
	private By taxIdentificationNum1 = By.name("supplierDetails.taxIdtxtValue1");
	private By taxType2 = By.name("supplierDetails.taxId2");
	private By taxIdentificationNum2 = By.name("supplierDetails.taxIdtxtValue2");
	private By taxType3 = By.name("supplierDetails.taxId3");
	private By taxIdentificationNum3 = By.name("supplierDetails.taxIdtxtValue3");
	private By taxType4 = By.name("supplierDetails.taxId4");
	private By taxIdentificationNum4 = By.name("supplierDetails.taxIdtxtValue4");
	private By savebutton = By.xpath("//button[@type ='submit']");  //----------->>>> save button
	private By dataSavedSuccessMessage = By.xpath("//ngb-alert[@role='alert']");  //----------------->>>>> common alert message
	private By nextOption = By.xpath("//ul[@class='pagination']/li[2]"); // --------->>>> next button
	private By previousOption = By.xpath("//ul[@class='pagination']/li[1]"); // -------->>> previous button
	

	public SupplierAddressDetailsPage(WebDriver driver)
	{
		this.driver = driver;
		eleutil = new ElementUtil (driver);

	}
	 
	
public boolean SupplierAddressDetails	(String siteName, String addressLine1, String addressLine2,
        																	String poBox, String addressLine3, String city, String phoneNumber, String faxNumber, String offEmail,
        																	String taxIdentificationNum1, String taxIdentificationNum2, String taxIdentificationNum3, String taxIdentificationNum4)
{
	eleutil.doSendKeys(this.siteName,siteName);
	eleutil.doSendKeys(this.addressLine1,addressLine1);
	eleutil.doSendKeys(this.addressLine2,addressLine2);
	eleutil.doSendKeys(this.poBox,poBox);
	eleutil.doSendKeys(this.addressLine3,addressLine3);
	eleutil.doSelectDropDownByIndex(country, 1);
	eleutil.doSelectDropDownByIndex(state, 1);
	eleutil.doSendKeys(this.city,city);
	eleutil.doSendKeys(this.phoneNumber,phoneNumber);
	eleutil.doSendKeys(this.faxNumber,faxNumber);
	eleutil.doSendKeys(this.offEmail,offEmail);
	eleutil.doSelectDropDownByIndex(taxType1, 1);
	eleutil.doSendKeys(this.taxIdentificationNum1,taxIdentificationNum1);
	eleutil.doSelectDropDownByIndex(taxType2, 2);
	eleutil.doSendKeys(this.taxIdentificationNum2,taxIdentificationNum2);
	eleutil.doSelectDropDownByIndex(taxType3, 3);
	eleutil.doSendKeys(this.taxIdentificationNum3,taxIdentificationNum3);
	eleutil.doSelectDropDownByIndex(taxType4, 4);
	eleutil.doSendKeys(this.taxIdentificationNum4,taxIdentificationNum4);
	eleutil.doClick(savebutton);
	String successmessage = eleutil.doGetText(dataSavedSuccessMessage);
	if (successmessage.contains(Constants.SAVE_SUCCESS_MESSAGE)) {
		eleutil.doClick(nextOption);	
		return true;
	}
	return false;
}
}


