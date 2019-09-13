package com.vitger.genric.lib;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateOrg extends BaseClass1{
@Test
public void createOrganisation() throws Throwable{
	Filelib LB= new Filelib();
	String oname=LB.getExcelData3("OrganizationName",1,0);
	String emailid=LB.getExcelData3("OrganizationName",1,1);
	driver.findElement(By.xpath("//a[text()='Organizations']")).click();
    driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(oname);
	driver.findElement(By.xpath("//input[@name='email1']")).sendKeys(emailid);
	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
}
}
