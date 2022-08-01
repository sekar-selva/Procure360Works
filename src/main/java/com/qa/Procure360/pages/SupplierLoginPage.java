package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.Constants;
import com.qa.Procure360.util.ElementUtil;

public class SupplierLoginPage {

	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By userName = By.xpath("//input[@name='loginInfoVO.username']");
	private By nextButton = By.xpath("//button[@class='login100-form-btn']");
	private By passWord = By.xpath("//input[@type='password']");
	private By signinBtn = By.xpath("//button[@class='login100-form-btn']");
	private By forgotPwdLink = By.linkText("Forgot Password?");
	private By createNew = By.linkText("Create now!");
	
	public SupplierLoginPage(WebDriver driver) {
		this.driver = driver;
		eleutil= new ElementUtil(driver);
	}
	
	public String loginPageTitle() {
		return eleutil.doGetPageTitleIs(Constants.LOGIN_PAGE_TITLE, Constants.DEFAULT_TIME_OUT);			
	}
	
	public String getLoginPageURL() {
		return eleutil.waitForUrlContains(Constants.LOGIN_PAGE_FRACTION_URL, Constants.DEFAULT_TIME_OUT);
				
	}
	
	public boolean isForgotPwdLinkExist() {
		return eleutil.doIsDisplayed(forgotPwdLink);
	}
	public boolean isCreateNewLinkExist() {
		return eleutil.doIsDisplayed(createNew);
	}
	
	public SupplierHomePage doLogin(String  userId, String pwd) {
		eleutil.doSendKeys(userName, userId);
		eleutil.doClick(nextButton);
		eleutil.doSendKeys(passWord, pwd);
		//eleutil.waitForElementPresence(forgotPwdLink, 10);
		if (eleutil.doIsDisplayed(forgotPwdLink)) {
			eleutil.doClick(signinBtn);
			System.out.println("Supplier logged in succesfully");
		}
		return new SupplierHomePage(driver);		
		
	}
	public SupplierRegistrationPage navigateToRegistrationPage()
	{
		eleutil.doClick(createNew);
		return new SupplierRegistrationPage(driver);
	}
}
