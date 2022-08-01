package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.Constants;
import com.qa.Procure360.util.ElementUtil;
import com.qa.Procure360.util.JavaScriptUtil;

public class SupplierRegistrationPage {

	private WebDriver driver;
	private ElementUtil eleutil;
	private JavaScriptUtil jsUtil;

	
		private By applicationLogo = By.xpath("//img[@class='img-fluid']");
		private By homeOption = By.xpath("//li[@class='nav-item active']//a[@class='nav-link']");
		private By contactusOption = By.xpath("//a[starts-with(text(),'Contact us')]");
		private By langtranslation = By.xpath("//span[@class='hrcAhc']");
		private By newRegText = By.xpath("//li[@class='breadcrumb-item active']");
		private By companyName = By.name("newUser.companyName");
		private By tradeLicenseNo = By.name("newUser.tradeLicenseNo");
		private By supplierClassification = By.name("newUser.supplierClassification");
		private By loginId = By.name("newUser.username");
		private By passWord = By.name("newUser.password");
		private By confirmPassword = By.name("newUser.confirmPassword");
		private By companyEmailId = By.name("newUser.companyEmailId");
		private By primaryContactText = By.xpath("//h1[normalize-space()='Primary Contact Details']");
		private By firstName = By.name("newUser.firstName");
		private By middleName = By.name("newUser.middleName");
		private By lastName = By.name("newUser.lastName");
		private By designation = By.name("newUser.designation");
		private By role = By.name("newUser.role");
		private By workPhoneNumber = By.name("newUser.phoneNo");
		private By mobileNumber = By.name("newUser.mobileNo");
		private By eMail = By.name("newUser.email");
		private By submit = By.xpath("//button[@type='submit']");
		private By createNew = By.linkText("Create now!");
		private By regConfirmMsg = By.xpath("//ngb-alert[@role='alert']");
		private By clear = By.xpath("//button[normalize-space()='CLEAR']");
		
		//doSelectDropDownByVisibleText
		
		public SupplierRegistrationPage (WebDriver driver)
		{
			this.driver = driver;
			eleutil = new ElementUtil(driver);
			jsUtil = new JavaScriptUtil(driver);
		}
		
	
		
		public boolean supplierInformation(String companyName, String tradeLicenseNo, String loginId, String passWord, String confirmpassWord, String companyEmailId, 
			                           String firstName, String middleName, String lastName, String designation,
			                            String workPhoneNumber, String mobileNumber, String eMail)
		
		{
		eleutil.doSendKeys(this.companyName, companyName);
		eleutil.doSendKeys(this.tradeLicenseNo, tradeLicenseNo);
		eleutil.doSelectDropDownByVisibleText(supplierClassification, "Overseas");
		eleutil.doSendKeys(this.loginId, loginId);
		eleutil.doSendKeys(this.passWord, passWord);
		eleutil.doSendKeys(this.confirmPassword, confirmpassWord);
		eleutil.doSendKeys(this.companyEmailId, companyEmailId);
		eleutil.doSendKeys(this.firstName, firstName);
		eleutil.doSendKeys(this.middleName, middleName);
		eleutil.doSendKeys(this.lastName, lastName);
		eleutil.doSendKeys(this.designation, designation);
		eleutil.doSelectDropDownByVisibleText(role, "CXO Level"); 
		eleutil.doSendKeys(this.workPhoneNumber, workPhoneNumber);
		eleutil.doSendKeys(this.mobileNumber, mobileNumber);
		eleutil.doSendKeys(this.eMail, eMail);
		 jsUtil.pageScroll();
		 eleutil.waitForElementPresence(submit, Constants.DEFAULT_TIME_OUT);
		eleutil.doClick(submit);
		eleutil.waitForElementPresence(regConfirmMsg, Constants.DEFAULT_TIME_OUT);
		String successMsg = eleutil.doGetText(regConfirmMsg);
		System.out.println(successMsg);
		
		  if (successMsg.contains(Constants.REGISTRATION_SUCCESS_MESSAGE)) 
		  {
		  eleutil.doClick(createNew); 
		  return true; 
		  }
		return false;
	}

}


