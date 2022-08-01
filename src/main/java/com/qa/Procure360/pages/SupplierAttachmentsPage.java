package com.qa.Procure360.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Procure360.util.ElementUtil;

public class SupplierAttachmentsPage {
	private WebDriver driver;
	private ElementUtil eleutil;
	
	
	//ATTACHMENTS SECTION -------------Xpath's
	
		private By attachmentsHeadertext = By.xpath("//li[contains(text(),'Supplier')]");
		private By docType = By.name("docsCategory");
		private By docDescription = By.name("docsDesc");
		private By uploadSupportDocs = By.name("file");
		//private By savebutton = By.xpath("//button[@type ='submit']");  //----------->>>> save button
		//private By dataSavedSuccessMessgae = By.xpath("//ngb-alert[@role='alert']");  //----------------->>>>> common alert message
		private By nextOption = By.xpath("//ul[@class='pagination']/li[2]"); // --------->>>> next button
		private By previousOption = By.xpath("//ul[@class='pagination']/li[1]"); // -------->>> previous button
		
		
		public  SupplierAttachmentsPage()
		{
			this.driver = driver;
			eleutil = new ElementUtil(driver);
		}

}
