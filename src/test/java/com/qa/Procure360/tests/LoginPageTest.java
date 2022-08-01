package com.qa.Procure360.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.Procure360.util.Constants;

public class LoginPageTest extends BaseTest {

		@Test ()
		public void loginPageTitleTest()
		{
			String title =loginpage.loginPageTitle();
			System.out.println("Page Title is: " +title);
			Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
		}
		
		@Test ()
		public void loginPageUrlTest()
		{
			String url = loginpage.getLoginPageURL();
			System.out.println("Login page url:" + url );
			Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_FRACTION_URL));
		}
		
		@Test ()
		public void createNewlinkExist()
		{
			Assert.assertTrue(loginpage.isCreateNewLinkExist());
		}
		@Test  ()
		public void doLogin() {
			homepage=loginpage.doLogin(prop.getProperty("userId").trim(),prop.getProperty("pwd").trim());
			//Assert.assertTrue(loginpage.isForgotPwdLinkExist());
		}
		
}
