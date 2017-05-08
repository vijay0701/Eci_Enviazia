package com.utils.Pesection;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import static com.utils.Pesection.Appconfig.EXCEL_PATH;

public class ExcelReader {
	private Workbook workBook;
	public ExcelReader(String path) {
		try {
			workBook = Workbook.getWorkbook(new File(System.getProperty("user.dir") + EXCEL_PATH + path));
		} catch (BiffException | IOException e) {

		}
	}
	
	
}
