package com.vitger.genric.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateVendor extends BaseClass1{
	@Test(enabled=false)
	public void createVendorDetails() throws Throwable{
	
		Filelib fb =new Filelib();
		String sc =fb.getExcelData("sheet1",2,0);
		String email =fb.getExcelData("sheet1",2,1);
		String Mobile=fb.getExcelData("sheet1",2,2);
		String Address=fb.getExcelData("sheet1",2,3);
		String city=fb.getExcelData("sheet1",2,4);
		String State=fb.getExcelData("sheet1",2,5);
		String Country=fb.getExcelData("sheet1",2,6);

	  Actions act = new Actions(driver);
	  WebElement web = driver.findElement(By.xpath("//a[text()='More']"));
     act.moveToElement(web);
     act.perform();
     driver.findElement(By.xpath("//a[@name='Vendors']")).click();
     driver.findElement(By.xpath("//img[@alt='Create Vendor...']")).click();
     driver.findElement(By.xpath("//input[@name='vendorname']")).sendKeys(sc);
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
     driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Mobile);
     driver.findElement(By.xpath("//textarea[@name='street']")).sendKeys(Address);
     driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
     driver.findElement(By.xpath("//input[@name='state']")).sendKeys(State);
     driver.findElement(By.xpath("//input[@name='country']")).sendKeys(Country);
     //GL Account drop Down 
     WebElement GL = driver.findElement(By.xpath("//select[@name='glacct']"));
     Select sel = new Select(GL);
     sel.selectByVisibleText("303-Interest-Income");
   //save 
     driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	
	}
     
     
}