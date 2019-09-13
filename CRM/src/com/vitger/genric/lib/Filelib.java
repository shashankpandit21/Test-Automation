package com.vitger.genric.lib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	String ppath = "C:\\Users\\Test\\Desktop\\CommonData.properties";
	String Epath="./testdata/Vendors.xlsx";
	/**
	 * Get the properties file key value based on Your Argument 
	 * param key
	 * @param return
	 */
	public String GetPropertyDataFile(String Key) throws Throwable{ 

	FileInputStream fis = new FileInputStream(ppath);
	Properties pobj= new Properties();
	pobj.load(fis);
	String Data = pobj.getProperty(Key);
	return Data;
	}

	//Read data from Excel 

	/**
	 * It is used to Read the data from ExcelSheet(book1.xls)
	 * based on your argument 
	 * @param row
	 * @param SheetName
			 * @param rowNum
			 * @param colNum
			 * @return
			 * @throws Throwable
	 */
		
 public String getExcelData(String SheetName,int RowNum,int CellNum)throws Throwable{
			
	FileInputStream fis= new FileInputStream(Epath);
	 Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheet(SheetName);
	  Row rw =sh.getRow(RowNum);
	  Cell cel=rw.getCell(CellNum);
	  String fs = cel.getStringCellValue();
	  return fs;
}

 public String getExcelData2(String SheetName,int RowNum,int CellNum)throws Throwable{
	 FileInputStream fis= new FileInputStream(Epath);
	 Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheet(SheetName);
	  Row rw =sh.getRow(RowNum);
	  Cell cel=rw.getCell(CellNum);
	  String fs = cel.getStringCellValue();
	  return fs;
}
 public String getExcelData3(String SheetName,int RowNum,int CellNum)throws Throwable{
	 FileInputStream fis= new FileInputStream(Epath);
	 Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh = wb.getSheet(SheetName);
	  Row rw =sh.getRow(RowNum);
	  Cell cel=rw.getCell(CellNum);
	  String fs = cel.getStringCellValue();
	  return fs;
 }

}
