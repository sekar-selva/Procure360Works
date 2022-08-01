package com.qa.Procure360.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.qa.Procure360.factory.DriverFactory;
import com.qa.Procure360.pages.SupplierRegistrationPage;
import com.qa.Procure360.pages.SupplierHomePage;
import com.qa.Procure360.pages.SupplierInformationPage;
import com.qa.Procure360.pages.SupplierLoginPage;

public class BaseTest  {
	WebDriver driver;
	DriverFactory df;
	Properties prop ;
	SupplierLoginPage loginpage;
	SupplierHomePage homepage;
	SupplierRegistrationPage regPage;
	SupplierInformationPage infoPage;
	
	@BeforeTest
	public void setUp()
	{
		df = new DriverFactory();
		prop =df.init_Prop();
		driver =df.init_driver(prop);
		loginpage = new SupplierLoginPage(driver);
		
	}
	
	/*
	 * @AfterTest public void tearDown() { driver.quit(); }
	 */

}
