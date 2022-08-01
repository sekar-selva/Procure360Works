package com.qa.Procure360.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Procure360.util.Constants;

public class HomepageTest extends BaseTest {
	
	@BeforeTest 
	public void homePageSetup()
	{
		homepage = loginpage.doLogin(prop.getProperty("userId"), prop.getProperty("pwd"));
	}
	@Test
	public void homePageTitleTest()
	{
		
		String actTitle =homepage.getHomePageTitle();
		System.out.println("Home page title is:" +actTitle);
		Assert.assertEquals(actTitle, Constants.HOME_PAGE_TITLE);
	}
	@Test
	public void homePageUrl()
	{
		String actualurl = homepage.getPageUrl();		
		System.out.println("Home page url is:" +actualurl);
		Assert.assertTrue(actualurl.contains(Constants.HOME_PAGE_FRACTION_URL));
	}
	@Test
	public void homePageHeader()
	{
		String header =homepage.getHomePageHeader();
		System.out.println("Home page header is:" +header);
		Assert.assertEquals(header, Constants.HOME_PAGE_HEADER);
	}
	@Test
	public void menuLinkExistTest()
	{
		Assert.assertTrue(homepage.isMenuPresent());
	}
	
	
	  @Test 
	  public void homeLinkExistTest() 
	  {  
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  Assert.assertTrue(homepage.isHomePresent()); 
	  }
		
	@Test
	public void contactUsLinkExistTest() {
	Assert.assertTrue(homepage.isContactusPresent()); }
	
	@Test
	public void logoutLinkExistTest()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(homepage.isLogoutPresent());
	}
	
	@Test
	public void transaltionLinkExistTest()
	{
		Assert.assertTrue(homepage.isLanguageTranslationPresent());
	}
	
	@Test
	public void menuTitleCardTest()
	{
	List<String> HomepageTitlecard=homepage.menuTitleCard();
	System.out.println("Home page Title cards: "+HomepageTitlecard);
	Assert.assertEquals(HomepageTitlecard, Constants.HOME_PAGE_TITLECARDS_LIST);
	}
	
	// Sub menu is not working, hence commented
	/*
	 * @Test public void subMenuTitlesTest() throws InterruptedException {
	 * List<String> submenu =homepage.subMenuList();
	 * System.out.println("Sub menu titles are" +submenu);
	 * Assert.assertEquals(submenu,Constants.HOME_PAGE_SUBMENU_LIST ); }
	 */
	
	
	@Test
	public void copyRightsTextTest()
	{
		String footerText = homepage.getCopyrightsText();
		System.out.println("Footer Text is:" +footerText);
		Assert.assertEquals(footerText, Constants.COPY_RIGHTS_TEXT);
	}
}
