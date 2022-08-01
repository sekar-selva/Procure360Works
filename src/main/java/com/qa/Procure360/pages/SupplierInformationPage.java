package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.Constants;
import com.qa.Procure360.util.ElementUtil;
import com.qa.Procure360.util.JavaScriptUtil;


public class SupplierInformationPage {

	private WebDriver driver;
	private ElementUtil eleutil;
	private JavaScriptUtil jsUtil;
	

	private By supplierinfoheaderTitle = By.xpath("//li[contains(text(),'Supplier Information')]");
	private By companyDetailsHeaderText = By.xpath("//h1[normalize-space()='Company Details']");
	private By companyName = By.name("supplierInfoVO.supplierNameEn");
	private By companyNameinArabic = By.xpath("//label[normalize-space()='Company name in Arabic']");
	private By parentCompanyName = By.name("supplierInfoVO.parentCompName");
	private By establshDate = By.name("estdDate");
	//private By calnder xpath and it needs to be handled
	private By supplierClassification = By.name("supplierInfoVO.supplierClassification");
	private By supplierType = By.name("quadAreaValue");
	private By typeofOwnership = By.name("ownerTypeValue");
	private By orgWebsite = By.name("supplierInfoVO.website");
	private By commLicenseDetailsHeader = By.xpath("//h1[normalize-space()='Commercial License Details']");
	private By licenseNo = By.name("supplierInfoVO.tradelicenseno");
	private By issuedBy = By.name("supplierInfoVO.issuedby");
	private By issuedDate = By.name("issueddate");
	private By expiryDate = By.name("expirydate");
	private By location = By.name("supplierInfoVO.location");
	private By mgrinCommercialText = By.xpath("//h1[normalize-space()='Commercial License Details']");
	private By primarycontactCheckBox = By.xpath("//input[@type='checkbox']");
	private By firstName = By.name("supplierInfoVO.managerFirstName");
	private By middleName = By.name("supplierInfoVO.managerMiddleName");
	private By lastName = By.name("supplierInfoVO.managerLastName");
	private By role = By.name("supplierInfoVO.keyRole");
	private By jobTitle = By.name("supplierInfoVO.jobTitle");
	private By mobileNumber = By.name("supplierInfoVO.mobile");
	private By email = By.name("supplierInfoVO.email");
	private By supplierStatus = By.xpath("//span[@class='p-0 m-0']/a[starts-with(text(),'Draft')]");
	private By savebutton = By.xpath("//button[@type ='submit']");  //----------->>>> save button
	private By dataSavedSuccessMessgae = By.xpath("//ngb-alert[contains(text(),'Supplier')]");  //----------------->>>>> common alert message
	private By nextOption = By.xpath("//ul[@class='pagination']/li[2]"); // --------->>>> next button
	private By previousOption = By.xpath("//ul[@class='pagination']/li[1]"); // -------->>> previous button
	private By alertYes = By.xpath("//button[contains(text(),'Yes')]");
	private By alertNo = By.xpath("//button[contains(text(),'No')]");
	
	public SupplierInformationPage(WebDriver driver)
	{
		this.driver = driver;
		eleutil = new ElementUtil (driver);
		jsUtil = new JavaScriptUtil(driver);

	}
	
	public boolean SupplierInformation(String parentCompanyName, String orgWebsite, String issuedBy, String location, String firstName, 
	                                                                         		  String middleName, String lastName,String jobTitle, String mobileNumber, String email) throws InterruptedException {
		
		//eleutil.doSendKeys(this.companyName, companyName);
		//eleutil.waitForElementPresence(this.companyNameinArabic, 10);
		//eleutil.doActionsClick(this.companyNameinArabic);
		//eleutil.doSendKeys(this. companyNameinArabic, companyNameinArabic);
		eleutil.waitForElementPresence(this.parentCompanyName, 10);
		eleutil.doActionsClick(this.parentCompanyName);
		eleutil.doSendKeys(this. parentCompanyName, parentCompanyName);
		eleutil.doSendKeys(establshDate, "12-Apr-1950");
		//eleutil.doSelectDropDownByIndex(supplierClassification, 1);
		eleutil.doSelectDropDownByVisibleText(supplierType, "Contractor");
		eleutil.doSelectDropDownByVisibleText(typeofOwnership, "Private Limited");
		//suppl classification drop
		eleutil.doSendKeys(this. orgWebsite, orgWebsite);
		//eleutil.doSendKeys(this. licenseNo, licenseNo);
		eleutil.doSendKeys(this. issuedBy, issuedBy);
		eleutil.doSendKeys(issuedDate, "22-Mar-1950");
		eleutil.doSendKeys(this. location, location);
		eleutil.doSendKeys(expiryDate, "22-Mar-2050");
		jsUtil.pageScroll();
		//exp date
		//mgr in comm details header
		
		//primary contact checkbox 
		eleutil.doSendKeys(this. firstName, firstName);
		eleutil.doSendKeys(this. middleName, middleName);
		eleutil.doSendKeys(this. lastName, lastName);
		eleutil.doClick(primarycontactCheckBox);
		//role
		eleutil.doSelectDropDownByVisibleText(role, "CXO Level ");
		eleutil.doSendKeys(this. jobTitle, jobTitle);
		eleutil.doSendKeys(this. mobileNumber, mobileNumber);
		eleutil.doSendKeys(this. email, email);
		eleutil.doClick(savebutton);
		Thread.sleep(3000);
		jsUtil.scrollPageUp();
		eleutil.waitForElementPresence(alertYes, 10).click();
		jsUtil.scrollPageUp();
		Thread.sleep(3000);
		String  saveConfirmMessage = eleutil.doGetText(dataSavedSuccessMessgae);
		System.out.println(saveConfirmMessage);
		
		//if (saveConfirmMessage.equals(Constants.SAVE_SUCCESS_MESSAGE)) {
		jsUtil.pageScroll();
		eleutil.doClick(nextOption);	
		return new SupplierAddressDetailsPage(driver);
	}
	}
			
	
	
	
	
	
	
	
	
	
	
	
	

	


