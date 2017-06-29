package com.lmsauto.classes;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelData {

	public String getCellDataWithRowColAndSheetName(int col, int row, String sheetName) throws BiffException, IOException {
		Workbook workbook = Workbook.getWorkbook(new File(System.getProperty("user.dir")+"/TestData/testdata.xls"));
		Sheet sheet = workbook.getSheet(sheetName);
		Cell cell = sheet.getCell(col, row);
		return cell.getContents();
	}
	
	public String getCellDataWithRowColAndSheetNumber(int col, int row, int sheetNumber) throws BiffException, IOException {
		Workbook workbook = Workbook.getWorkbook(new File(System.getProperty("user.dir")+"/TestData/testdata.xls"));
		Sheet sheet = workbook.getSheet(sheetNumber);
		Cell cell = sheet.getCell(col, row);
		return cell.getContents();
	}
	
//	public static void main(String[] args) throws BiffException, IOException {
//		// TODO Auto-generated method stub
//		ReadExcelData red = new ReadExcelData();
//		String data = red.getCellDataWithRowColAndSheetName(4,9,"First");
//		System.out.println(data);
//		
//		String data1 = red.getCellDataWithRowColAndSheetNumber(4, 9, 0);
//		System.out.println(data1);
//		
//	}

}
