package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.ElementUtil;

public class SupplierFinanBusinessPage {
	
	private WebDriver driver ;
	private ElementUtil eleUtil;
	
	//SUPPLIER FINANCIAL & BUSINESS  -----Xpath's
		// date established needs to check
		private By dateEstablished = By.xpath("//*[contains(text(),'Date')]/.");  // it might not work and have to check this
		private By finanBusinessHeader = By.xpath("//li[contains(text(),'Financial')]");
		private By expHistory = By.xpath("//select[@name='supplierFinancialInfoVO.finDtl.expHistory']");
		private By totProjectsinHand  = By.name("supplierFinancialInfoVO.finDtl.totalProjectVal");
		private By maxProjectUndertake = By.name("supplierFinancialInfoVO");
		private By prevProCustName = By.name("PreviousProjectcustomerName");
		private By prevProjName = By.name("supplierFinancialInfoVO.finDtl.financeProjectDtl[0].projectName");
		private By prevProjLocation = By.name("supplierFinancialInfoVO.finDtl.financeProjectDtl[0].location");
		private By prevProjValue = By.name("supplierFinancialInfoVO.finDtl.financeProjectDtl[0].value");
		private By onGoProjCustName = By.name("ongoingProjectcustomerName");
		private By onGoProjName = By.name("supplierFinancialInfoVO.finDtl.financeProjectDtl[1].projectName");
		private By onGoProjLocation = By.name("supplierFinancialInfoVO.finDtl.financeProjectDtl[1].location");
		private By onGoProjValue = By.name("supplierFinancialInfoVO.finDtl.financeProjectDtl[1].value");
		private By netProfitCheck = By.name("supplierFinancialInfoVO.finDtl.isNetProfit");
		private By uploadFinStatement = By.xpath("//input[@name='file']");
		private By totAssetsYr1 = By.name("supplierFinancialInfoVO.finDtl.financeAssetDtl[0].yearOne");
		private By totAssetsYr2 = By.name("supplierFinancialInfoVO.finDtl.financeAssetDtl[0].yearTwo");
		private By totAssetsYr3 = By.name("supplierFinancialInfoVO.finDtl.financeAssetDtl[0].yearThree");
		private By totLiabilitiesYr1 = By.name("supplierFinancialInfoVO.finDtl.financeAssetDtl[1].yearOne");
		private By totLiabilitiesYr2 = By.name("supplierFinancialInfoVO.finDtl.financeAssetDtl[1].yearTwo");
		private By totLiabilitiesYr3 = By.name("supplierFinancialInfoVO.finDtl.financeAssetDtl[1].yearThree");
		// save popup needs to be handled here
		private By submitbutton = By.xpath("//button[@type ='submit']");  //----------->>>> save button
		private By previousOption = By.xpath("//ul[@class='pagination']/li[1]"); // -------->>> previous button
		
		public SupplierFinanBusinessPage(WebDriver driver)
		{
			this.driver = driver;
			ElementUtil eleutil = new ElementUtil (driver);

		}
		

}
