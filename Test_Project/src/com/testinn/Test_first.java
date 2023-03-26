package com.testinn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_first {
 
	 WebDriver driver;
	
	@BeforeClass
	public void set_Up()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Test_Project\\driver\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	
	}
	
	@Test
	public void Search()
	{
		WebElement element = ((WebDriver) driver).findElement(By.xpath("//input[@class='gLFyf']"));
		element.sendKeys("selenium");
		element.sendKeys(Keys.ENTER);
	}
	
	@AfterClass
	public void Tear_Down()
	{
		driver.quit();
	}
}
