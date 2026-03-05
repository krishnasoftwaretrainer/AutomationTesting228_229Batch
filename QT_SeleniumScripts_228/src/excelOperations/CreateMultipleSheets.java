package excelOperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateMultipleSheets {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet1 = workbook.createSheet("Sample1");
		XSSFSheet sheet2 = workbook.createSheet("Sample2");
		XSSFSheet sheet3 = workbook.createSheet("Sample3");
		XSSFSheet sheet4 = workbook.createSheet("Sample4");

		FileOutputStream fileout = new FileOutputStream(
				"D:\\QT\\QT_Selenium_228,229\\ExcelFiles\\CreateMultipleSheets.xlsx");
		workbook.write(fileout);

		System.out.println("Sheets created successfully");

	}

}
