package com.qa.Procure360.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.qa.Procure360.util.Constants;
import com.qa.Procure360.util.ElementUtil;

public class SupplierHomePage {
	public WebDriver driver;
	public ElementUtil eleutil;

	private By headerText = By.xpath("//h1[starts-with(text(),'Welcome')]");
	private By applicationLogo = By.xpath("//img[@class='img-fluid']");
	private By menuOption = By.xpath("(//a[normalize-space()='Menu'])[1]");
	private By homeOption = By.xpath("//li[@class='nav-item active']//a[@class='nav-link']");
	// private By contactusOption =By.xpath("//*[@id='navbarSupportedContent']/ul/li[3]/a");
	private By contactusOption = By.xpath("//a[starts-with(text(),'Contact us')]");
	private By logoutOption = By.xpath("(//li[@class='nav-item']//a[@class='nav-link'])[2]");
	// private By logoutOption = By.xpath("//a[starts-with(text(),'Logout')]");
	private By langtranslation = By.xpath("//span[@class='hrcAhc']");
	private By moduleList = By.xpath("//span[@class='menu-name']");
	private By subMenuoption = By.id("navbarDropdownMenuLink");
	private By subMenuModules = By.className("//a[@class='dropdown-item']");
	private By copyRightsText = By.xpath("//div[@class='copyright']");
	private By supplierReg= By.xpath("//span[normalize-space()='Supplier Registration']");
	
	
	public SupplierHomePage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
	}

	public String getHomePageTitle() {
		return eleutil.doGetPageTitleIs(Constants.HOME_PAGE_TITLE, Constants.DEFAULT_TIME_OUT);

	}

	public String getPageUrl() {
		return eleutil.waitForUrlContains(Constants.HOME_PAGE_FRACTION_URL, Constants.DEFAULT_TIME_OUT);
	}

	public String getHomePageHeader() {
		eleutil.waitForElementPresence(headerText, Constants.DEFAULT_TIME_OUT);
		return eleutil.doGetText(headerText);
	}

	public boolean isLogoPresent() {
		eleutil.waitForElementPresence(applicationLogo, Constants.DEFAULT_TIME_OUT);
		return eleutil.doIsDisplayed(applicationLogo);
	}

	public boolean isMenuPresent() {
		
		return eleutil.doIsDisplayed(menuOption);
	}

	public boolean isHomePresent() {
		return eleutil.doIsDisplayed(homeOption);
	}

	
	  public boolean isContactusPresent() 
	  { 
		  eleutil.waitForElementPresence(contactusOption, Constants.DEFAULT_TIME_OUT);
		  return eleutil.doIsDisplayed(contactusOption); }
	 

	public boolean isLogoutPresent() {
		return eleutil.doIsDisplayed(logoutOption);
	}

	public boolean isLanguageTranslationPresent() {
		return eleutil.doIsDisplayed(langtranslation);
	}
	
	public String getCopyrightsText() {
		eleutil.waitForElementPresence(copyRightsText, Constants.DEFAULT_TIME_OUT);
		return eleutil.doGetText(copyRightsText);
	}
	public List<String> menuTitleCard() {
		List<WebElement> TitlecardList = eleutil.waitForElementsVisible(moduleList, Constants.DEFAULT_TIME_OUT);
		List<String> MenuList = new ArrayList<String>();
		for (WebElement e : TitlecardList) {
			String title = e.getText();
			System.out.println(title);
			MenuList.add(title);
		}
		return MenuList;
	}
	/*
	 * public List<String> subMenuList() throws InterruptedException {
	 * eleutil.doClick(subMenuoption); Thread.sleep(3000); List<WebElement>
	 * TitlecardSubmenuList =
	 * eleutil.waitForElementsVisible(subMenuModules,Constants.DEFAULT_TIME_OUT);
	 * List<String> subMenuModules = new ArrayList<String>(); for (WebElement e :
	 * TitlecardSubmenuList) { String submenutitle = e.getText();
	 * System.out.println("Sub Menu's are:"+submenutitle); } return subMenuModules;
	 * }
	 */
	
	public SupplierInformationPage navToSupplierInfoPage() 
	{
		eleutil.waitForElementPresence(supplierReg, 30);
		eleutil.doClick(supplierReg);
		// when ever clicking on any button or link, this method responsibility to return next landing page
		return new SupplierInformationPage(driver);
	}
	
	public boolean logout()
	{
		if (isLogoutPresent()) {
			System.out.println("Log out option is present");
			return true;
		}
			return false;
		}
	}

