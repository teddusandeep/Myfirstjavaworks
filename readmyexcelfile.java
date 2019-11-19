package com.demo;

import java.io.File;
import java.io.FileInputStream;
import com.demo1.XSSFSheet;
import com.demo1.XSSFWorkbook;
import com.google.common.collect.Table.Cell;

import jxl.Sheet;

import java.io.FileNotFoundException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Row;

public class readmyexcelfile {

	public static void main(String args[]) throws Exception  
	{  
	//File Firstsheeet = new File("C:\\Users\\steddu\\Documents\\test_data.xlsx");
	File Fis  =  new File("C:\\Users\\steddu\\Desktop\\data1.xlsx");
	FileInputStream Firstsh = new FileInputStream(Fis);
	com.demo1.XSSFWorkbook workbook = new XSSFWorkbook(Firstsh);
   	XSSFSheet firstSheet = workbook.getSheetAt(0);
   	System.out.println("number of sheets::"+ workbook.getNumberOfSheets());
    String data0 = firstSheet.getRow(0).getCell(0).getStringCellValue();
    System.out.println("DATA from Excel"+data0);
        	
		/*
		 * Iterator iterator = firstSheet.iterator();
		 * 
		 * while (iterator.hasNext()) { Row nextRow = iterator.next(); //Iterator<Cell>
		 * 
		 * cellIterator = nextRow.cellIterator();
		 * 
		 * while (cellIterator.hasNext()) {
		 * 
		 * Cell cell = cellIterator.next();
		 * 
		 * switch (cell.getCellType()) { case Cell.CELL_TYPE_STRING:
		 * System.out.print(cell.getStringCellValue()); break; case
		 * Cell.CELL_TYPE_BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
		 * case Cell.CELL_TYPE_NUMERIC: System.out.print(cell.getNumericCellValue());
		 * break; } System.out.print(" - "); } System.out.println(); }
		 * 
		 * Firstsh.close();
		 */
		  }

}
