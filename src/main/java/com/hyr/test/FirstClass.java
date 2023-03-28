package com.hyr.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {
	public WebDriver driver1;
	public WebDriver driver2;
	public WebDriver driver3;
	
	
	@Test
//	public void TestGoogle() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
//		System.out.println(driver.getTitle());
//		Thread.sleep(5000);
//		driver.quit();
	
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		 WebDriver driver1;
		 WebDriver driver2;
		 WebDriver driver3;
		
		driver1= new ChromeDriver();
		driver2 = new EdgeDriver();
		driver3 = new FirefoxDriver();
		
		
		driver1.get("https://www.google.com/");
		driver2.get("https://www.google.com/");
		driver3.get("https://www.google.com/");
	}
		
		
		
	}


