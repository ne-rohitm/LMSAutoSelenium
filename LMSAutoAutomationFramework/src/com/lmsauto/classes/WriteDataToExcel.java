package com.lmsauto.classes;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteDataToExcel {
	
	public void WriteDataToExcelWithSheetName(int col, int row, String data, String sheetName) throws IOException, RowsExceededException, WriteException {
		
		File exlFile = new File(System.getProperty("user.dir")+"/TestData/testdata.xls");
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(exlFile);

        WritableSheet writableSheet = writableWorkbook.createSheet(sheetName, 0);
        
        Label lable = new Label(col, row, data);
        writableSheet.addCell(lable);
        writableWorkbook.write();
        writableWorkbook.close();
	}
}
