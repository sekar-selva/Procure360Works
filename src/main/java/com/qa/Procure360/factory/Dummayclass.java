package com.qa.Procure360.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummayclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://65.1.183.131/Procure360/#/login");
		driver.findElement(By.xpath("//input[@name='loginInfoVO.username']")).sendKeys("AudiIndia");
		driver.findElement(By.className("login100-form-btn")).click();
		driver.findElement(By.name("loginInfoVO.password")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String header =driver.findElement(By.xpath("//h1[starts-with(text(),'Welcome')]")).getText();
		System.out.println(header);
		driver.findElement(By.xpath("(//div[@class='dashboard-card'])[1]")).click();
		driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")).click();
		

	}

}
