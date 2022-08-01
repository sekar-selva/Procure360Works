package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.ElementUtil;

public class SupplierFinalSubmissionPage {

	private WebDriver driver;
	private ElementUtil eleutil;
	
	//FINAL SUBMISSON 
	
		private By termsCheckBox = By.name("agreeTerms");
		private By submitButton = By.xpath("//button[contains(text(),'Submit')]");
		private By finalConfirmationMsg = By.xpath("//ngb-alert[@role='alert']");
		
		
		public SupplierFinalSubmissionPage()
		{
			this.driver = driver;
			ElementUtil eleutil = new ElementUtil(driver);
			
		}
	
}
