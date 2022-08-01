package com.qa.Procure360.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public Properties prop;
	public OptionsManager optionsManager;
	public static String highlight;
	
	
	/**
	 * This method is use to initialize the browser using the provided browser name
	 * @param browserName
	 * @return this returns the web driver
	 */
	public WebDriver init_driver(Properties prop) {
		String browserName = prop.getProperty("browser").trim();
		highlight = prop.getProperty("highlight").trim();
		System.out.println("Browser name is:" + browserName);
		optionsManager = new OptionsManager(prop);
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(optionsManager.getChromeOptions());
			
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(optionsManager.getFirefoxOptions());
		} 
		else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please pass the right browser:" +browserName);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("PreProd_url").trim());
		LogEntries logentry = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry>	logs =logentry.getAll();
		for(LogEntry e : logs)
		{
			//System.err.println(e);
			System.out.println("Message is: " +e.getMessage());
        	System.out.println("Level is: " +e.getLevel());
		}
		//driver.get(prop.getProperty("PreProd_url").trim());
		return driver;
	}
	
	/**
	 * This method is used to initialize the properties
	 * @return return this Properties class reference
	 */
	public Properties init_Prop()
	{
		 prop = new Properties();
		 try {
			FileInputStream fs = new FileInputStream("D:\\Automation\\Procure360_QA\\src\\test\\resources\\Configurationfiles\\Config.properties");
			prop.load(fs);
		 
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return prop;
		
	}

}
