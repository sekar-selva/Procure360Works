package com.qa.Procure360.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cal {
	
	
	static WebDriver driver;
	
	public static void selectDate(String expYear, String day)
	{
		//String actMonthYear = driver.findElement(By.xpath("//div[@class='bs-datepicker-head']")).getText();
		String actYear= driver.findElement(By.xpath("//span[@xpath='1']")).getText();
		System.out.println(actYear);
		while (!actYear.equals(expYear)) {
			driver.findElement(By.xpath("//span[contains(text(),'‹')]")).click();
			actYear= driver.findElement(By.xpath("//span[@xpath='1']")).getText();
		}
		driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])["+day+"]")).click();
	}
	public static void main (String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://65.1.183.131/Procure360/#/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("loginInfoVO.username")).sendKeys("ProcureQA612");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='menu-name'])[1]")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Supplier Registration']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//img[@data-action-type='edit']")).click();
		driver.findElement(By.xpath("//input[@name='estdDate']")).click();
		Thread.sleep(3000);
		selectDate("2021", "15");
		
		/*List<WebElement> days = driver.findElements(By.xpath("//div[@role='application']//td"));
		for (WebElement e : days) {
			if (e.getText().equals("12")) {
				e.click();
				break;
				
			}*/
			
			
		}
		
	}

