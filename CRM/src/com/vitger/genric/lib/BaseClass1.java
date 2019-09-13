package com.vitger.genric.lib;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
public static WebDriver driver;
Filelib fb = new Filelib();
	@BeforeClass
public void configBC()throws Throwable{
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver\\geckodriver.exe");
		String browser =fb.GetPropertyDataFile("browser");
		System.out.println("launch the Browser");
		driver=new FirefoxDriver();
	}
		@BeforeMethod 
		public void ConfigBM() throws Throwable
		{
			
			 String URL=fb.GetPropertyDataFile("url");
			 String username= fb.GetPropertyDataFile("username");
			 String password=fb.GetPropertyDataFile("password");
			 
			    
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get(URL);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		}
		
		@AfterMethod
	    public void beforeMethod() throws Throwable
		{
	    Thread.sleep(10000);
	    Actions act = new Actions(driver);
     	WebElement sign = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    act.moveToElement(sign);
	    act.perform();
	    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	   }
		@AfterClass	
		public void configAC()
		{
			driver.quit();
			
		 }
}
