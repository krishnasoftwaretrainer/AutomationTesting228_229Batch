package excelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getPhysicalNumberOfRows_getLastRowNum {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\QT\\QT_Selenium_228,229\\ExcelFiles\\SwagLoginTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("abcdef");
		int row = sheet.getPhysicalNumberOfRows();  //6=0 1 2 3 4 5
		int lastrownum = sheet.getLastRowNum(); //5=0 1 2 3 4 5
		System.out.println("Physical Number of Rows: "+row);
		System.out.println("Last Row Number: "+lastrownum);
		
	}

}
