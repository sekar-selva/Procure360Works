package com.qa.Procure360.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Procure360.util.Constants;
import com.qa.Procure360.util.ExcelUtil;



public class SupplierInfoPageTest extends BaseTest {
	
	@BeforeClass
	public void supplierinfoPageSetup()
	{
		homepage=loginpage.doLogin(prop.getProperty("userId"), prop.getProperty("pwd"));
		infoPage=	homepage.navToSupplierInfoPage();
	}

	@DataProvider 
	public Object[][] getSupplierInfoTestData  ()
	{
		Object supplierInfoData [][]= ExcelUtil.getTestData(Constants.SUPPLIER_INFO_SHEET_NAME);
	     return supplierInfoData;
	}
	@Test(dataProvider = "getSupplierInfoData" )
		public void supplierInformationDetails(String parentCompanyName, String orgWebsite, String issuedBy, String location, String firstName, 
       		  String middleName, String lastName,String jobTitle, String mobileNumber, String email) {
				Assert.assertTrue(infoPage.SupplierInformation(parentCompanyName, orgWebsite, issuedBy, location, firstName, middleName, lastName, jobTitle, mobileNumber, email));
		//infoPage.SupplierInformation("Disney", "www.amazon.com", "Government", "Chennai", "Steve", "Anders", "Jobs"	, "Senior Director", "+919994528193", "Procure360QA298@yopmail.com");
		
		}
}
