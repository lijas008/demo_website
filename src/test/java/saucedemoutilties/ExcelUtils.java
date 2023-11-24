package saucedemoutilties;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static String getCellValues(String file_path, String sheet, int r, int c) {
		try {
			FileInputStream fi = new FileInputStream(file_path);
			XSSFWorkbook wb = new XSSFWorkbook(fi);

			XSSFCell cell = wb.getSheet(sheet).getRow(r).getCell(c);
			if (cell.getCellType() == CellType.STRING) {
				return cell.getStringCellValue();
			} else {
				double v = cell.getNumericCellValue();
				int value = (int) v;
				return String.valueOf(value);
			}

		} catch (Exception e) {
			return "";
		}
	}

	public static int getRowCount(String file_path, String sheet) {
		try {
			FileInputStream fi = new FileInputStream(file_path);
			XSSFWorkbook wb = new XSSFWorkbook(fi);

			return wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			return 0;
		}
	}

}
