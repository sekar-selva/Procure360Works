package com.qa.Procure360.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Procure360.util.Constants;
import com.qa.Procure360.util.ExcelUtil;

public class RegistrationPageTest extends BaseTest {

	
	
	@BeforeClass
	public void regSetup()
	{
		regPage =loginpage.navigateToRegistrationPage();
	}
	
	/*
	 * public String getRandomEmail() { Random genrandom = new Random(); String
	 * email = "Procure360test" +genrandom.nextInt(1000)+"yopmail.com"; return
	 * email; }
	 */
	  @DataProvider 
	  public Object [][] getRegTestData() {
	     Object regData [][]= ExcelUtil.getTestData(Constants.REGISTER_SHEET_NAME);
	     return regData;
	  }
	 
	
	@Test (dataProvider ="getRegTestData")
	public void supplierRegTest(String companyName, String tradeLicenseNo, String loginId, String passWord,String confirmpassWord, 
																	String companyEmailId, String firstName, String middleName, String lastName, String designation,
																	String workPhoneNumber, String mobileNumber, String eMail) {
		/*
		 * Assert.assertTrue(regPage.supplierInformation("FujiXerox", "846784JHFJSJ",
		 * "FujiXerox", "Welcome@123", "Welcome@123", "fuji@yopmail.com", "Zuhu", "Yan",
		 * "Hosa", "UX Engineer", "987968769786", "68797867956795",
		 * "fuji@yopmail.com"));
		 */
		
			  Assert.assertTrue(regPage.supplierInformation(companyName, tradeLicenseNo, loginId, passWord, confirmpassWord,
					  companyEmailId, firstName, middleName, lastName, designation, workPhoneNumber, mobileNumber, eMail));
			 
		
		}
		}


	


