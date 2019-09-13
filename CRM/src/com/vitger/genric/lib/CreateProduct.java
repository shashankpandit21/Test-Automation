package com.vitger.genric.lib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateProduct extends BaseClass1 {
	@Test
	public void createProductDetails() throws Throwable{
		
		Filelib lb =new Filelib();
		
		String pname=lb.getExcelData2("ProductName",1,0);
		String price=lb.getExcelData2("ProductName",1,1);
		System.out.println(pname);
		System.out.println(price);
	
		
		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
	
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(pname);
		driver.findElement(By.xpath("//input[@name='unit_price']")).sendKeys(price);
		
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		Set<String> set1 = driver.getWindowHandles();
      	Iterator<String> it = set1.iterator();
       	String parentWindow = it.next();
       	String childWindow = it.next();
         driver.switchTo().window(childWindow);
        Thread.sleep(3000);
         driver.findElement(By.xpath("//a[text()='Qspider']")).click();
        //driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.switchTo().window(parentWindow);
        
		
	            
		 // driver.findElement(By.xpath("//input[@id='my_file_element']")).click();
		 // Runtime.getRuntime().exec("C:\\Users\\Test\\Desktop\\Product.exe");
		  
		 driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	            
	
        

	

	}
	}
